package Week3;
import javax.swing.plaf.ColorUIResource;
import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-17
 * Program to store details of Janes University timetable and print them out in tabular form
 */

public class Timetable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int NOOFDAYS = 5;
        final int NOOFSLOTS = 8;

        // Array to store days of the week
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thrusday", "Friday"};

        // 2D Array String array to represent each hourly slot (9am – 5pm)
        String[][] slot = new String[NOOFDAYS][NOOFSLOTS];

        for(int row=0; row < NOOFDAYS; row++) {
            for (int column = 0; column < NOOFSLOTS; column++) {
                slot[0][0] = "COM465";
                slot[0][2] = "COM564";
                slot[0][3] = "COM564";
                slot[0][6] = "COM564";
                slot[1][1] = "COM564";
                slot[1][2] = "COM564";
                slot[1][5] = "COM640";
                slot[1][6] = "COM640";
                slot[1][7] = "COM640";
                slot[2][2] = "COM465";
                slot[2][6] = "COM465";
                slot[4][1] = "COM465";
                slot[4][4] = "COM640";
                slot[4][5] = "COM640";
            }
        }


        // Output the results
        System.out.println("\t\t9.00\t\t10.00\t\t11.00\t\t12.00\t\t13.00\t\t14.00\t\t15.00\t\t16.00");
        for(int row=0; row < NOOFDAYS; row++) {
            System.out.print(days[row]);
            for (int column = 0; column < NOOFSLOTS; column++) {
                System.out.print("\t" + slot[row][column]);

            }
            scan.nextLine();
        }


    } //main

} //class
