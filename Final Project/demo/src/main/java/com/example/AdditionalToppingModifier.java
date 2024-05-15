package com.example;

public class AdditionalToppingModifier {
    public String topping; 

    public AdditionalToppingModifier(String topping) {
        this.topping = topping;
    }

    @Override
    public void modify(Meal meal) {
        //same thing 
    }
}
