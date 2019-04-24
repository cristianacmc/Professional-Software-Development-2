package Lab2.Company;

/**
 * Created by Cristiana Costa
 * on 2019-04-09
 * Program to set the super class Employee
 */

public class Employee {


    String number;
    String name;

    public Employee(){

    }

    public Employee(String customNumber, String customName){

        number = customNumber;
        name = customName;
    }


    // setters methods
    public void setName(String itsName){
        name = itsName;
    }

    public void setNumber(String itsNumber){
        name = itsNumber;
    }
    // getters methods
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {

    } //main

} //class
