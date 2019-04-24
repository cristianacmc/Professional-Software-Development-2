package Week2.Assessment1;

/**
 * Created by Cristiana Costa
 * on 2019-04-24
 * Program to
 */

public class Lion extends Animal {

    //class variable
    static int numberOfLion = 0;

    // instance variables
    int age;
    String name;

    // constructor methods
    public Lion(){
        super();
        numberOfLion++;
    }

    public Lion(String customKindOfFood, int customLifeExpectancy, int customAge, String customName){
        super(customKindOfFood,customLifeExpectancy);
        numberOfLion++;
        age = customAge;
        name = customName;
    }

    // setters methods
    public void setAge(int customAge) {
        age = customAge;
    }

    public String toString(){
        return ("The name of the lion is " + this.name + " and it is " + this.age + " years old." + super.toString());
    }


    public static int getNoOfLions() {

        return numberOfLion;
    }

    public static void main(String[] args) {
    } //main

} //class
