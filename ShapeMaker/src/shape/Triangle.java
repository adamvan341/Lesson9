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
public class Triangle extends AbstractShape {
    
    double base;
    double height;
    
    public Triangle(double xPos, double yPos, double base, double height) {
        super(xPos, yPos);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos + base, yPos);
        p.move((xPos + base)/2, yPos + height);
        p.move(xPos, yPos);
    }

    @Override
    public void stretchBy(double factor) {
        base *= factor;
        height *= factor;
    }
    
    @Override public String toString() {
        String temp = super.toString();
        temp += "\nBase: " + base;
        temp += "\nHeight: " + height;
        temp += "\nArea: " + area();
        temp += "\nPerimeter: " + perimeter();
        
        return temp;
    }

    @Override
    public double perimeter() {
        double p = base;
        
        p += Math.sqrt(((base/2)*(base/2)) + (height*height));
        p += Math.sqrt(((base/2)*(base/2)) + (height*height));
        
        return p;
    }
}
