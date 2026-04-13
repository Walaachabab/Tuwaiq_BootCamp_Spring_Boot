package org.example;

public class Main {




    public static void main(String[] args) {


        Square s1 = new Square(5.0, "Red", false);
        System.out.println(s1.toString());
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());

        s1.setSide(10.0);
        System.out.println("After resizing side to 10:");
        System.out.println(s1.toString());


    }
}




















