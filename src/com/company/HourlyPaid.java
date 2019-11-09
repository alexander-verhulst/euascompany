package com.company;

public class HourlyPaid extends Employee {

    private double rateOfPay;
    private double weeklyHoursWorked;

    public HourlyPaid(String name, double rateOfPay, double weeklyHoursWorked) {
        super(name);
        this.rateOfPay = rateOfPay;
        this.weeklyHoursWorked = weeklyHoursWorked;
    }

    public double getRateOfPay() {
        return rateOfPay;
    }


    public double getWeeklyHoursWorked() {
        return weeklyHoursWorked;
    }


    public double computePay () { //Each compute pay overrides employee
        double totalPay = weeklyHoursWorked * rateOfPay;
        return totalPay;
    }

    @Override
    public String toString() {
        return "HourlyPaid{" +
                "rateOfPay=" + rateOfPay +
                ", weeklyHoursWorked=" + weeklyHoursWorked +
                super.toString() +
                '}';
    }
}
