kage org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

         // 1
       Scanner input = new Scanner(System.in);
        System.out.println("Pleas Enter number 1 ");
         int num1 =  input.nextInt();
        System.out.println("Pleas Enter number 2 ");
        int num2 =  input.nextInt();
        System.out.println("Pleas Enter number 3 ");
        int num3 =  input.nextInt();
        if(num1 > num2 && num1 > num3) {
            System.out.println("largest number:" + num1);
        } else if (num1 < num2 && num2 > num3) {
            System.out.println("largest number:" + num2);
        }else {
            System.out.println("largest number:" + num3);
        }


       // 2
        System.out.println("Pleas Enter String ");
        String str = input.nextLine();
        System.out.println("Pleas Enter index String ");
        int index = input.nextInt();
         for (int i = 0 ; i < str.length()-1 ; i ++ ){
             index = Character.toLowerCase(str.charAt(i));
         }
              System.out.println(index);




         // 3

        System.out.println("Pleas Enter number : for Stope : -1 ");
        int num4 =  input.nextInt();
        int sum =0;
        do{
            sum = sum + num4;
            System.out.println("Pleas Enter number : for Stope : -1 ");
            num4 =  input.nextInt();

        } while(num4 != -1 );

        System.out.println("Sum number: " +sum );


        // 4

          int [] array =  {10, -21 , 30, 31, -25};
          for (int i = 0 ; i < array.length ; i++){

             if(array[i] > 0 ){
                 System.out.println(array[i] + " is Postive number");
             } else if (array[i] < 0) {
                 System.out.println(array[i] + " is Negative number");
             }else {
                 System.out.println(array[i] + " is Zero number");
             }
          }

          
          // 5

        String [] araay5 =   {"Tuwaiq" , "Bootcamp" , "“Student" , "JAVA"};
          String max= "Tuwaiq" ;
          // int mini = 0 ;
        for (int i = 0 ; i < araay5.length ; i++){
            if (araay5[i].length() <  max.length() )
                max = araay5[i];
        }
        System.out.println(max);
        
        

    }
    
}