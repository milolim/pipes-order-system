/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesordersystem;

import pipesordersystem.gui.OrderWindow;
import java.util.Scanner;

/**
 *
 * @author milo
 */
public class PipesOrderSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cart orderCart = new Cart();
        
        final OrderWindow window = new OrderWindow(orderCart);
        window.setVisible(true);
        
    }
    
}
