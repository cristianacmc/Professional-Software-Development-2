package Lab1;

/**
 * Created by Cristiana Costa
 * on 2019-04-03
 * Program to test the Suitcase class
 */

public class TestSuitcase {

    public static void main(String[] args) {

        Suitcase mySuitcase = new Suitcase("yellow", "wooden", 4, false, 11.99); Suitcase aSuitcase = new Suitcase();
        Suitcase bSuitcase = new Suitcase("black", "leather");
        Suitcase cSuitcase = new Suitcase("red", true);

        mySuitcase.printSuitcase();
        System.out.println(mySuitcase);
        System.out.println(aSuitcase);
        System.out.println(bSuitcase);
        System.out.println(cSuitcase);

        mySuitcase.setColour ("red");

        System.out.println(mySuitcase);

        System.out.println(Suitcase.getNoOfSuitcases());
        Suitcase.printNoOfSuitcases();
    } //main

} //class
