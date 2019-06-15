package com.rajeshchinni;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);   // this is a static variable. all static methods can access it directly.


    public static void main(String[] args) {

//        -Write a method called readIntegers() with a parameter called count that
//        represents how many integers the user needs to enter.
//
//        -The method needs to read from the console until all the numbers are entered, and then return an
//        array containing the numbers entered.
//
//        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//        -Finally, print the minimum element in the array.
//
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//                -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name MinElementChallenge
        // Hint: compare this question with ArrayChallenge and Array2

        System.out.println("How many numbers do you want to enter");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("Minimum value = " + returnedMin);



    }

    // below is a method
    public static int[] readIntegers(int count){
        // System.out.println("Enter " + count + " integer values.\r"); // \r brings the
        // cursor to the next line. Instead of \r, you can use scanner.nextline
        int[] values = new int[count];

        for (int i = 0; i < values.length; i++){
            System.out.println("Enter number please ");
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println(Arrays.toString(values));  //Arrays.toString prints the contents of an entire array with comma separated.
        return values;
    }



    //method
    public static int findMin(int[] arraybey){   // compare this with MinAndMaxInputChallenge
        int minValue = arraybey[0];
        for(int i=1;i<arraybey.length;i++){
            if(arraybey[i] < minValue){
                minValue = arraybey[i];
            }
        }
        return minValue;
    }

    // below is a method
//    public static int findMin(int[] arraybey){
//
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < arraybey.length; i++){
//            int value = arraybey[i];
//            if (value < min){
//                min = value;
//            }
//        }
//        return min;
//
//
//    }



}
