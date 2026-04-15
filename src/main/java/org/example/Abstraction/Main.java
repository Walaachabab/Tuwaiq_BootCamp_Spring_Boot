package org.example.Abstraction;

public class Main {

    public static void main(String[] args) {

        bee b = new bee();

        System.out.println("Bees Color: ");
        b.printColor();
        System.out.println("Bees Sound: ");
        b.printSound();

        Cat cat = new Cat();

        System.out.println("Cat Color: ");
        cat.printColor();
        System.out.println("Cat Sound: ");
        cat.printSound();


    }
}
