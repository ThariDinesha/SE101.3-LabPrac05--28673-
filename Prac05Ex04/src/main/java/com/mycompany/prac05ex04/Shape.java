
package com.mycompany.prac05ex04;

abstract class Shape 
{
    abstract double calculateArea();
    public void display()
    {
        double area= calculateArea();
        System.out.println("Area of the Shape: "+area);
    }
}
