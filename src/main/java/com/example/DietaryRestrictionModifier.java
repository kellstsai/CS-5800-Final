package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; 

public class DietaryRestrictionModifier implements MealModifier {
    public String restriction; 

    public DietaryRestrictionModifier(String restriction) {
        this.restriction = restriction;
    }

    @Override
    public void modify(Meal meal) {
        List<String> modifiedIngredients = new ArrayList<>(); 
        for(Iterator<String> iterator = modifiedIngredients.iterator(); iterator.hasNext();) {
            String ingredient = iterator.next();
            if (isNonVegetarian(ingredient)) {
                iterator.remove(); 
            }
        }
        meal.setIngredients(modifiedIngredients); 
    }

    public boolean isNonVegetarian(String ingredient) {
        return ingredient.toLowerCase().contains("meat"); 
    }
}
