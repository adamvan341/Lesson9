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
public interface Shape {

    // kappachino

    public double area();

    public void draw(Pen p);

    public double getXPos();

    public double getYPos();

    public void setLocation(double xPos, double yPos);

    public void stretchBy(double factor);
    
    public double perimeter();
}
