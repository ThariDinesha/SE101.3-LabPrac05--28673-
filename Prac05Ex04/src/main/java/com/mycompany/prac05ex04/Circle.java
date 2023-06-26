
package com.mycompany.prac05ex04;

public class Circle extends Shape
{
    private double radius;
    
    public Circle(double radius)
    {
        this.radius=radius;
    }
    
   /* public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }*/
    
    @Override
    double calculateArea()
    {
        return (double)(Math.PI * radius * radius);
    }
}
