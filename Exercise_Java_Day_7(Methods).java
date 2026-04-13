package org.example;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    //1 question
    public static void smalest(int num , int num2 , int num3) {
        if (num < num2 && num < num3){
           System.out.println("smalest: " + num);
        } else if (num2 < num && num2 < num3) {
            System.out.println("smalest: " + num2);
        }else {
            System.out.println("smalest: " + num3);
        }
    }

    //2 question
    public static void typeNume(int num){
        if (num > 0){
            System.out.println("The Number is Postive");
        } else if (num <0) {
            System.out.println("The Number is Negative");
        }else {

            System.out.println("The Number is Zero ");
        }
    }

    //3 question

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return (digits >= 2);
    }



    public static void main(String[] args) {
        //1 question
        Scanner input = new Scanner(System.in);
       System.out.println("Pleas enter num 1");
        int num1 = input.nextInt();
        System.out.println("Pleas enter num 2");
        int num2 = input.nextInt();
        System.out.println("Pleas enter num 3");
        int num3 = input.nextInt();
        smalest(num1, num2, num3);

        //2 question
        System.out.println("Pleas enter Number");
        int number = input.nextInt();
        typeNume(number);

        // 3 question
        System.out.println("Pleas enter Passowrd");
        String pass = input.nextLine();
        if (isValidPassword(pass)) {
            System.out.println("Password is valid: " + pass);
        } else {
            System.out.println("Password is invalid: " + pass);
        }
    }


    }

