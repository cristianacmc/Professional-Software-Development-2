package Lab1;

import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-02
 * Program to test the Car class
 */

public class TestCar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 3.2 create objects of the class Car
        Car myCar = new Car();
        Car sistersCars = new Car(100, "Ford", "My sister Mary", "Red", 2008, 105, 10995.00);
        Car bossCar = new Car(101, "Honda", "Pat Bell", "Silver", 2011, 210, 27500.00 );
        Car aCar = new Car(102, "Ford", "Janet Allison", "Red");
        Car bCar = new  Car(103, "John Smith", 100);


        // 3.3 call printCarInfo() to output the details of each car
        myCar.printCarInfo();
        sistersCars.printCarInfo();
        bossCar.printCarInfo();
        aCar.printCarInfo();
        bCar.printCarInfo();

        // 3.5 call the set methods to change the attributes of bCar
        bCar.setMake("Vauxhall");
        bCar.setOwner("James Rodgers");
        bCar.setYear(2012);
        bCar.setCost(10000);

        // print out the attributes of the bCar
        System.out.println("********** bCar **********");
        System.out.println("The maker is " + bCar.getMake());
        System.out.println("The owner is " + bCar.getOwner());
        System.out.println("The year of manufacture is " + bCar.getYear());
        System.out.println("The price is £" + bCar.getCost());
        System.out.println();

        // 3.6 create a object cCar and call the set the attributes with the appriate set method
        Car cCar = new Car();

        cCar.setID(104);
        cCar.setMake("Toyota");
        cCar.setOwner("Robert Smith");
        cCar.setColour("Blue");
        cCar.setYear(2010);
        cCar.setSpeed(120);
        cCar.setCost(12000);

        // print out the attibutes of cCar
        System.out.println("********** cCar **********");
        System.out.println("The id is " + cCar.getId());
        System.out.println("The maker is " + cCar.getMake());
        System.out.println("The owner is " + cCar.getOwner());
        System.out.println("The colour is " + cCar.getColour());
        System.out.println("The year is " + cCar.getYear());
        System.out.println("The Top Speed is " + cCar.getSpeed());
        System.out.println("The cost is " + cCar.getCost());
        System.out.println("The age of the cCar is " + cCar.ageOfCar(cCar.getYear()));
        System.out.println();

        // 3.7 print the attributes of bCar using the appropriate get methods
        System.out.println("********** bCar **********");
        System.out.println("The maker is " + bCar.getMake());
        System.out.println("The colour is " + bCar.getColour());
        System.out.println("The year of manufacture is " + bCar.getYear());
        System.out.println();

        // 3.9 print out the age of the cCar using ageOfCar()
        System.out.println("The age of the cCar is " + cCar.ageOfCar(cCar.getYear()));
        System.out.println();

        System.out.println("The age of the aCar is " + aCar.ageOfCar(aCar.getYear()));
        System.out.println();

        // 3.12 prompt the user for depreciation rate
        System.out.println("Enter the depreciation rate of the car: ");
        double rate = scan.nextDouble();
        System.out.println();

        // 3.12 print out the current value of cCar
        System.out.println("The current value of the car cCar is £ " + cCar.currentValue(cCar.getYear(), rate));
        System.out.println("The current value of the car aCar is £ " + aCar.currentValue(aCar.getYear(), rate));




    } //main

} //class
