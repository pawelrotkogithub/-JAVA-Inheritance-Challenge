package com.company;

public class Cylinder extends Circle {
    double hight;
    double volume;

    public Cylinder(double radius, double hight) {
        super(radius);

        if (hight < 0) {
            this.hight = 0;
        } else {
            this.hight = hight;
        }

    }


    double getHeight(){
        return hight;
    }

    double getVolume(){
        volume = getArea()*hight;
        return volume;
    }


}
