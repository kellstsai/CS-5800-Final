package com.example;

public class AdditionalToppingModifier implements MealModifier {
    public String topping; 

    public AdditionalToppingModifier(String topping) {
        this.topping = topping;
    }

    @Override
    public void modify(Meal meal) {
        meal.addIngredient(topping);
    }
}
