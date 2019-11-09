package com.company;

public class SalesCommissioned extends Employee {

    private double percentage;
    private double sales;


    public SalesCommissioned(String name, double percentage, double sales) {
        super(name);
        this.percentage = percentage;
        this.sales = sales;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double computePay () { //Each compute pay overrides employee
        double totalPay = percentage /100 * sales;
        return totalPay;
    }

    @Override
    public String toString() {
        return "SalesCommissioned{" +
                "percentage=" + percentage +
                ", sales=" + sales +
                '}';
    }
}
