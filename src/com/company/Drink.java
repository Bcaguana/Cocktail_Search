package com.company;
import java.util.ArrayList;


public class Drink {
    private String name;
    private double size;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Drink(String name){
        this.name = name;
        this.size = 0.0;
    }
    public String getName() {
        return this.name;
    }
    public double getSize(){
        return this.size;
    }
    public void printListOfIngredient(){
        for (Ingredient in : ingredients){
            System.out.println(in.getAmount() + in.getMeasurements() + " of "
            + in.getName());

        }
    }
    public void addIngredient(Ingredient i){
        this.ingredients.add(i);
    }
}
