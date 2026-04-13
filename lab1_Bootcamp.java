package org.example;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1 question
        System.out.println("Pleas enter Num 1");
        int Num =  input.nextInt();
        System.out.println("Pleas enter Num 2");
        int Num2 =  input.nextInt();
System.out.println("Num1 " +"+" + "Num2 " + "=" +(Num + Num2));
System.out.println("Num1 " +"*" + "Num2 " + "=" +(Num * Num2));
System.out.println("Num1 " +"-" + "Num2 " + "=" +(Num - Num2));
System.out.println("Num1 " +"/" + "Num2 " + "=" +(Num / Num2));
System.out.println("Num1 " +"%" + "Num2 " + "=" +(Num % Num2));

//2 question
       System.out.println("Pleas Enter Number: ");
        int num = input.nextInt();
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println( num + "*" + i + "=" + (num * i ));
        }

//3 question


        System.out.println("Pleas Enter Radius: ");
        double red = input.nextDouble();
        double perimeter = 2 * Math.PI * red;
        double area = Math.PI * red*red;
        System.out.println("Perimeter is = " + perimeter );
        System.out.println("Area is = " + area);

        // 4 question

        System.out.println("How many numbers do you want ? ");
          int manynum = input.nextInt();
          int sum = 0 ;

          for (int i= 1 ;  i <= manynum ; i++){
         System.out.println("Pleas enter number ? ");
              int numc = input.nextInt();
              sum = sum + numc;
          }
          double average = (double) sum / manynum;
          System.out.println("Average: " + average );


// 5 question


          System.out.println("Enter input the fist number: ");
          int num1 = input.nextInt();
          System.out.println("Enter input the second number: ");
          int num2 = input.nextInt();
          System.out.println("Enter input the third number: ");
          int num3 = input.nextInt();
          boolean result = (num1 + num2 == num3);
          System.out.println("Result: " + result);

// 6 question

         System.out.println("Enter your word:");
         String word = input.nextLine();
         String reevers  = "";
          for (int i = word.length() -1 ; i >= 0 ; i--){
              reevers = reevers + word.charAt(i);
          }
        System.out.println("Revers Word: " + reevers);


// 7 question

        System.out.println("Enter a number:");
        int numm = input.nextInt();
        if(numm % 2 == 0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }


// 8 question
         System.out.println("Enter temperature in Centigrad:");
         double centig = input.nextDouble();
         double fahren = (centig * 1.8) +32;
         System.out.println("Temperature in Fahrenheit: " + fahren);


 // 9 question
        System.out.println("input a string:");
        String str = input.nextLine();
        System.out.println("input a number:");
         int number = input.nextInt();
        System.out.println(str.charAt(number));

// 10 question

      double width = 5.6;
      double height = 8.5;
      double areaa = width * height ;
      double perimeterr = 2 * (width + height);
      System.out.println("Area is : " + areaa);
      System.out.println("Perimeter is : " + perimeterr);


   // 11 question
        System.out.println("input first integer:");
        int nnum1 = input.nextInt();
        System.out.println("input second integer:");
        int nume2 = input.nextInt();
        if (nnum1 == num2)
            System.out.println(nnum1 + " == " + nume2);
        if (nnum1 != num2)
            System.out.println(num1 + " != " + nume2);
        if (nnum1 < num2)
            System.out.println(num1 + " < " + nume2);
        if (nnum1 > num2)
            System.out.println(num1 + " > " + nume2);
        if (nnum1 <= num2)
            System.out.println(num1 + " <= " + nume2);
        if (nnum1 >= num2)
            System.out.println(nnum1 + " >= " + nume2);



        // 12 question

        System.out.print("Input seconds: ");
        int totalSecond = input.nextInt();
        int hours = totalSecond / 3600;
        int remainingAfterHours = totalSecond % 3600;
        int minutes = remainingAfterHours / 60;
        int seconds = remainingAfterHours % 60;
        System.out.print(hours + ":" + minutes + ":" + seconds);


        // 13 question
         System.out.println("input first integer:");
         int numb1 = input.nextInt();
         System.out.println("input second integer:");
         int numb2 = input.nextInt();
         System.out.println("input third integer:");
         int numb3 = input.nextInt();
         System.out.println("input fourth integer:");
         int numb4 = input.nextInt();
         if(numb1 == numb2 && numb2 == numb3 && numb3 == numb4){
             System.out.println("Numbers are equal!");
         }else{
             System.out.println("Numbers are not equal!");
         }


        // 14 question
        System.out.println("input a number:");
        int numberr = input.nextInt();
        if(numberr > 0){
            System.out.println("Number is positive");
        } else if (numberr < 0) {
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }


      // 15 question
       int postCount = 0 , negCount = 0 , zeroCount = 0 ;
        System.out.println("Enter numbers (Enter -1 to stop):");
        int Number= input.nextInt();
     while (Number != -1){
         if (Number > 0 ){
              postCount++;
         } else if (Number < 0) {
             negCount++;
         }else {
             zeroCount++;
         }
         Number = input.nextInt();
     }
        System.out.println("Positives: " + postCount );
        System.out.println("Negative: " + negCount );
        System.out.println("Zero: " + zeroCount );


        // 16 question

        System.out.println("Input an integer: ");
         int numr = input.nextInt();
         int reverss = 0;
        while (numr !=0){

            int digit = num % 10;
            reverss = reverss *10 +digit;
            numr = numr /10 ;
        }
         System.out.println("Reversed number: " + reverss);




        // 17 question

        System.out.println("Enter the first Number");
        int numbber = input.nextInt();
         int max = numbber;
         int min = numbber;
         char choice ;

         do {
             System.out.println("Enter the Number");
             numbber = input.nextInt();
             if(numbber > max){
                  max = numbber;
             }if(numbber < min){
                min = numbber;
             }
         System.out.println("Do you want to enter another number? (y/n): ");
             choice = input.next().charAt(0);

         }while (choice == 'y' || choice == 'Y');
         System.out.println("The large number: " + max);
         System.out.println("The small number: " + min);

        // 18 question

         System.out.println("Enter String: ");
         String text = input.nextLine();
          int count =0;
        for (int i = 0 ; i <= text.length()-1 ; i++){
        if (text.charAt(i) == 'a'){
            count++;
        }
    }
       System.out.println("Number of a's: " + count);


        


    }
}