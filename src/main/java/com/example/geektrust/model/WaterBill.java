package com.example.geektrust.model;

public class WaterBill {
    private double consumption;
    private double amount;

    public WaterBill(double consumption, double amount) {
        this.amount = amount;
        this.consumption = consumption;
    }

    public double getAmount() {
        return amount;
    }

    public double getConsumption() {
        return consumption;
    }
}
