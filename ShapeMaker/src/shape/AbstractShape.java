package shape;

import TurtleGraphics.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam
 */
abstract public class AbstractShape implements Shape {

    protected double xPos, yPos;
    
    public AbstractShape(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    @Override
    abstract public double area();

    @Override
    abstract public void draw(Pen p);

    @Override
    public final double getXPos() {
        return xPos;
    }

    @Override
    public final double getYPos() {
        return yPos;
    }

    @Override
    public final void setLocation(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    abstract public void stretchBy(double factor);

    @Override
    public String toString() {
        String temp = "";
        
        temp += "X-Position: " + xPos;
        temp += "\nY-Position: " + yPos;
        
        return temp;
    }
}
