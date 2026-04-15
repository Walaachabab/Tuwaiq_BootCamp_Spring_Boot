package org.example.Exercise_Abstraction;

public class Main {
    public static void main(String[] args) {

   System.out.println();
   System.out.println("--- Product Exercise ---");

  Book myBook = new Book("Java Mastery", 100.0, "Ahmad Saad");
  Movie myMovie = new Movie("Inception", 200.0, "Christopher Nolan");

  System.out.println("Product: " + myBook.getName() + "| "+"Author: " + myBook.getAuthor()+ " | Price before discount: " + myBook.getPrice());
  System.out.println("Price after Book discount: " + myBook.getDiscount());

  System.out.println("\nProduct: " + myMovie.getName() + " | Price before discount: " + myMovie.getPrice());
  System.out.println("Price after Movie discount: " + myMovie.getDiscount());


// Q2
       System.out.println("----------------------------Q2-------------------------------");
       System.out.println("\n--- Movable Interface Exercise ---");

        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        System.out.println("Starting Position: " + point.toString());

        point.moveUp();
        System.out.println("After moving Up: " + point.toString());

        point.moveRight();
        System.out.println("After moving Right: " + point.toString());


        point.moveLeft();
        System.out.println("After moving Left: " + point.toString());


        point.moveDown();
        System.out.println("Final Position: " + point.toString());








    }


}
