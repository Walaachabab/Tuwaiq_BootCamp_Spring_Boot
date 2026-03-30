package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// question 1 :
     System.out.println("Pleas enter Weight: ");
     float weight = input.nextFloat();
     System.out.println("Pleas enter Height: ");
     float Height = input.nextFloat();
     System.out.println("BMI: " + weight/(Height*Height));

// question 2 :
//
        System.out.println("Pleas enter Obtained Marks: ");
        double obtained_Marks = input.nextDouble();
        System.out.println("Pleas enter total_Marks: ");
        double  total_Marks = input.nextDouble();
        double Percentage =(obtained_Marks/total_Marks)*100;
        System.out.println("Percentage: "+ Percentage + "%");



// question 3 :

        System.out.println("Pleas enter Amount in USD: ");
        double amount_USD = input.nextDouble();
        System.out.println("Pleas enter rate: ");
        double  Rete = input.nextDouble();
        double amount_EUR = amount_USD * Rete ;
        System.out.println("Amount in EUR: " + amount_EUR);

// question 4 :

    System.out.print("Pleas enter your string");
    String Str = input.nextLine();
    System.out.println("Length String " + Str.length());
    StringBuilder sb = new StringBuilder(Str);
    sb.reverse();
     System.out.println("Reversed String " + sb);


// question 5 :

        String sentence = "The quick brown fox jumps over the lazy dog";
        int startIndex = 10;
        int endIndex = 20;
        String result = sentence.substring(startIndex, endIndex);
        System.out.println(result);

// question 6 :

        String sentence2 = "The quick brown fox jumps over the lazy dog";
        String keyword = "jumps";
        System.out.println("keyword present? " + sentence2.contains(keyword));

// question 7 :

        String sentence3 = "The quick brown fox jumps over the lazy dog";
        String wordReplace = "fox";
        String replacementWord = "cat";
        String modified_Sentence = sentence3.replace(wordReplace, replacementWord);
        System.out.println(modified_Sentence);

// question 8 :


        String str1 = "Hello";
        String str2 = "hello";
        String output = str1.equalsIgnoreCase(str2) ? "Strings are equal (ignoring case)" : "Strings are not equal";
        System.out.println(output);

        


    }
}
