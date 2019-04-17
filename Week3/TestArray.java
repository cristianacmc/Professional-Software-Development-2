package Week3;

import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-16
 * Program to
 */

public class TestArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] myNumber = new int[8];
        int odd = 0;
        int even = 0;
        int sum = 0;
        double average;

        for(int i=0; i < myNumber.length; i++){
            System.out.print("Enter number " + (i+1) + " : ");
            myNumber[i] = scan.nextInt();
            if (myNumber[i] % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        //the sum of the numbers in the array
        for(int i=0; i < myNumber.length; i++){
            sum += myNumber[i] ;
        }
        average = (double)sum / myNumber.length;

        System.out.println("The array contains " + odd + " odd numbers");
        System.out.println("The array contains " + even + " even numbers");
        System.out.println("The sum of the numbers in the array are " + sum);
        System.out.println("The average of the numbers in the array are " + average);



    } //main

} //class
