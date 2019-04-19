package Week3;

import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-19
 * Program to read in and output the names and marks of 5 students
 */

public class MarksAndGrades {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int MAX = 5;
        String [] name = new String[MAX];
        String [] grade = new String[MAX];
        int [] mark = new int[MAX];

        for(int index = 0; index < MAX; index ++) {
            System.out.print("Name " + (index + 1) + " : ");
            name[index] = scan.nextLine();

            System.out.print("Student " + (index + 1) + " Mark " + ": ");
            mark[index] = scan.nextInt();
            scan.nextLine();

            if (mark[index] >= 70) {
                grade[index] = "Distinction";
            } else {
                if (mark[index] >= 40) {
                    grade[index] = "Pass";
                } else {
                    grade[index] = "Fail";
                }
            }
        }
        System.out.println("Name\t\tMark\tGrade");
        System.out.println("========================");

        for (int index = 0; index < MAX ; index ++){
            System.out.println(name[index] + "\t\t" + mark[index] + "\t\t" + grade[index]);
        }

    } //main

} //class
