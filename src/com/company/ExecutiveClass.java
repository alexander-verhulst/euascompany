package com.company;

import java.util.Arrays;

public class ExecutiveClass extends Employee{

    private double [] increment = {1050,1100,1150,1200,1250,1300,1350,1400,1450,1500,1550,1600};

    public ExecutiveClass(String name) {
        super(name);
        this.increment = increment;
    }

    public void getIncrement(double[] increment) {
        this.increment = increment;
    }

    public void setIncrement(double[] increment) {
        this.increment = increment;
    }

    public double computePay () {
        double [] a = increment;
        double grossPay = 0;
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            grossPay = sum+= a[i];
        }
        return grossPay / 12;
    }

    @Override
    public String toString() {
        return "ExecutiveClass{" +
                "increment=" + Arrays.toString(increment) +
                '}';
    }
}
