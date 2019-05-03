package com.company;

public class Ingredient {
    private String name;
    private double amount;
    private String measurement;

    public Ingredient (String name){
        this.name = name;
        this.amount = 0;
        this.measurement = "mL";
    }
    public double getAmount(){
        return this.amount;
    }

    public String getName(){
        return this.name;
    }
    public String getMeasurements(){
        return this.measurement;
    }
}
