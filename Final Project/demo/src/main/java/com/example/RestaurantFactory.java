package com.example;

public class RestaurantFactory implements EntityFactory<Restaurant> {
    @Override
    public Restaurant create(String name, String address, String county) {
        return new Restaurant(name, address, county); 
    }
}
