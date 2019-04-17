package Week3;
import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-16
 * Program to inform if the numbers is in the array found and its location
 */

public class FindNumberInArray {

    public static <found> void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = {53, 45, 30, 67, 23};
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        boolean found = false;
        int index = 0;

        while (!(found) && (index < numbers.length)){
            if(num == numbers[index]) {
                found = true;
                System.out.println(num + " has been found in the position " + index);
            }
            index ++;
            }//while

        if(!found){
            System.out.println(num + " has not been found");
        }
    } //main

} //class
