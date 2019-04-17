package Lab2;
import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-03
 * Program to test the Box Class
 */

public class TestCardboardBox {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CardboardBox myBox = new CardboardBox();
        myBox.showAllDetails();

        CardboardBox yourBox = new CardboardBox(15, 5, 25);
        yourBox.showAllDetails();
        yourBox.printFrontArea(15, 5);
        yourBox.printTopArea(15, 25);
        yourBox.printSideArea(25, 5);
        System.out.println("**************************");
        System.out.println();

        CardboardBox aBox = new CardboardBox(20, 15, 10, "brown");
        aBox.showAllDetails();
        aBox.printFrontArea(20, 15);
        aBox.printSideArea(10, 15);
        aBox.printTopArea(20, 10);
        System.out.println("**************************");
        System.out.println();

        //Prompt the user for the 4 attributes and assign these
        System.out.println("Enter the width:");
        myBox.setWidth(scan.nextInt());
        System.out.println("Enter the heigth: ");
        myBox.setHeigth(scan.nextInt());
        System.out.println("Enter the depth: ");
        myBox.setDepth(scan.nextInt());
        System.out.println("Enter the Colour: ");
        myBox.setColour(scan.nextLine());
        System.out.println();
        System.out.println("**************************");

        //myBox.showAllDetails();
        System.out.println();

        System.out.println("The numero of the boxes are: " + CardboardBox.noOfBoxes());


        CardboardBox testBox = new CardboardBox();

        System.out.println("Enter the volume of the granola: ");
        int volume = scan.nextInt();

        System.out.println("Enter the width: ");
        testBox.setWidth(scan.nextInt());
        System.out.println("Enter the heigth: ");
        testBox.setHeigth(scan.nextInt());
        System.out.println("Enter the depth: ");
        testBox.setDepth(scan.nextInt());
        System.out.println();
        System.out.println("The number of the boxes required to store " + volume + " of granola are(is) " + testBox.requiredBoxes(volume));



    } //main

} //class
