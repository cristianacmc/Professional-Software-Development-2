package Week3;
import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-17
 * Program to store the ID, make and capacity of 5 buses owned by a company
 */

public class Bus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] id = new int[5];
        String [] make = new String[5];
        int [] capacity = new int[5];
        boolean [] automatic = new boolean[5];

        for(int index=0; index < 1; index++){
            //id
            System.out.print("Bus " + (index+1) + " id: ");
            id[index] = scan.nextInt();
            scan.nextLine();
            //make
            System.out.print("Bus " + (index+1) + " make: ");
            make[index] = scan.nextLine();
            //capacity
            System.out.print("Bus " + (index+1) + " capacity: ");
            capacity[index] = scan.nextInt();
            scan.nextLine();
            //automatic
            System.out.print("Bus " + (index+1) + " is automatic: ");
            automatic[index] = scan.hasNextBoolean();
            scan.nextLine();
        }
        System.out.println("ID\t\tMake\t\tCapacity\tAutomatic");
        for(int index = 0; index < 1; index ++ ){
            System.out.println(id[index] + "\t\t" + make[index] + "\t\t" + capacity[index] + "\t\t\t" + automatic[index]);
        }

    } //main

} //class
