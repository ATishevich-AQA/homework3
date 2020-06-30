package com.company.entity;

public class Circle {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculates() {
        return Math.PI * (Math.pow(r, 2));
    }

    public double perimetr() {
        return 2 * Math.PI * r;
    }

}
