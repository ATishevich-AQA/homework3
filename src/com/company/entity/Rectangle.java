package com.company.entity;

public class Rectangle {

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculatesSquare() {
        return length * width;
    }

    public int calculatesPerimetr() {
        return (length + width) * 2;
    }
}
