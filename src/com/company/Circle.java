package com.company;

public class Circle {

    double radius;
    double area;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        }
        else this.radius = radius;
    }


    double getRadius(){
        return radius;
    }

    double getArea(){
        area = radius*radius*Math.PI;
        return area;
    }

}
