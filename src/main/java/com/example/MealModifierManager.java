package com.example;

import java.util.ArrayList;
import java.util.List; 

public class MealModifierManager {
    public static MealModifierManager instance; 
    public List<MealModifier> modifiers = new ArrayList<>(); 

    public MealModifierManager() {} 

    public static synchronized MealModifierManager getInstance() {
        if (instance == null) {
            instance = new MealModifierManager();
        }
        return instance;
    }

    public void addModifier(MealModifier modifier) {
        modifiers.add(modifier); 
    }

    public void modifyMeal(Meal meal) {
        for (MealModifier modifier : modifiers) {
            modifier.modify(meal);
        }
    }
}
