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
        final int MAX = 1;
        int [] id = new int[MAX];
        String [] make = new String[MAX];
        int [] capacity = new int[5];
        boolean [] automatic = new boolean[MAX];
        boolean found = false;
        int position = 0;

        for(int index=0; index < MAX; index++){
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
        System.out.println("ID\t\tMake\t\t\tCapacity\tAutomatic\n");
        for(int index = 0; index < MAX; index ++ ){
            System.out.println(id[index] + "\t\t" + make[index] + "\t\t\t" + capacity[index] + "\t\t\t" + automatic[index] + "\n");
        }

        System.out.print("Enter the Bus ID: ");
        int ID = scan.nextInt();

        while((!found) && (position < MAX)){
            if (id[position] == ID){
                System.out.print("ID\tMake\t\tCapacity\tAutomatic\n");
                System.out.println(id[position] + "\t" + make[position] + "\t\t" + capacity[position] + "\t\t\t" + automatic[position]);
                found = true;
            } else {
                position ++;
            }
        }

    } //main

} //class
