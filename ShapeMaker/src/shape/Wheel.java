/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import TurtleGraphics.Pen;

/**
 *
 * @author adam
 */
public class Wheel extends Circle {
    
    public Wheel(double xPos, double yPos, double radius) {
        super(xPos, yPos, radius);
    }
    
    @Override
    public void draw(Pen p) {
        super.draw(p);
        
        double direction = 0;
        for (int x=0; x<6; x++) {
            // Go to Center
            p.up();
            p.move(xPos, yPos);
            
            //Draw Line
            p.down();
            p.setDirection(direction);
            p.move(radius);
            direction += 60;
        }
    }
    
    @Override
    public String toString() {
        String temp = super.toString();
        temp += "\nSpokes: 6";
        
        return temp;
    }
}