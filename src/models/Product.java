package models;


import base.Fiscal;
import base.Income;


public class Product implements  Income, Fiscal {

    private String name;
    private int quantity;
    private double price;
    public final double TAX_RATE = 0.05;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTAX_RATE() {
        return TAX_RATE;
    }


    @Override
    public double getProfit(int quantity, double price) {
        return quantity * price;

    }


    @Override
    public double tax(double profit, double taxRate) {
        return profit * taxRate;
    }


    @Override
    public double getProfit(double profit, double tax) {
        return profit - tax;
    }
}