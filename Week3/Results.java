package Week3;

import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-20
 * Program to Read in and store the names of 5 students with the
 *  * exam marks achieved in 3 modules then output a table
 *  * with the student’s name, marks for each module the
 *  * student’s average mark and the average for each module
 */

public class Results {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int STUDENTS = 5;
        final int MODULES = 3;
        double total;

        // Array to store names
        String [] names = new String[STUDENTS];
        // Array to store marks
        int[][] marks = new int[STUDENTS][MODULES];
        // Array to student averages
        double [] studentAverages = new double[STUDENTS];
        // Array to store module averages
        double [] moduleAverages = new double[MODULES];

        //Read in the name and marks for each student
        for(int rows=0; rows < STUDENTS; rows++){
            System.out.print("Name student " + (rows+1) + ": ");
            names[rows] = scan.nextLine();
            for(int columns = 0; columns<MODULES; columns++){
                System.out.print("Enter mark " + (columns +1) + ": ");
                marks[rows][columns] = scan.nextInt();
            }
            scan.nextLine();
        }

        // Calculate the average mark for each student
        for(int row = 0; row < STUDENTS; row ++){
            total = 0.0;
            for (int column = 0; column < MODULES; column++){
                total += marks[row][column];
            }
            studentAverages[row] = total / MODULES;
        }

        // Calculate the average mark for each module
        for (int column = 0; column < MODULES; column++){
            total = 0.0;
            for(int row = 0; row < STUDENTS; row++){
                total += marks[column][row];
            }
            moduleAverages[column] = total / STUDENTS;
        }

        // Output the results
        System.out.println("\nName\t\t\tMark 1\tMark 2\tMark 3\tAverage");
        for(int row = 0; row < STUDENTS; row++){
            System.out.println(names[row]);
            for(int column = 0; column < MODULES; column++){
                System.out.print("\t\t" + marks[row][column]);
            }
        }


    } //main

} //class
