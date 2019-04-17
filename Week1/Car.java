package Lab1;
import java.util.Calendar;

/**
 * Created by Cristiana Costa
 * on 2019-04-02
 * Program to
 */

public class Car {

    // 1 - private attributes for a car
    private int id;
    private String make;
    private String ownerName;
    private String colour;
    private int yearOfManufacture;
    private int topSpeed;
    private double costPrice;

    // 1.6
    private static int noOfBoxes = 0;

    public static int numberOfBoxes(){
        return noOfBoxes;
    }


    // a constructor that assigns the value for all the 7 parameters
    public Car(int customId, String customMake, String customOwner, String customColour,
               int customYear, int customTop, double customPrice ){
        noOfBoxes ++;
        id = customId;
        make = customMake;
        ownerName = customOwner;
        colour = customColour;
        yearOfManufacture = customYear;
        topSpeed = customTop;
        costPrice = customPrice;
    }

    // default constructor
    public Car(){

        // each time a new box is created the variable is incremented by 1
        noOfBoxes++;
    }

    // a constructor that receives 4 parameters in the signature and assign the values
    public Car(int customId, String customMake, String customOwner, String customColour){

        // each time a new box is created the variable is incremented by 1
        noOfBoxes++;
        id = customId;
        make = customMake;
        ownerName = customOwner;
        colour = customColour;
    }

    // a constructor that receives 3 parameters in the signature and assign the values
    public Car(int customId, String customOwner, int customSpeed){

        // each time a new box is created the variable is incremented by 1
        noOfBoxes++;
        id = customId;
        ownerName = customOwner;
        topSpeed = customSpeed;
    }

    // 3.1 print out all the information about the car
    public void printCarInfo(){
        System.out.println("The id is " + id);
        System.out.println("The make is " + make);
        System.out.println("The Owner name is " + ownerName);
        System.out.println("The colour is " + colour);
        System.out.println("The year of manufacture is " + yearOfManufacture);
        System.out.println("The top speed is " + topSpeed);
        System.out.println("The price is " + costPrice);
    }

    // 3.4 setters
    public void setID (int itsID){
        id = itsID;
    }

    public void setMake (String itsMake){
        make = itsMake;
    }

    public void setOwner (String whoOwns){
        ownerName = whoOwns;
    }

    public void setColour (String itsColour){
        colour = itsColour;
    }

    public void setYear (int whenBuild){
        yearOfManufacture = whenBuild;
    }

    public void setSpeed (int maxSpeed){
        topSpeed = maxSpeed;
    }

    public void setCost (double price){
        costPrice = price;
    }

    // 3.4 getters
    public int getId(){
        return id;
    }

    public String getMake(){
        return make;
    }

    public String getOwner(){
        return ownerName;
    }

    public String getColour(){
        return colour;
    }

    public int getYear(){
        return yearOfManufacture;
    }

    public int getSpeed(){
        return topSpeed;
    }

    public double getCost(){
        return costPrice;
    }

    // 3.8 return the age of the car using Calendar class
    public int ageOfCar(int customYear){
        Calendar cal = Calendar.getInstance();

        // considering the possibility that no year of nanufacture has been recorded
        if (customYear != 0){
            return cal.get(Calendar.YEAR) - customYear;
        } else {
            return -1;
        }
    }

    // 3.11 return the current value of the car based on the annual depreciation rate
    public double currentValue(int customYear, double rate){

        // consider the possibility of no cost price or year of manufacture has been recorded
        if(getCost() != 0 || getYear() != 0){
            double currentValue = getCost() - (getCost() *(rate / 100) * ageOfCar(customYear));
            return currentValue;
        } else {
            return -1.0;
        }
    }


    public static void main(String[] args) {

    } //main

} //class
