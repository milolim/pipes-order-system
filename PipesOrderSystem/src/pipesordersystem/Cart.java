/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesordersystem;

import java.util.ArrayList;

/**
 *
 * @author milo
 */
public class Cart {
    
    private double price;
    private ArrayList<Pipe> pipes = new ArrayList<Pipe>();
    
    public Cart() {
        
    }
    
    public void addPipe(Pipe newPipe) {
        pipes.add(newPipe);
        price += newPipe.getPrice();
        
        //Rounds to 2dp to prevent loss of accuracy
        price *= 100;
        price = Math.round(price);
        price = (double)price / (double)100;
        
    }
    
    public int getSize() {
        return pipes.size();
    }
    
    public double getPrice() {
        return price;
    }
    
}
