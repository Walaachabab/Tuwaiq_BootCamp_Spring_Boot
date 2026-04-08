package org.example;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    
    // 4 question
public static void calculateAverage() throws ArithmeticException ,InputMismatchException{
    Scanner input = new Scanner(System.in);
    System.out.println("How many numbers do you want ? ");
    int manynum = input.nextInt();
    if(manynum == 0 ){
        throw new ArithmeticException("Cannot calculate average for zero numbers");
    }
    int sum = 0 ;
    for (int i= 1 ;  i <= manynum ; i++){
        System.out.println("Pleas enter number ? " + i + ": ");
        int numc = input.nextInt();
        sum = sum + numc;
    }
    double average = (double) sum / manynum;
    System.out.println("Average: " + average );
}

// 6 question
    public static void reevers() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.nextLine();
        if (word.matches(".*[0-9].*")) {
          throw new Exception("Invalid Input! Words should not contain numbers.");
        }
       if(word.isEmpty()){
           throw new Exception("The word cannot be empty!");
       }
         String revers = " ";
          for (int i = word.length()-1 ; i >= 0 ; i-- ){
              revers = revers + word.charAt(i);
          }
        System.out.println("Reverse Word: " + revers);
    }

// 10 question

    public static void calculate(double w, double h) throws Exception {
        if (w <= 0 || h <= 0) {
            throw new Exception("Width and Height must be positive numbers!");
        }
        System.out.println("Area: " + (w * h));
        double perimeterr = 2 * (w + h);
        System.out.println("Perimeter is : " + perimeterr);
    }

// 11 question
public static void compareNumbers() throws InputMismatchException {
    Scanner input = new Scanner(System.in);
    System.out.println("input first integer:");
    int nnum1 = input.nextInt();
    System.out.println("input second integer:");
    int nume2 = input.nextInt();

    if (nnum1 == nume2) System.out.println(nnum1 + " == " + nume2);
    if (nnum1 != nume2) System.out.println(nnum1 + " != " + nume2);
    if (nnum1 < nume2)  System.out.println(nnum1 + " < " + nume2);
    if (nnum1 > nume2)  System.out.println(nnum1 + " > " + nume2);
    if (nnum1 <= nume2) System.out.println(nnum1 + " <= " + nume2);
    if (nnum1 >= nume2) System.out.println(nnum1 + " >= " + nume2);
}

// 12 question

    public static void convertTime() throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int totalSecond = input.nextInt();
        if (totalSecond < 0) {
            throw new Exception("Seconds cannot be negative!");
        }
        int hours = totalSecond / 3600;
        int remainingAfterHours = totalSecond % 3600;
        int minutes = remainingAfterHours / 60;
        int seconds = remainingAfterHours % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    // 13 question
    public static void checkEquality() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("input first integer:");
        int numb1 = input.nextInt();
        System.out.println("input second integer:");
        int numb2 = input.nextInt();
        System.out.println("input third integer:");
        int numb3 = input.nextInt();
        System.out.println("input fourth integer:");
        int numb4 = input.nextInt();
        if (numb1 == numb2 && numb2 == numb3 && numb3 == numb4) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }

    // 14  question

    public static void checkPositiveNegative() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("input a number:");
        int numberr = input.nextInt();
        if (numberr > 0) {
            System.out.println("Number is positive");
        } else if (numberr < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }

    // 15 question
    public static void countNumbers() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        int postCount = 0, negCount = 0, zeroCount = 0;
        System.out.println("Enter numbers (Enter -1 to stop):");
        int number = input.nextInt();

        while (number != -1) {
            if (number > 0) {
                postCount++;
            } else if (number < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
            number = input.nextInt();
        }
        System.out.println("Positives: " + postCount);
        System.out.println("Negatives: " + negCount);
        System.out.println("Zeros: " + zeroCount);
    }

    // 16 question
    public static void reverseInt() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an Number: ");
        int numr = input.nextInt();
        int reverss = 0;
        while (numr != 0) {
            int digit = numr % 10;
            reverss = reverss * 10 + digit;
            numr = numr / 10;
        }
        System.out.println("Reversed number: " + reverss);
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1 question
      try {
            System.out.println("Pleas enter Num 1");
            int Num = input.nextInt();
            System.out.println("Pleas enter Num 2");
            int Num2 = input.nextInt();
            System.out.println("Num1 " + "+" + "Num2 " + "=" + (Num + Num2));
            System.out.println("Num1 " + "*" + "Num2 " + "=" + (Num * Num2));
            System.out.println("Num1 " + "-" + "Num2 " + "=" + (Num - Num2));

            System.out.println("Num1 " + "/" + "Num2 " + "=" + (Num / Num2));
            System.out.println("Num1 " + "%" + "Num2 " + "=" + (Num % Num2));
        }catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero!");
        }catch (InputMismatchException e){
            System.out.println("Plese enter Number not string! ");
        }catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("End Program :) ");
        }


//2 question
        System.out.println("Pleas Enter Number: ");
      try {
          int num = input.nextInt();
          for (int i = 1; i <= 10; i++) {
              System.out.println(num + "*" + i + "=" + (num * i));
          }
      } catch (InputMismatchException e){
          System.out.println("Pleas enter number not String");
      }catch (Exception e) {
          System.out.println("An unexpected error occurred: " + e.getMessage());
      } finally {
          System.out.println("End Program :) ");
      }


//3 question
       try {
           System.out.println("Pleas Enter Radius: ");
           double red = input.nextDouble();
           double perimeter = 2 * Math.PI * red;
           double area = Math.PI * red * red;
           System.out.println("Perimeter is = " + perimeter);
           System.out.println("Area is = " + area);
       }catch (InputMismatchException e){
           System.out.println("Pleas enter number not String");
       }catch (Exception e) {
           System.out.println("An unexpected error occurred: " + e.getMessage());
       } finally {
           System.out.println("End Program :) ");
       }
  // 4 question
        try {
            calculateAverage();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers not string !");
        }catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }finally {
            System.out.println("End Program :) ");
        }
        

// 5 question
      try {
          System.out.println("Enter input the fist number: ");
          int num1 = input.nextInt();
          System.out.println("Enter input the second number: ");
          int num2 = input.nextInt();
          System.out.println("Enter input the third number: ");
          int num3 = input.nextInt();
          boolean result = (num1 + num2 == num3);
          System.out.println("Result: " + result);
      }catch (InputMismatchException e) {
          System.out.println("Error: Please enter numbers not string !");
      }catch (Exception e) {
          System.out.println("An unexpected error occurred: " + e.getMessage());
      }finally{
          System.out.println("End Program :) ");
      }



// 6 question
      try {
          reevers();
      }catch (Exception e) {
          System.out.println("Error: " + e.getMessage());
      }finally{
          System.out.println("End Program :) ");
      }


// 7 question

        try {
            System.out.println("Enter a number:");
            int numm = input.nextInt();
            if(numm % 2 == 0){
                System.out.println("The number is Even");
            }else{
                System.out.println("The number is Odd");
            }
        }catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers not string !");
        }catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }finally {
            System.out.println("End Program :) ");
        }


// 8 question
        try {
            System.out.println("Enter temperature in Centigrad:");
            double centig = input.nextDouble();
            double fahren = (centig * 1.8) +32;
            System.out.println("Temperature in Fahrenheit: " + fahren);
        }catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers not string !");
        }catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }finally {
            System.out.println("End Program :) ");
        }


 // 9 question
        try {
            System.out.println("input a string:");
            String str = input.nextLine();
            if (str.matches(".*\\d.*")) {
                throw new Exception("Numbers are not allowed in the text!");
            }
            System.out.println("Input a number for index text :");
            int number = input.nextInt();
            System.out.println("Character at index: " + str.charAt(number));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("End Program :) ");
        }



// 10 question

        try{
            calculate(5.6 ,8.5);
        }catch (InputMismatchException e) {
            System.out.println("Error: Please enter a numeric value.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("End Program :) ");
        }



   // 11 question
        try {
            compareNumbers();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input, please enter Number only.");
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("End Program :) ");
        }


        // 12 question
        try {
            convertTime();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer number.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("End Program :) ");
        }


        // 13 question
        try {
            checkEquality();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter integers only!");
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("End Program :) ");
        }


        // 14 question
        try {
            checkPositiveNegative();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter an integer.");
        }finally {
            System.out.println("End Program :) ");
        }



        // 15 question
        try {
            countNumbers();
        } catch (InputMismatchException e) {
            System.out.println("Error: Stop! You entered a string instead of a number.");
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("End Program :) ");
        }


        // 16 question
        try {
            reverseInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter an integer number.");
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("End Program :) ");
        }

   // 17 question
        try {
            System.out.println("Enter the first Number:");
            int number = input.nextInt();

            int max = number;
            int min = number;
            char choice;

            do {
                System.out.println("Enter the Number:");
                number = input.nextInt();

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

                System.out.println("Do you want to enter another number? (y/n): ");
                choice = input.next().charAt(0);

            } while (choice == 'y' || choice == 'Y');

            System.out.println("The largest number: " + max);
            System.out.println("The smallest number: " + min);

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter numbers only.");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("End Program :) ");
        }


        // 18 question

        try {
            System.out.println("Enter String (No numbers allowed):");
            String text = input.nextLine();
            if (text.matches(".*\\d.*")) {
                throw new Exception("Numbers are not allowed! Please enter letters only.");
            }int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                    count++;
                }
            }
            System.out.println("Number of a's: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("End Program :) ");
        }






    }
}
