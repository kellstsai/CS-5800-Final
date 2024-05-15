package com.example;
import java.util.List;

public class Order {
    public Restaurant restaurant; 
    public Customer customer; 
    public List<String> dietaryRestrictions;
    public List<String> additionalToppings;
    public Driver driver; 

    public Order(Restaurant restaurant, Customer customer, List<String> dietaryRestrictions, List<String> additionalToppings, Driver driver) {
        this.restaurant = restaurant;
        this.customer = customer;
        this.dietaryRestrictions = dietaryRestrictions;
        this.additionalToppings = additionalToppings;
        this.driver = driver; 
    }
}
