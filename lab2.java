package org.example;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    // 2 question
    public static void countOccurrences(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }
        System.out.println(target + " occurs " + count + " times");
    }

    // 6 question
    public static int generateRandom(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    // 7 question

    public static int checkLength(String p) {
        int len = p.length();
        if (len >= 8) {
            return 3;
        }
        if (len >= 6) {
            return 2;
        }
        return 0 ;
    }

    public static int checkSpecialCharacters(String p) {
        if (p.matches(".*[^a-zA-Z0-9].*")) {
            return 2;
        }
        return 0;
    }

    public static int checkUpperCaseLowerCase(String p) {
        boolean hasUpper = false;
        boolean hasLower = false;

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
        }
        if (hasUpper && hasLower) {
            return 3;
        }
        return 0;
    }


    // 8 question
    public static void Fibonacci(int n) {
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            
        }
    }

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //1 question
      String [] words = {"cat" ,"dog" , "red" , "is" , "am"};
        int maxLength = 0 ;
        for(String w : words){
            if (w.length() > maxLength){
                maxLength = w.length();
            }
        }
        ArrayList<String> longword = new ArrayList<>();
          for(String w : words){
              if (w.length() == maxLength){
                  longword.add(w);
              }
          }
        System.out.println(longword);

  //  2 question
        int [] num  =  {1,1,1,3,3,5};
        countOccurrences(num, 1);
        countOccurrences(num, 3);
        countOccurrences(num, 5);

// 3 question
        int[] number = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        Arrays.sort(number);
        System.out.println(k + " largest elements are:");
        for (int i = number.length - 1; i >= number.length - k; i--) {
            System.out.print(number[i] + " ");
        }


// 4 question
        System.out.println(" ");
        int[] num4 = {5,4,3,2,1};
         for (int i = 0 ; i < num4.length /2 ; i++){
             int pointr =  num4.length - 1 - i;
            int temp = num4[i];
             num4[i] = num4[pointr];
             num4[pointr] = temp;
           }
        System.out.print("Reversed Array: " );
        for (int n : num4) {
            System.out.print(" " + n);
        }

         System.out.println("   ");

// 5 question
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] num5 = new int[size];
        int choice;
        do {
            System.out.println("\n--- Array Menu ---");
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
            System.out.println("4. Sort the array");
            System.out.println("5. Stop");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter " + size + " elements:");
                    for (int i = 0; i < num5.length; i++) {
                        num5[i] = input.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Array elements are: " + Arrays.toString(num));
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int target = input.nextInt();
                    boolean found = false;
                    for (int n : num5) {
                        if (n == target) {
                            found = true;
                            break;
                        }
                    }
                    if (found) System.out.println("Element found!");
                    else System.out.println("Element NOT found.");
                    break;

                case 4:
                    Arrays.sort(num5);
                    System.out.println("Array sorted successfully.");
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);


// 6 question
        System.out.print("Enter the minimum value of the range: ");
        int min = input.nextInt();
        System.out.print("Enter the maximum value of the range: ");
        int max = input.nextInt();
        System.out.print("Enter the number of random numbers to generate: ");
        int rand = input.nextInt();
        System.out.println("Random numbers within the specified range:");
        for (int i = 0; i < rand; i++) {
            int result = generateRandom(min, max);

            if (i == rand - 1) {
                System.out.print(result);
            } else {
                System.out.print(result + " - ");
            }
        }

// 7 question
        System.out.println(" ");
        System.out.print("Enter a password: ");
        String pass = input.nextLine();
        int totalScore = checkLength(pass) +
                checkSpecialCharacters(pass) +
                checkUpperCaseLowerCase(pass);
        if (totalScore >= 8) {
            System.out.println("Password is strong.");
        } else if (totalScore >= 5) {
            System.out.println("Password is moderately strong.");
        } else {
            System.out.println("Password is weak.");
        }

// 8 question
    System.out.println(" ");
    System.out.print("Enter the number of Fibonacci terms to generate: ");
    int fib = input.nextInt();
     System.out.println("Fibonacci sequence with " + fib + " terms:");
     Fibonacci(fib);

     

    }

}