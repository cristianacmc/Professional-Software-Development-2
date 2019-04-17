package Lab2.Company;

import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-09
 * Program to test the classes and subclasses
 */

public class TestEmployee {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Employee Number: ");
        String num = scan.nextLine();

        System.out.println("Employee Name: ");
        String name = scan.nextLine();


        PartTimeEmployee employee4 = new PartTimeEmployee();

        employee4.setNumber(num);
        employee4.setName(name);

        System.out.println("Hourly Pay: ");
        employee4.setHourlyPay(scan.nextDouble());

        System.out.println("Hours worked per month: ");
        employee4.setHoursPerMonth(scan.nextInt());

        //output the Employee Number and Monthly Pay
        System.out.println("Employee: " + num);
        System.out.println("Monthly Pay: $ " + employee4.calculateMonthlyPay(employee4.getHoursPerMonth(), employee4.getHoursPerMonth()));


    } //main

} //class
