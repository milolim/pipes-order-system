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

    // Constructor
    public Pipe() {
    }

        // Modifier methods
    public Pipe() {
        calculateType(); //Write method calculateType()

    }
}