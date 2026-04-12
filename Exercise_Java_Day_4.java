import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // question 1:

        for(int i= 1 ; i<= 100 ; i++){

            if(i % 3 == 0 && i % 5 == 0){
               System.out.print("FizzBuzz, ");
            } else if (i% 3== 0) {
                System.out.print("Fizz, ");
            } else if (i% 5== 0) {
                System.out.print("Buzz, ");
            }else {
                System.out.print(i + ", ");
            }
        }
        

        // question 2:

        System.out.println("Pleas Enter Your String");
        String str = input.nextLine();
        for (int i = str.length()-1 ; i >= 0 ; i--){
           System.out.println(str.charAt(i));
        }


        // question 3
        System.out.println("Pleas enter Your Number");
        int Number = input.nextInt();
        int fact =1;
        for (int i = 1  ; i <= Number ; i ++ ){
           fact = fact* i;
        }
        System.out.println("fact: " + fact);


      // question 4
        System.out.println("Pleas enter Your Base");
         int base = input.nextInt();
        System.out.println("Pleas enter Your Exponet");
         int exponet = input.nextInt();
         int result = 1;
         for(int i = 1 ; i <=exponet ; i++){
             result = result * base;
         }
            System.out.println("Result: " + result);


 // question 5
        
        int sumOdd = 0 ;
        int sumEven =0 ;
        System.out.println("How Many Numbers do you want to enter? ");
        int count = input.nextInt();
        for (int i = 1 ; i <= count ; i++){
            System.out.println("Pleas enter number: " + i + ":");
            int Num = input.nextInt();
           if(Num % 2 == 0){
               sumEven =  sumEven + Num;
           } else  {
               sumOdd = sumOdd + Num ;
           }
        }
        System.out.println("Sum Even: " + sumEven);
        System.out.println("Sum Odd: " + sumOdd);



 // question 6

   System.out.println("Pleas enter Postive Number ");
    int primNum = input.nextInt();
    boolean isPrime = true;
    if(primNum <= 1){
        isPrime = false;
    }
  for (int i = 2  ; i <= primNum/2 ; i++){

      if(primNum %i == 0){
        isPrime = false;
        break;
      }
  }
       if (isPrime == true){

           System.out.println("is Prime");
       }else {
           System.out.println("is Not Prime");
       }


  // question 7

   for (int i = 1 ; i <= 4 ; i++) {
       System.out.println("Week" + i);
       for (int j =1 ; j<=7 ; j++){
           System.out.println("Day" + j);
       }
   }


// question 8

        System.out.println("Pleas enter your word: ");
        String text = input.nextLine().toLowerCase();
       boolean isPalindrom = true;
        for(int i = 0 ; i <= text.length() /2 ; i++ ){
            if (text.charAt(text.length()-1-i) != text.charAt(i) ){
                isPalindrom = false;
                break;
            }
        }
          if(isPalindrom == true){
         System.out.println("is Palindrom");
          }else {
              System.out.println("is Not Palindrom");
          }






    }


}