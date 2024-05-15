package com.example;

import java.util.ArrayList;
import java.util.List; 

public class Meal {
    public String name;
    public List<String> ingredients = new ArrayList<>(); 

    public Meal(String name) {
        this.name = name; 
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient); 
    }

    @Override
    public String toString() {
        return name + ": " + ingredients; 
    }
}
