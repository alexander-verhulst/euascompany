package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------");
        Employee emp1 = new Employee("Alexander");
        System.out.println(emp1);
        System.out.println("Employee Class " + emp1.getName());
        System.out.println();
        System.out.println("------------------------------------------------------------");

        System.out.println("------------------------------------------------------------");
        Employee emp2 = new HourlyPaid("Bob", 15, 5);
        System.out.println("Hourly Paid Class " + emp2);
        System.out.println(emp2.getName());
        System.out.println(emp2.computePay()); //UNABLE TO CALL THE GET METHOD AND GET THE RATE OF PAY AND WEEKLY HOURS
        System.out.println(emp2.getName());
        System.out.println("------------------------------------------------------------");

        System.out.println("------------------------------------------------------------");
        Employee emp3 = new SalesCommissioned("Sarah", 10, 200);
        System.out.println("Sales Commissioned Class "+ emp3);
        System.out.println(emp3.computePay());  //UNABLE TO CALL THE GET METHODS AND GET THE PERCENTAGE AND SALES
        System.out.println();
        System.out.println("------------------------------------------------------------");

        System.out.println("------------------------------------------------------------");
        Employee emp4 = new ExecutiveClass("Jack");
        System.out.println(emp4.getName());
        System.out.println("This is the monthly gross pay");
        System.out.println(emp4.computePay()); //Compute increment value
        System.out.println("------------------------------------------------------------");


        System.out.println("------------------------------------------------------------");
        System.out.println("This is my Array List ");

        ArrayList<Employee> roster = new ArrayList<>();
        roster.add(emp1);
        roster.add(emp2);
        roster.add(emp3);
        roster.add(emp4);
        for (int i = 0; i < roster.size(); i++){
            System.out.println(roster.get(i));
        }
        System.out.println("------------------------------------------------------------");

    }
}
