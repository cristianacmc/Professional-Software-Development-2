package Lab2.Company;

/**
 * Created by Cristiana Costa
 * on 2019-04-09
 * Program to set the subclass FullTimeEmployee
 */

public class FullTimeEmployee extends Employee{

    double annualSalary;

    // constructor methods
    public FullTimeEmployee(){
        super();
    }

    public FullTimeEmployee(String customNumber, String customName){

        super(customNumber, customName);
    }

    // setters methods
    public void setAnnualSalary(double customAnnualSalary){
        annualSalary = customAnnualSalary;
    }

    //getters methods
    public double getAnnualSalary(){
        return annualSalary;
    }

    public double calculateMonthlyPay(){
        return annualSalary/12;
    }

    public static void main(String[] args) {
    } //main

} //class
