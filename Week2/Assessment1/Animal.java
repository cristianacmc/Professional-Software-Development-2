package Week2.Assessment1;

/**
 * Created by Cristiana Costa
 * on 2019-04-23
 * Program to store information on various types of animals
 */

public class Animal {

    String kindOfFood;
    int lifeExpectancy;

    //constructor methods
    public Animal(){

    }

    public Animal(String customKindOfFood){

        kindOfFood = customKindOfFood;
    }

    public Animal(int customLifeExpectancy){

        lifeExpectancy = customLifeExpectancy;
    }

    public Animal(String customKindOfFood, int customLifeExpectancy){

        kindOfFood = customKindOfFood;
        lifeExpectancy = customLifeExpectancy;
    }

    public String toString(){
        return("This " + this.kindOfFood + "-eater has a life expectancy of " + this.lifeExpectancy + " years.");
    }

    public static void main(String[] args) {
    } //main

} //class
