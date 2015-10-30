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

    private int type, grade, colours;
    private boolean insulation, reinforcement, resistance;

    // Constructor
    public Pipe() {
    }

        // Modifier methods
    public Pipe(int piGrade, int piColours, boolean piInsulation, boolean piReinforcement, boolean piResistance) {
           grade = piGrade;
           colours = piColours;
           insulation = piInsulation;
           reinforcement = piReinforcement;
           resistance = piResistance;
           type = calculateType();
   

    }
    
    public int calculateType()  {
        switch colours{
            
            0: 
            
            1:
                   
            2:
            
            
        }
        
        
    }
    }
}