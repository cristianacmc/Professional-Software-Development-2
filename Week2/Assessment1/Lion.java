package Week2.Assessment1;

/**
 * Created by Cristiana Costa
 * on 2019-04-24
 * Program to create the subclass Lion
 */

public class Lion extends Animal {

    //class variable
    static int numberOfLion = 0;

    // instance variables
    int age;
    String name;
    boolean hasMane;

    // constructor methods
    public Lion(){
        super();
        numberOfLion++;
    }

    public Lion(String customKindOfFood, int customLifeExpectancy, int customAge, String customName, boolean customHasMane){
        super(customKindOfFood,customLifeExpectancy);
        numberOfLion++;
        age = customAge;
        name = customName;
        hasMane = customHasMane;
    }

    // setters methods
    public void setAge(int customAge) {
        age = customAge;
    }

    public String toString(){
        String mane;
        if(hasMane == true){
            mane = "It has mane. ";
        } else {
            mane = "It doesn't have mane. ";
        }
        return ("The name of the lion is " + this.name + " and it is " + this.age + " years old. " + mane + super.toString());
    }


    public static int getNoOfLions() {

        return numberOfLion;
    }

    public static void main(String[] args) {
    } //main

} //class
