package ArrayMaterial;

/**
 * Created by Cristiana Costa
 * on 2019-04-30
 * Program to add 10 to each element of the array
 */

public class Table {

    public static void main(String[] args) {

        int [] myArray = {45, 13, 47, 28, 33};

        for(int index = 0; index < myArray.length; index++){
            myArray[index] += 10;
        }

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
