package Week3;
import java.util.Scanner;


/**
 * Created by Cristiana Costa
 * on 2019-04-16
 * Program to read 6 integers and print the numbers in one line and then print the numbers in reverse order on the next line
 */

public class Reverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] number = new int[6];

        for(int i = 0; i < number.length; i++){
            System.out.print("Enter number " + (i+1) +": " );
            number[i] = scan.nextInt();
        }

        // print the array in order
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i]);
            if (i < number.length){
                System.out.print(" ");
            }
        }
        System.out.println();

        // print the array in reverse order
        for(int i = number.length -1; i >= 0 ; i--){
            System.out.print(number[i]);
            if (i > 0){
                System.out.print(" ");
            }
        }

    } //main

} //class
