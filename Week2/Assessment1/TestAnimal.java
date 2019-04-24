package Week2.Assessment1;

/**
 * Created by Cristiana Costa
 * on 2019-04-24
 * Program to test the Animal class
 */

public class TestAnimal {

    public static void main(String[] args) {
        // Write an application class called TestAnimal that will create two Lion objects called myLion1 and myLion2.
        // Initialise the properties required with values of your own choice.
        Lion myLion1 =  new Lion("meat", 14, 8, "Simba");
        Lion myLion2 = new  Lion("meat", 14, 10, "Nala");

        // call the appropriate method to set the age of MyLion1 to 3
        myLion1.setAge(3);

        System.out.println("The number os lions created are " + Lion.getNoOfLions());

        System.out.println(myLion1.toString());

    } //main

} //class
