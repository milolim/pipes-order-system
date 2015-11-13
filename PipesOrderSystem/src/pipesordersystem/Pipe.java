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
    
    /*
    
    31/10/2015
    Changes:
    
        - Removed empty Pipe constructor, I can see it ever being used.
        - Set calculateType() to private.
        - Finished calculateType() method.
        - Added the needed getters and setters.
    
    */
    
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
        
        String pipeId = "" + grade + colours + insulationAsInt 
                      + reinforcementAsInt;
                
        String validTypes[] = {"1000", "2000", "3000",              //Type I
                               "2100", "3100", "4100",              //Type II
                               "2200", "3200", "4200", "5200",      //Type III
                               "2210", "3210", "4210", "5210",      //Type IV
                               "3211", "4211", "5211"};             //Type V
        
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
        
        if (validPipeType) {
            reasonNotValid = calculateReasonNotValid(pipeId, validTypes);
        }
        
        return validPipeType;
    }
    
    private String calculateReasonNotValid(String pipeId, String[] validTypes) {
        
        String conflict1 = "Reason unidentified.";
        String conflict2 = "";
        String sGrade = "" + grade;
        
        switch (grade) {
            
            case 1:
                
                conflict1 = "Plastic grade \"1\"";
                
                if (colours != 0) {
                    conflict2 = "colours \"" + colours + "\"";
                } else if (insulation) {
                    conflict2 = "inner insulation";
                } else if (reinforcement) {
                    conflict2 = "outer insulation";
                }
                
                break;
            
            case 2:
                
                if (reinforcement) {
                    conflict1 = "Plastic grade \"2\"";
                    conflict2 = "outer insulation";
                } else if (colours == 0 || colours == 1) {
                    
                    conflict1 = "Plastic grade \"2\", colours \"" 
                              + colours + "\",";
                    
                    if (insulation) {
                        conflict2 = "inner insulation";
                    } else if (reinforcement) {
                        conflict2 = "outer insulation";
                    }
                 //UNFINISHED!!   
                }
                
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        
        String errorMessage = conflict1 + " and " + conflict2 
                            + " is not a valid combination.";
        
        return null;
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