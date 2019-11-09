package com.company;
import java.util.ArrayList;

//Did this update work?

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Alexander");
        System.out.println(" The data for this Employee is " + emp1 + "\n" + " and the method for get the name is " + emp1.getName() + " \n");

        Employee emp2 = new HourlyPaid("Bob", 15, 5);
        System.out.println(" Emp");
        System.out.println(emp2.getName());
        System.out.println(emp2.computePay() + "\n");

        Employee emp3 = new SalesCommissioned("Sarah", 10, 200);
        System.out.println("Sales Commissioned Class "+ emp3);
        System.out.println(emp3.computePay() + "\n");

        Employee emp4 = new ExecutiveClass("Jack");
        System.out.println(emp4.getName());
        System.out.println("This is the monthly gross pay");
        System.out.println(emp4.computePay() + "\n"); //Compute increment value


        HourlyPaid Bob = new HourlyPaid("Bob", 16, 3);
        System.out.println(" The method to get Bob's name is: " + Bob.getName());
        System.out.println(" The method to get Bob's Rate of Pay is:  " + Bob.getRateOfPay());
        System.out.println(" The method to get the number of hours worked is: " + Bob.getWeeklyHoursWorked() + "\n");


        SalesCommissioned Susan = new SalesCommissioned("Susan", 10, 100);
        System.out.println(" The getter to get Susan's name: " +Susan.getName());
        System.out.println(" The method to get Susan's percentage: " + Susan.getPercentage());
        System.out.println(" The method to get Susan's sale: " + Susan.getSales());
        System.out.println(" The method to calculate Susan's pay: " + Susan.computePay() + "\n");

        ExecutiveClass Rick = new ExecutiveClass("Rick");
        System.out.println(" This is the executive class "+ Rick);
        System.out.println(" Here is the compute pay method for the executive class " + Rick.computePay() + "\n");

        System.out.println("This is my Array List \n");

        ArrayList<Employee> roster = new ArrayList<>();
        roster.add(emp1);
        roster.add(emp2);
        roster.add(emp3);
        roster.add(emp4);
        roster.add(Bob);
        roster.add(Susan);
        roster.add(Rick);
        for (int i = 0; i < roster.size(); i++){
            System.out.println(roster.get(i));
        }


    }
}