package Lab1;
import java.text.DecimalFormat;

/**
 * Created by Cristiana Costa
 * on 2019-04-03
 * Program to analyse the suitcase code
 */

public class Suitcase {

    private static int noOfSuitcases = 0;

    private String colour, material; private int wheels;
    private boolean cabin;
    private double price;

    public Suitcase() {
        noOfSuitcases++;
    }
    public Suitcase(String pColour, String pMaterial, int pWheels, boolean pCabin, double pPrice) {

        colour = pColour; material = pMaterial; wheels = pWheels; cabin = pCabin;
        price = pPrice;
        noOfSuitcases++;
    }
    public Suitcase(String pColour, String pMaterial) {
        colour = pColour; material = pMaterial;
        cabin = false;
        price = 0.00;
        noOfSuitcases++;
    }// Constructor

    public Suitcase(String pColour, boolean pCabin) {
        colour = pColour; cabin = pCabin;
        wheels = 0;
        price = 0.00;
        noOfSuitcases++;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean getCabin () {
        return cabin;
    }

    public double getPrice() {
        return price;
    }

    public void setColour(String pColour) {
        colour = pColour;
    }

    public void setMaterial(String pMaterial) {
        material = pMaterial;
    }

    public void setWheels(int pWheels) {
        wheels = pWheels;
    }

    public void setCabin (boolean pCabin) {
        cabin = pCabin;
    }

    public void setPrice(double pPrice) {
        price = pPrice;
    }

    // NOW A PRINT METHOD
    public void printSuitcase() {
        DecimalFormat df = new DecimalFormat("$00.00");
        System.out.println ("I own a " + colour + ", " + material + " suitcase."); System.out.println ("It has " + wheels + " wheels"); System.out.println ("It cost me " + df.format(price));
        if (cabin)
            System.out.println ("It is cabin-friendly");
        else System.out.println ("It needs to be place in the hold");
    }
    // PREFERABLE
    public String toString() {
        DecimalFormat df = new DecimalFormat("£00.00"); String temp;
        temp = "************************";
        temp = temp + "\nThis is a " + colour + ", " + material + " suitcase.\n"; temp = temp + "It has " + wheels + " wheels\n";
        temp = temp + "It cost " + df.format(price) + "\n";
        if (cabin)
            temp = temp + "It is cabin-friendly\n";
        else temp = temp + "It needs to be placed in the hold\n"; temp = temp + "************************";
        return temp; }

    public static int getNoOfSuitcases() {
        return noOfSuitcases;
    }

    public static void printNoOfSuitcases1 () {
        System.out.println("We have built " + noOfSuitcases + " suitcases.");
    }

    public static void printNoOfSuitcases () {
        System.out.println("We have built " + getNoOfSuitcases() + " suitcases.");
    }
}//Suitcase