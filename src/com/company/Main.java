package com.company;

import com.company.entity.Circle;
import com.company.entity.Rectangle;
import com.company.entity.Square;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        {
            Circle circle = new Circle(1.2);
            System.out.println(circle.calculates());
            System.out.println(circle.perimetr());

            Rectangle rectangle = new Rectangle(2, 4);
            System.out.println(rectangle.calculatesPerimetr());
            System.out.println(rectangle.calculatesSquare());

            Square square = new Square(5);
            System.out.println(square.calculatesPerimetr());
            System.out.println(square.calculatesSquare());
        }
        // write your code here
    }
}
