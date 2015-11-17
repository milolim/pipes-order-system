/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesordersystem;

/**
 *
 * @author up729874(Nathaniel-Pankhurst)
 * @author up7235110(Milo-Robson)
 * 
 */
public class Pipe {
    
    private int grade, colours;
    private boolean insulation, reinforcement, resistance, isValidPipe;
    private double length, radius, price;   //Length and radius are in inches
    private String reasonNotValid = "";     //Price is in pounds
    
    public Pipe(int piGrade, int piColours, boolean piInsulation,
                boolean piReinforcement, boolean piResistance,
                double piLengthMetre, double piRadius) {
            grade = piGrade;
            colours = piColours;
            insulation = piInsulation;
            reinforcement = piReinforcement;
            resistance = piResistance;
            length = piLengthMetre * 39.37;
            radius = piRadius;
          
            isValidPipe = calculateValidity();
           
            if (isValidPipe) {
                double volume = calculatePlasticVolume();
                price = calculatePrice(volume);
            }
    }
    
    public int getGrade() {
        return grade;
    }
    
    public int getNumColours() {
        return colours;
    }
    
    public boolean getInsulation() {
        return insulation;
    }
    
    public boolean getReinforcement() {
        return reinforcement;
    }
    
    public boolean getResistance() {
        return resistance;
    }
    
    public double getPrice() {
        return price;
    }
    
    public boolean isValid() {
        return isValidPipe;
    }
    
    public String getReasonNotValid() {
        return reasonNotValid;
    }
    
    private boolean calculateValidity()  {
        
        int insulationAsInt = (insulation) ? 1 : 0;
        int reinforcementAsInt = (reinforcement) ? 1 : 0;
        
        int pipeId = Integer.parseInt(
                     "" + grade + colours 
                        + insulationAsInt 
                        + reinforcementAsInt
                        );
                
        int validTypes[] = {1000, 2000, 3000,              //Type I
                            2100, 3100, 4100,              //Type II
                            2200, 3200, 4200, 5200,        //Type III
                            2210, 3210, 4210, 5210,        //Type IV
                            3211, 4211, 5211};             //Type V
        
        /*
            1. Grade 1 and any colour/insulation/reinforcement is disallowed.
            2. Grade 2 and reinforcement is disallowed.
            3. Grade 4 and 0 colours is disallowed.
            4. Grade 5 and 0/1 colours is disallowed.
            5. 0 colours and insulation/reinforcement is diallowed.
            6. 1 colour and insulation/reinforcement is disallowed.
        
            Make a numberline of all possible and mark red-disallowed, green-allowed.
        */
        
        boolean validPipeType = false;
        
        for (int i=0; i<validTypes.length; i++) {
            if (validTypes[i] == pipeId) {
                validPipeType = true;
            }
        }
        
        if (!validPipeType) {
            reasonNotValid = calculateReasonNotValid(pipeId);
        }
        
        return validPipeType;
    }
    
    private String calculateReasonNotValid(int pipeId) {
        
        String errorMessage;
        
        if (1000<pipeId && pipeId<2000) {
            
            errorMessage = "Plastic grade 1 cannot be combined with any colour, insulation, or reinforcement.";
            
        } else if (4000<=pipeId && pipeId<=4011) {
            
            errorMessage = "Plastic grade 4 cannot be combined with no colour.";
            
        } else if (5000<=pipeId && pipeId<=5111) {
            
            errorMessage = "Plastic grade 5 can only be combined with 2 colours.";
            
        } else switch (pipeId) {
            case 2001: case 2011:
            case 2101: case 2111:
            case 2201: case 2211:
                
                errorMessage = "Plastic grade cannot be combined with reinforcement.";
                break;
                
            case 2010: case 3001:
            case 3010: case 3011:
            case 2110: case 3101: 
            case 3110: case 3111: 
            case 4101: case 4110: 
            case 4111:
                
                errorMessage = "Insulation and reinforcement can only be applied to pipes with 2 colours.";
                break;
                
            case 3201: case 4201: 
            case 5201:
                
                errorMessage = "A pipe cannot have reinforcement if insulation is not present.";
                break;
                
            default:
                
                errorMessage = "Unknown.";
                break;
                
        }
        
        return errorMessage;
    }
    
    private double calculatePlasticVolume() {
        
        //Calculate total volume of cylinder
        double volume = calculateCylinderVolume(radius);
        
        //Calculate volume of inner cyliner (empty space inside pipe)
        double innerRadius = radius * 0.9;
        double innerVolume = calculateCylinderVolume(innerRadius);
        
        //Return the volume of plastic needed for pipe
        return volume - innerVolume;
    }
    
    private double calculateCylinderVolume(double radius) {
        return Math.PI * (0.5 * radius) * (0.5 * radius);
    }
    
    private double calculatePrice(double volume) {
        
        double gradeCosts[] = {0, 0.30, 0.32, 0.35, 0.40, 0.46};
        
        //Calculates base price
        double basePrice = volume * gradeCosts[grade];
        double pipePrice = basePrice;
        
        //Determines wether the extra is selected, then adds it to the price
        pipePrice += ((insulation) ? 1 : 0) * 0.14 * basePrice;
        pipePrice += ((reinforcement) ? 1 : 0) * 0.15 * basePrice;                
        pipePrice += ((resistance) ? 1 : 0) * 0.12 * basePrice;

        switch (colours) {
            case 1:
                pipePrice += 0.12 * basePrice;
                break;
            case 2:
                pipePrice += 0.17 * basePrice;
                break;
            default : break;
        }
        
        //Rounds to 2dp
        pipePrice *= 100;
        pipePrice = Math.round(pipePrice);
        pipePrice = (double)pipePrice / (double)100;
        
        return pipePrice;
    }
    
}