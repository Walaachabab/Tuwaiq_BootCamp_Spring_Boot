package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  question 1:
        System.out.println("Enter your role: ");
        String Role = input.nextLine();
        if (Role.equalsIgnoreCase(("admin"))){
            System.out.println("Welcom admin");

        }else if (Role.equalsIgnoreCase("superuser")){
            System.out.println("Welcom superuser");

        }else if (Role.equalsIgnoreCase("user")){
            System.out.println("Welcom user");

        }else {
            System.out.println("unknown role");
        }

        //question 2:

        int num1 , num2 , num3 ;
        System.out.println("Pleas enter num 1 : ");
        num1 = input.nextInt();
        System.out.println("Pleas enter num 2 : ");
        num2 = input.nextInt();
        System.out.println("Pleas enter num 3 : ");
        num3 = input.nextInt();
        System.out.println("---------------------------");
       if(num1 >= num2 && num1 >= num3 ){
           System.out.println("greatest: " + num1);
       } else if (num2 >= num3 && num2 >= num1) {
           System.out.println("greatest: " +num2);
       } else if (num3 >= num1 && num3 >= num2) {
           System.out.println("greatest: " + num3);
       }

        // question 3:

        Random R = new Random();
        int dayNumber = R.nextInt(7) + 1;
        System.out.println("number: " + dayNumber);

        switch (dayNumber) {

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

// question 4:

        System.out.println("Enter your numeric score: " );
        int gread = input.nextInt();

         if(gread >= 90 && gread <= 100){
             System.out.println("numeric score: " + gread );
            System.out.println("Letter Grade: A");
         } else if (gread >= 80 && gread <= 89) {
             System.out.println("numeric score: " + gread );
             System.out.println("Letter Grade: B");
         } else if (gread >= 70 && gread <= 79) {
             System.out.println("numeric score: " + gread );
             System.out.println("Letter Grade: c");
         } else if (gread >= 60 && gread <= 69) {
             System.out.println("numeric score: " + gread );
             System.out.println("Letter Grade: D ");
         }else  {
             System.out.println("numeric score: " + gread );
             System.out.println("Letter Grade: F ");

         }


   // question 5:

        System.out.println("Pleas enter Age: ");
         int age = input.nextInt();
         if (age < 13){
             System.out.println("You are a Child");
         } else if(age>=13 && age <= 19) {
             System.out.println("You are a Teenager");
         } else  {
             System.out.println("You are a Adult");
         }


    }

}

