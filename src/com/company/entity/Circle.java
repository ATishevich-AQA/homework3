package com.company.entity;

public class Circle {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculates() {
        double S = Math.PI * (Math.pow(r, 2));
        return S;
    }

}
