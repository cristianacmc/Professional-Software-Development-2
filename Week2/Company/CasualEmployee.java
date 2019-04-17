package Lab2.Company;

/**
 * Created by Cristiana Costa
 * on 2019-04-09
 * Program to set the subclass CasualEmployee
 */

public class CasualEmployee extends Employee {
    double hourlyPay;

    // default constructor
    public CasualEmployee(){

    }

    public CasualEmployee(String customNumber, String customName){
        super(customNumber, customName);
    }

    // setters methods
    public void setHourlyPay(double customHourlyPay){
        hourlyPay = customHourlyPay;
    }

    // getters methods
    public double getHourlyPay(){
        return hourlyPay;
    }

    public double calculateWeeklyPay(){
        return hourlyPay * 40;
    }


    public static void main(String[] args) {
    } //main

} //class
