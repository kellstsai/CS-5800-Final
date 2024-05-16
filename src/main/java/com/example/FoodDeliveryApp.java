package com.example;

import java.util.ArrayList;

public class FoodDeliveryApp {
    public static void main(String[] args) {
        EntityFactoryManager entityFactoryManager = EntityFactoryManager.getInstance();
        EntityFactory<Restaurant> restaurantFactory = entityFactoryManager.getRestaurantFactory();
        EntityFactory<Customer> customerFactory = entityFactoryManager.getCustomerFactory();
        EntityFactory<Driver> driverFactory = entityFactoryManager.getDriverFactory(); 

        Restaurant restaurant = restaurantFactory.create("Restaurant Test", "000 Street", "SB County");
        Customer customer = new Customer("Kelly Tsai", "111 Street", "Orange County");
        Driver driver = new Driver("Driver Test", "222 Street", "LA County", getDriverShifts()); 

        OrderManager orderManager = OrderManager.getInstance();
        orderManager.addObserver(driver);

        MealModifierManager mealModifierManager = MealModifierManager.getInstance();
        mealModifierManager.addModifier(new DietaryRestrictionModifier("Vegetarian"));
        mealModifierManager.addModifier(new AdditionalToppingModifier("Extra Cheese"));

        Meal meal = new Meal("Burger");
        mealModifierManager.modifyMeal(meal);

        Order order = new Order(restaurant, customer, new ArrayList<>(), new ArrayList<>(), driver); 

        orderManager.notifyObservers(order);
    }
}
