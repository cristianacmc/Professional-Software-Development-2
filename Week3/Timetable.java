package Week3;
import javax.swing.plaf.ColorUIResource;
import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-17
 * Program to store details of Janes University timetable
 */

public class Timetable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thrusday", "Friday"};
        double [] time = {9.00, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00};
        final int ROWS = 5;
        final int COLUMNS = 8;
        String grid [][] = new String [ROWS][COLUMNS];

        for(int row = 0; row < ROWS; row++){
            for(int column = 0; column < COLUMNS; column++){
                System.out.print("\t" + time[column]);

        }



        }//scan.nextLine();
        /*System.out.print("\n");

            System.out.println(days[row] + "\n");
        }*/

        //System.out.print("\t\t" + (grid[1][0] = "Monday"));




    } //main

} //class
