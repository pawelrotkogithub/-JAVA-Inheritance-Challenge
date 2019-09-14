package com.company;


public class Main
{

    public static void main(String args[])
    {

        Circle circle = new Circle(3.75);
        Cylinder cylinder = new Cylinder(3.75,75);

        System.out.println(" Cricle radius: "+circle.getRadius());
        System.out.println(" Cylinder volume: "+cylinder.getVolume());

    }
}
