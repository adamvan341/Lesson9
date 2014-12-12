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
public class Circle extends AbstractShape{
    
    protected double radius;
    
    public Circle(double xPos, double yPos, double radius) {
        super(xPos, yPos);
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return (radius*radius) * Math.PI;
    }

    @Override
    public void draw(Pen p) {
        double side = 2.0 * Math.PI * radius / 120.0;
        p.up();
        p.move(xPos + radius,yPos);
        p.setDirection(90);
        p.down();
        
        for (int i=1; i<120; i++)
        {
            p.move(side);
            p.turn(3);
        }
    }

    @Override
    public void stretchBy(double factor) {
        radius *= factor;
    }
    
    @Override
    public String toString() {
        String temp = super.toString();
        temp += "\nRadius: " + radius;
        temp += "\nArea: " + area();
        temp += "\nPerimeter: " + perimeter();
        return temp;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
}
