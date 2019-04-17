package Week3;

/**
 * Created by Cristiana Costa
 * on 2019-04-16
 * Program to find the min and max numbers in the array
 */

public class MinMax {

    public static void main(String[] args) {
        int[] list = {50, 2, 8, 34, 75, 19, 20, 44, 31, 60};
        int index = 0;
        int small =  list[0];
        int bigger = list[0];

        for (int i=1; i < list.length; i++){
            if(list[i] > bigger){
                bigger = list[i];
            }
            if(list[i] < small){
                small = list[i];
            }
        }
        System.out.println("The smallest number is: " + small);
        System.out.println("The biggest number is: " + bigger);
    } //main

} //class
