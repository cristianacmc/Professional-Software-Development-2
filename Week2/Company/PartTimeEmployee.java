package Lab2.Company;

/**
 * Created by Cristiana Costa
 * on 2019-04-09
 * Program to set the subclass PartTimeEmployee
 */

public class PartTimeEmployee extends Employee {

    int hoursPerMonth;
    double hourlyPay;

    public PartTimeEmployee(){
        super();
    }

    public PartTimeEmployee(String customNumber, String customName){
        super(customNumber, customName);
    }

    // setters methods
    public void setHourlyPay(double customHourlyPay){
        hourlyPay = customHourlyPay;
    }

    public void setHoursPerMonth(int customHoursPerMonth){
        hoursPerMonth = customHoursPerMonth;
    }

    //getters methods
    public double getHourlyPay(){
        return hourlyPay;
    }

    public int getHoursPerMonth(){
        return hoursPerMonth;
    }

    public double calculateMonthlyPay(int customHoursPerMonth, double hourlyPay){
        return customHoursPerMonth * hourlyPay;
    }

    public static void main(String[] args) {
    } //main

} //class
