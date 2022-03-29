package com.example.geektrust.model;

public class TankWaterSlab {
    private double min;
    private double max;
    private double price;
    public TankWaterSlab(double min, double max, double price){
        this.min = min;
        this.max = max;
        this.price = price;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public double getPrice() {
        return price;
    }
}
