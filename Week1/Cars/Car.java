package Week1.Cars;
import java.util.Calendar;

/**
 * Created by Cristiana Costa
 * on 2019-04-02
 * Program to create a class Car
 */

public class Car {

    // class variable
    private static int noOfBoxes = 0;

    // instance variables
    private int id;
    private String make;
    private String ownerName;
    private String colour;
    private int yearOfManufacture;
    private int topSpeed;
    private double costPrice;

    // instance method
    private static int numberOfBoxes(){
        return noOfBoxes;
    }


    // constructors
    public Car(){
        noOfBoxes++;
        this.id = 0;
        this.make = "none";
        this.ownerName = "none";
        this.colour = "none";
        this.yearOfManufacture = 0;
        this.topSpeed = 0;
        this.costPrice = 0;
    }

    public Car(int customId, String customMake, String customOwner, String customColour,
               int customYear, int customTop, double customPrice ){
        noOfBoxes ++;
        this.id = customId;
        this.make = customMake;
        this.ownerName = customOwner;
        this.colour = customColour;
        this.yearOfManufacture = customYear;
        this.topSpeed = customTop;
        this.costPrice = customPrice;

    }

    public Car(int customId, String customMake, String customOwner, String customColour){
        noOfBoxes++;
        this.id = customId;
        this.make = customMake;
        this.ownerName = customOwner;
        this.colour = customColour;
        this.yearOfManufacture = 0;
        this.topSpeed = 0;
        this.costPrice = 0;
    }

    public Car(int customId, String customOwner, int customSpeed){
        noOfBoxes++;
        this.id = customId;
        this.make = "none";
        this.ownerName = customOwner;
        this.colour = "none";
        this.yearOfManufacture = 0;
        topSpeed = customSpeed;
        this.costPrice = 0;
    }

    //class method to print out all the information about the car
    public void printCarInfo(){
        System.out.println("The id is " + this.id);
        System.out.println("The make is " + this.make);
        System.out.println("The Owner name is " + this.ownerName);
        System.out.println("The colour is " + colour);
        System.out.println("The year of manufacture is " + this.yearOfManufacture);
        System.out.println("The top speed is " + this.topSpeed);
        System.out.println("The price is " + this.costPrice);
    }

    // 3.4 setters
    public void setID (int itsID){
        id = itsID;
    }

    public void setMake (String itsMake){

        this.make = itsMake;
    }

    public void setOwner (String whoOwns){

        this.ownerName = whoOwns;
    }

    public void setColour (String itsColour){

        this.colour = itsColour;
    }

    public void setYear (int whenBuild){

        this.yearOfManufacture = whenBuild;
    }

    public void setSpeed (int maxSpeed){

        this.topSpeed = maxSpeed;
    }

    public void setCost (double price){

        this.costPrice = price;
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
