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

    private int type, gradeMin, gradeMax;
    private boolean bColour1, bColour2, insulation, reinforcement, resistance;
    private String sColour1, sColour2;
    /* ^^^^^^^^^^^^^ Private instance variables only accessible within the class ^^^^^^^^^^^^^^^
     These variables are used to define what type of pipe is being used.
     */

    public Pipe() {
    }
    // Constructor

    public Pipe(int piType, int piGradeMin, int piGradeMax, boolean piBColour1, boolean piBColour2, boolean piInsulation, boolean piReinforcement, boolean piResistance, String piSColour1, String piSColour2) {
        this.type = piType;
        this.gradeMin = piGradeMin;
        this.gradeMax = piGradeMax;
        this.bColour1 = piBColour1;
        this.bColour2 = piBColour2;
        this.insulation = piInsulation;
        this.reinforcement = piReinforcement;
        this.resistance = piResistance;
        this.sColour1 = piSColour1;
        this.sColour2 = piSColour2;
    }
    // Modifier methods

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getGradeMin() {
        return gradeMin;
    }

    public void setGradeMin(int gradeMin) {
        this.gradeMin = gradeMin;
    }

    public int getGradeMax() {
        return gradeMax;
    }

    public void setGradeMax(int gradeMax) {
        this.gradeMax = gradeMax;
    }

    public boolean isbColour1() {
        return bColour1;
    }

    public void setbColour1(boolean bColour1) {
        this.bColour1 = bColour1;
    }

    public boolean isbColour2() {
        return bColour2;
    }

    public void setbColour2(boolean bColour2) {
        this.bColour2 = bColour2;
    }

    public boolean isInsulation() {
        return insulation;
    }

    public void setInsulation(boolean insulation) {
        this.insulation = insulation;
    }

    public boolean isReinforcement() {
        return reinforcement;
    }

    public void setReinforcement(boolean reinforcement) {
        this.reinforcement = reinforcement;
    }

    public boolean isResistance() {
        return resistance;
    }

    public void setResistance(boolean resistance) {
        this.resistance = resistance;
    }

    public String getsColour1() {
        return sColour1;
    }

    public void setsColour1(String sColour1) {
        this.sColour1 = sColour1;
    }

    public String getsColour2() {
        return sColour2;
    }

    public void setsColour2(String sColour2) {
        this.sColour2 = sColour2;
    }
    
    

}
