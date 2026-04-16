package org.example.Lab4;

public class Main {

    public static void main(String[] args){

       Circle c = new Circle(5.0);
       Rectangle r = new Rectangle(4.0 , 6.0);
       Triangle t = new Triangle(3.0 , 4.0);

      // Test Circle
        System.out.println("______________________________________");
        System.out.println(c.toString());
        System.out.printf("Area: %.2f\n",c.calculateArea());
        System.out.printf("Circumference: %.2f\n",c.calculateCircumference());

        System.out.println("______________________________________");

     // Test Rectangle
        System.out.println(r.toString());
        System.out.printf("Area: %.2f\n",r.calculateArea());
        System.out.printf("Circumference: %.2f\n",r.calculateCircumference());

    // Test Triangle
        System.out.println("______________________________________");

        System.out.println(t.toString());
        System.out.printf("Area: %.2f\n",t.calculateArea());
        System.out.printf("Circumference: %.2f\n",t.calculateCircumference());

        System.out.println("______________________________________");


    }


}
