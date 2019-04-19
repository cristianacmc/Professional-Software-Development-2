package Week3;

import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-17
 * Program to swap values in an array
 */

public class Swap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
        int temp;

        for(int i = 0; i < num.length; i++){
            System.out.print("Number " + (i+1) + ": ");
            num[i] = scan.nextInt();
        }

        int lowIndex = num[0];
        int highIndex = num[num.length-1];

        while(lowIndex <= highIndex){
            temp = highIndex;
            lowIndex = highIndex;
        }
        lowIndex++;
        highIndex++;

        //for (int index = 0; index)
        //System.out.println(num[])

        //System.out.print()
    } //main

} //class
