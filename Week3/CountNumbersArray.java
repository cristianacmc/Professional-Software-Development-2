package Week3;
import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-16
 * Program to count the number of times that a number is in the array
 */

public class CountNumbersArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = {178, 167, 166, 160, 173, 170, 175, 167};
        int num;
        int count = 0;

        System.out.println("Enter a number: ");
        num = scan.nextInt();

        for (int i = 0; i < numbers.length; i++){
            if(num == numbers[i]){
                count ++;
            }
        }

        System.out.print(num + " appears " + count + " times in the array");

    } //main

} //class
