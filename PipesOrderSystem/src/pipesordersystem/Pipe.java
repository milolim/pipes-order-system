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

    private int type, gradeMin, gradeMax;
    private boolean bColour1, bColour2, insulation, reinforcement, resistance;
    private String sColour1, sColour2;

    // Constructor
    public Pipe() {
    }

        // Modifier methods
    public Pipe(String piSColour1, String piSColour2) {

        this.sColour1 = piSColour1;
        this.sColour2 = piSColour2;

        calculateType(); //Write method calculateType()

    }
}