/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesordersystem.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pipesordersystem.Cart;
import pipesordersystem.Pipe;

/**
 *
 * @author milo
 * @author nathaniel
 *
 */
public class OrderFormPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderSubmitPanel
     */
    /**
     * 06/11/2015 Changes: - Added validation for edit boxes.
     */
    private Cart orderCart;

    public OrderFormPanel(pipesordersystem.Cart orderCart) {
        this.orderCart = orderCart;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpColours = new javax.swing.ButtonGroup();
        btngrpDiameterRadius = new javax.swing.ButtonGroup();
        btnSubmitOrder = new javax.swing.JButton();
        lblPlasticGrade = new javax.swing.JLabel();
        cmboxPlasticGrade = new javax.swing.JComboBox();
        lblColour = new javax.swing.JLabel();
        rbtnNoColour = new javax.swing.JRadioButton();
        rbtnOneColour = new javax.swing.JRadioButton();
        rbtnTwoColour = new javax.swing.JRadioButton();
        cboxInnerInsulation = new javax.swing.JCheckBox();
        cboxOuterReinforcement = new javax.swing.JCheckBox();
        cboxChemicalResistance = new javax.swing.JCheckBox();
        lblExtra = new javax.swing.JLabel();
        lblLength = new javax.swing.JLabel();
        edtLength = new javax.swing.JTextField();
        lblMaxMeter = new javax.swing.JLabel();
        lblDiameterRadius = new javax.swing.JLabel();
        rbtnDiameter = new javax.swing.JRadioButton();
        rbtnRadius = new javax.swing.JRadioButton();
        edtDiameter = new javax.swing.JTextField();
        edtRadius = new javax.swing.JTextField();
        lblInch1 = new javax.swing.JLabel();
        lblInch2 = new javax.swing.JLabel();

        btngrpColours.add(rbtnNoColour);
        btngrpColours.add(rbtnOneColour);
        btngrpColours.add(rbtnTwoColour);

        btngrpDiameterRadius.add(rbtnDiameter);
        btngrpDiameterRadius.add(rbtnRadius);

        btnSubmitOrder.setText("Submit");
        btnSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrderActionPerformed(evt);
            }
        });

        lblPlasticGrade.setText("Plastic's grade:");

        cmboxPlasticGrade.setMaximumRowCount(5);
        cmboxPlasticGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        lblColour.setText("Colour print:");

        rbtnNoColour.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbtnNoColour.setSelected(true);
        rbtnNoColour.setText("No colour (grey)");

        rbtnOneColour.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbtnOneColour.setText("1 colour");

        rbtnTwoColour.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbtnTwoColour.setText("2 colours");

        cboxInnerInsulation.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cboxInnerInsulation.setText("Inner insulation");
        cboxInnerInsulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxInnerInsulationActionPerformed(evt);
            }
        });

        cboxOuterReinforcement.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cboxOuterReinforcement.setText("Outer Reinforcement");

        cboxChemicalResistance.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cboxChemicalResistance.setText("Chemical Resistance");

        lblExtra.setText("Extra:");

        lblLength.setText("Length (meters):");

        edtLength.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        edtLength.setToolTipText("");

        lblMaxMeter.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMaxMeter.setText("m      (Max 6m)");

        lblDiameterRadius.setText("Outer diameter/radius (inches):");

        rbtnDiameter.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbtnDiameter.setSelected(true);
        rbtnDiameter.setText("Diameter");
        rbtnDiameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDiameterActionPerformed(evt);
            }
        });

        rbtnRadius.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbtnRadius.setText("Radius");
        rbtnRadius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRadiusActionPerformed(evt);
            }
        });

        edtDiameter.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        edtRadius.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        edtRadius.setEnabled(false);
        edtRadius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtRadiusActionPerformed(evt);
            }
        });

        lblInch1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblInch1.setText("in");
        lblInch1.setToolTipText("");

        lblInch2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblInch2.setText("in");
        lblInch2.setToolTipText("");
        lblInch2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmitOrder))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlasticGrade)
                    .addComponent(lblColour)
                    .addComponent(cboxOuterReinforcement)
                    .addComponent(cboxInnerInsulation)
                    .addComponent(lblExtra)
                    .addComponent(lblLength)
                    .addComponent(cboxChemicalResistance)
                    .addComponent(lblDiameterRadius)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmboxPlasticGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnOneColour)
                            .addComponent(rbtnNoColour)
                            .addComponent(rbtnTwoColour)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(lblMaxMeter))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnDiameter)
                                    .addComponent(rbtnRadius))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtRadius, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(edtDiameter))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInch2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblInch1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblPlasticGrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmboxPlasticGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblColour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnNoColour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnOneColour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnTwoColour)
                .addGap(18, 18, 18)
                .addComponent(lblExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxInnerInsulation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxOuterReinforcement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxChemicalResistance)
                .addGap(18, 18, 18)
                .addComponent(lblLength)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxMeter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDiameterRadius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnDiameter)
                    .addComponent(edtDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnRadius)
                    .addComponent(edtRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInch2))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSubmitOrder))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboxInnerInsulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxInnerInsulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxInnerInsulationActionPerformed

    private void rbtnRadiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRadiusActionPerformed
        // TODO add your handling code here:
        edtRadius.setEnabled(true);
        lblInch2.setEnabled(true);
        edtDiameter.setEnabled(false);
        lblInch1.setEnabled(false);
    }//GEN-LAST:event_rbtnRadiusActionPerformed

    private void rbtnDiameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDiameterActionPerformed
        // TODO add your handling code here:
        edtDiameter.setEnabled(true);
        lblInch1.setEnabled(true);
        edtRadius.setEnabled(false);
        lblInch2.setEnabled(false);
    }//GEN-LAST:event_rbtnDiameterActionPerformed

    private void edtRadiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtRadiusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtRadiusActionPerformed

    //Validation goes here
    private boolean isNumeric(String strInput) {
        try {
            double strCheck = Double.parseDouble(strInput);
        } catch (NumberFormatException edtInput) {
            return false;
        }
        return true;
    }

    private Boolean lengthValidation() {
        Boolean valLength = true;
        try {
            double dLength = Double.parseDouble(edtLength.getText());
            if ((dLength < 0) || (dLength > 6)) {
                valLength = false;
            }
        } catch (NumberFormatException edtLength) {
            valLength = false;
        }
        return valLength;
    }

    private Boolean diameterValidation() {
        Boolean valDiameter = true;
        try {
            double dDiameter = Double.parseDouble(edtDiameter.getText());
            if ((dDiameter < 0) || (dDiameter > 10)) {
                valDiameter = false;
            }
        } catch (NumberFormatException edtDiameter) {
            valDiameter = false;
        }
        return valDiameter;
    }

    private Boolean radiusValidation() {
        Boolean valRadius = true;
        try {
            Double dRadius = Double.parseDouble(edtRadius.getText());
            if ((dRadius < 0) || (dRadius > 10)) {
                valRadius = false;
            }
        } catch (NumberFormatException edtRadius) {
            valRadius = false;
        }
        return valRadius;
    }

    private String setMessage() {
        String message1 = "", message2 = "", message3 = "";
        Boolean errorType1 = false, errorType2 = false, errorType3 = false;
        int error1 = 0, error2 = 0, error3 = 0;
        if (!(isNumeric(edtLength.getText()))) {
            if (edtLength.getText().equals("")) {
                if (errorType1 == false) {
                    errorType1 = true;
                    message1 += "\n The form is incomplete: ";
                } else {
                    message1 += ", ";
                }
                error1 += 1;
                message1 += "Length";
            } else {
                if (errorType2 == false) {
                    errorType2 = true;
                    message2 += "\n This form does not accept string values: ";
                } else {
                    message2 += ", ";
                }
                error2 += 1;
                message2 += "Length";
            }
        } else {
            int iLength = Integer.parseInt(edtLength.getText());
            if ((iLength < 0) || (iLength > 6)) {
                if (errorType3 == false) {
                    errorType3 = true;
                    message3 += "\n Value out of bounds: ";
                } else {
                    message3 += ", ";
                }
                error3 += 1;
                message3 += "Length";
            }
        }
        if (rbtnDiameter.isSelected()) {
            if (!(isNumeric(edtDiameter.getText()))) {
                if (edtDiameter.getText().equals("")) {
                    if (errorType1 == false) {
                        errorType1 = true;
                        message1 = message1 + "\n The form is incomplete: ";
                    } else {
                        message1 += ",and ";
                    }
                    error1 += 1;
                    message1 += "Diameter";
                } else {
                    if (errorType2 == false) {
                        errorType2 = true;
                        message2 = message2 + "\n This form does not accept string values: ";
                    } else {
                        message2 += ",and ";
                    }
                    error2 += 1;
                    message2 += "Diameter";
                }
            } else {
                int iDiameter = Integer.parseInt(edtDiameter.getText());
                if ((iDiameter < 0) || (iDiameter > 6)) {
                    if (errorType3 == false) {
                        errorType3 = true;
                        message3 += "\n Value out of bounds: ";
                    } else {
                        message3 += ", ";
                    }
                    error3 += 1;
                    message3 += "Diameter";
                }
            }
        } else if (rbtnRadius.isSelected()) {
            if (!(isNumeric(edtRadius.getText()))) {
                if (edtRadius.getText().equals("")) {
                    if (errorType1 == false) {
                        errorType1 = true;
                        message1 = message1 + "\n The form is incomplete: ";
                    } else {
                        message1 += ",and ";
                    }
                    error1 += 1;
                    message1 += "Radius";
                } else {
                    if (errorType2 == false) {
                        errorType2 = true;
                        message2 = message2 + "\n This form does not accept string values: ";
                    } else {
                        message2 += ",and ";
                    }
                    error2 += 1;
                    message2 += "Radius";
                }
            } else {
                int iRadius = Integer.parseInt(edtRadius.getText());
                if ((iRadius < 0) || (iRadius > 6)) {
                    if (errorType3 == false) {
                        errorType3 = true;
                        message3 += "\n Value out of bounds: ";
                    } else {
                        message3 += ", ";
                    }
                    error3 += 1;
                    message3 += "Radius";
                }
            }
        }
        if (errorType1) {
            if (error1 > 1) {
                message1 += " have";
            } else {
                message1 += " has";
            }
            message1 += " been left empty.";
        } else if (errorType2) {
            if (error2 > 1) {
                message2 += " have";
            } else {
                message2 += " has";
            }
            message2 += " been completed with incorrect data.";
        } else if (errorType3) {
            if (error3 > 1) {
                message3 += " contain numbers";
            } else {
                message3 += " contains a number";
            }
            message3 += " that is out of bounds.";
        }
        String message = ("Error:" + message1 + message2 + message3);
        return message;
    }

    private Boolean validation() {
        Boolean val1 = false, val2 = false;
        if (rbtnDiameter.isSelected()) {
            if (diameterValidation()) {
                val1 = true;
            }
        } else if (rbtnRadius.isSelected()) {
            if (radiusValidation()) {
                val1 = true;
            }
        }
        if (lengthValidation() && val1) {
            val2 = true;
        } else {
            String valMessage = setMessage();
            JOptionPane.showMessageDialog(new JFrame(), valMessage);
        }
        return val2;
    }

    //Temporary

    private void btnSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrderActionPerformed
        // TODO add your handling code here:
        if (validation()) {
            int grade = Integer.parseInt(
                    (String) cmboxPlasticGrade.getSelectedItem()
            );

            int colours;
            if (rbtnNoColour.isSelected()) {
                colours = 0;
            } else if (rbtnOneColour.isSelected()) {
                colours = 1;
            } else {
                colours = 2;
            }

            boolean resistance = cboxChemicalResistance.isSelected();
            boolean insulation = cboxInnerInsulation.isSelected();
            boolean reinforcement = cboxOuterReinforcement.isSelected();

            double length = Double.parseDouble(
                    edtLength.getText()
            );

            double radius;
            if (rbtnDiameter.isSelected()) {
                radius = Double.parseDouble(
                        edtDiameter.getText()
                ) / (double) 2; //Might cause innacuracies
            } else {
                radius = Double.parseDouble(
                        edtRadius.getText()
                );
            }

            Pipe newPipe = new Pipe(grade, colours, insulation, reinforcement,
                    resistance, length, radius);

            if (newPipe.isValid()) {

                orderCart.addPipe(newPipe);

                double itemPrice = newPipe.getPrice();
                double totalPrice = orderCart.getPrice();
                int numPipes = orderCart.getSize();

                String confirmationMessage = "Pipe added to basket. \n"
                        + "Price: £" + itemPrice + "\n"
                        + "Total price: £" + totalPrice
                        + " from " + numPipes + " items.";

                JOptionPane.showMessageDialog(new JFrame(), confirmationMessage);

            } else {
                String errorMessage = "Error: We cannot supply such pipe. \n"
                        + "Reason: " + newPipe.getReasonNotValid();
                JOptionPane.showMessageDialog(new JFrame(), errorMessage);
            }
        }

    }//GEN-LAST:event_btnSubmitOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitOrder;
    private javax.swing.ButtonGroup btngrpColours;
    private javax.swing.ButtonGroup btngrpDiameterRadius;
    private javax.swing.JCheckBox cboxChemicalResistance;
    private javax.swing.JCheckBox cboxInnerInsulation;
    private javax.swing.JCheckBox cboxOuterReinforcement;
    private javax.swing.JComboBox cmboxPlasticGrade;
    private javax.swing.JTextField edtDiameter;
    private javax.swing.JTextField edtLength;
    private javax.swing.JTextField edtRadius;
    private javax.swing.JLabel lblColour;
    private javax.swing.JLabel lblDiameterRadius;
    private javax.swing.JLabel lblExtra;
    private javax.swing.JLabel lblInch1;
    private javax.swing.JLabel lblInch2;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblMaxMeter;
    private javax.swing.JLabel lblPlasticGrade;
    private javax.swing.JRadioButton rbtnDiameter;
    private javax.swing.JRadioButton rbtnNoColour;
    private javax.swing.JRadioButton rbtnOneColour;
    private javax.swing.JRadioButton rbtnRadius;
    private javax.swing.JRadioButton rbtnTwoColour;
    // End of variables declaration//GEN-END:variables
}
