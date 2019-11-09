package com.company;

public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() { //getName Method
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double computePay () { //computePay Method
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
