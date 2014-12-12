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
public class Rekt extends AbstractShape {

    private double width;
    private double height;

    public Rekt(double xPos, double yPos, double width, double height) {
        super(xPos, yPos);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }

    @Override
    public void stretchBy(double factor) {
        width *= factor;
        height *= factor;
    }
    
    @Override
    public String toString() {
        String temp = super.toString();
        temp += "\nWidth: " + width;
        temp += "\nHeight: " + height;
        temp += "\nArea: " + area();
        temp += "\nPerimeter: " + perimeter();
        
        return temp;
    }

    @Override
    public double perimeter() {
        return width * 2 + height * 2;
    }
    
}
