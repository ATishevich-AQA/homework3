package com.company.entity;

public class Square {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public int calculatesSquare() {
        return (int) Math.pow(side, 2);
    }

    public int calculatesPerimetr() {
        return side * 4;
    }
}
