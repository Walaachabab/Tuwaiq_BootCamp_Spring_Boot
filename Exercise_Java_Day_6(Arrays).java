package org.example;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1 question
        int [] array = {10, 60, 40, 30, 0, -20, 50};
        if (array.length > 2) {
            if (array[0] == array[array.length - 1]){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }


  // 2 question
        double sum = 0;
        double avreg = 0;
        int [] array2 = {1 , 4 , 17 , 7, 25 , 3 ,100};
        for(int i=0 ; i <= array2.length-1 ; i++){
             sum = sum + array2[i];
        }
        avreg = sum/array2.length;
        System.out.println("Avrege: " + avreg);

        for (int i=0 ; i <= array2.length-1 ; i++){
           if(avreg <array2[i]) {
               System.out.println("Numbers greater than the average are: " + array2[i] );
           }
        }


// 3 question
        int [] array3 = {20 ,30 , 40};
 if(array3[0] > array3[array3.length-1]){
     System.out.println("Larger value between first and last element:" + array3[0]);
 }else {
     System.out.println("Larger value between first and last element:" + array3[array3.length-1]);
 }


// 4 question
        int [] array4 = {20 ,30 , 40};
        int [] copyArray = {0,0,0};

        System.out.print("New array after swapping: ");
        for (int i = 0 ;  i <= array4.length-1 ; i++){
            copyArray[i] = array4[i];
            System.out.print(copyArray[i] + " ");
        }


// 5 question
        int[] array5 = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        System.out.println("Original Array: " + Arrays.toString(array5));

        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] % 2 != 0) {
                odds.add(array5[i]);
            } else {
                evens.add(array5[i]);
            }
        }
        odds.addAll(evens);
        System.out.println("Result: " + odds);



        // 6 question

        int[] arr1 = {2, 3, 6, 6, 4};
        int[] arr2 = {2, 3, 6, 6, 4};

        boolean result = Arrays.equals(arr1, arr2);
        System.out.println("Result: " + result);
        

    }


}