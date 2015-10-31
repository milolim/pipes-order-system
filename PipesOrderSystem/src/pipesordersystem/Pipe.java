/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesordersystem;

/**
 *
 * @author up729874(Nathaniel-Pankhurst)
 */
public class Pipe {
    /* Private instance variables only accessible within the class
     These variables are used to define what type of pipe is being used.
     */

    /*
    
    31/10/2015
    Changes:
    
        - Removed empty Pipe constructor, I can see it ever being used.
        - Set calculateType() to private.
        - Finished calculateType() method.
        - Added the needed getters and setters.
    
    */
    
    private int type, grade, colours;
    private boolean insulation, reinforcement, resistance;

        // Modifier methods
    public Pipe(int piGrade, int piColours, boolean piInsulation, boolean piReinforcement, boolean piResistance) {
           grade = piGrade;
           colours = piColours;
           insulation = piInsulation;
           reinforcement = piReinforcement;
           resistance = piResistance;
           type = calculateType();
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
    
    public boolean isValid() {      //Returns wether it is a valid pipe
        return type != 0;
    }
    
    private int calculateType()  {
        int pipeType;
        
        int insulationAsInt = (insulation) ? 1 : 0;
        int reinforcementAsInt = (reinforcement) ? 1 : 0;
        int resistanceAsInt = (resistance) ? 1 : 0;
        int pipeId = grade + colours + insulationAsInt + reinforcementAsInt;
        
        switch (pipeId) {
            
            case 1000: case 2000: case 3000:
                pipeType = 1;
                break;
            case 2100: case 3100: case 4100:
                pipeType = 2;
                break;
            case 2200: case 3200: case 4200: case 5200:
                pipeType = 3;
                break;
            case 2210: case 3210: case 4210: case 5210:
                pipeType = 4;
                break;
            case 3211: case 4211: case 5211:
                pipeType = 5;
                break;
            default:
                pipeType = 0;
                break;  
        }        
        
        return pipeType; //Returns 0 if pipe does not match a type;
    }
    
}