/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesordersystem;

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
        
        boolean isValid = false;
        Scanner c = new Scanner(System.in);
        
        while(!isValid) {          
            System.out.println("Start in gui mode? (y/n)");
            String answer = c.nextLine();
            
            if (answer.charAt(0) == 'y') {
                isValid = true;
                final OrderGUI window = new OrderGUI();
                window.setVisible(true);
            } else if (answer.charAt(0) == 'n') {
                isValid = true;
                System.out.println("Starting in text mode.");
            } else { 
                System.out.println("\"" + answer + "\" Is not a valid input"); 
            }
        }
        
    }
    
}
