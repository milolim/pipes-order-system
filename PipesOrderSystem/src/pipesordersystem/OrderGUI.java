/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesordersystem;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author milo
 */
public class OrderGUI extends JFrame {

    public OrderGUI() {
        super("PipesR'us Order"); //Sets window name
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        final JButton btnTest = new JButton("Test");
        
        setLayout(new FlowLayout());
        add(btnTest);
        pack();
    }
    
}
