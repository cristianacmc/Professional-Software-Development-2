package ArrayMaterial;

/**
 * Created by Cristiana Costa
 * on 2019-05-01
 * Program to move the elements of the array
 */

public class Clockwise {

    public static void main(String[] args) {
        int [] myArray = {45, 13, 47, 28, 33};

        int temp = myArray[myArray.length-1];
        for (int index = myArray.length-1; index > 0 ; index--){
            myArray[index] = myArray[index - 1];
        }
        myArray[0] = temp;

       System.out.print("{");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i]);
            if (i < myArray.length-1 ){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    } //main

} //class
