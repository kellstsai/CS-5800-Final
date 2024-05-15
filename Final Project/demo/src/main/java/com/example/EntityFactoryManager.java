package com.example;

public class EntityFactoryManager {
    public static EntityFactoryManager instance;
    public EntityFactory<Restaurant> restaurantFactory;
    public EntityFactory<Customer> customerFactory;
    public EntityFactory<Driver> driverFactory; 

    public EntityFactoryManager() {
        restaurantFactory = new RestaurantFactory();
        customerFactory = new CustomerFactory();
        driverFactory = new DriverFactory();
    }

    public static synchronized EntityFactoryManager getInstance() {
        if (instance == null) {
            instance = new EntityFactoryManager();
        }
        return instance; 
    }

    public EntityFactory<Restaurant> getRestaurantFactory() {
        return restaurantFactory; 
    }

    public EntityFactory<Customer> getCustomerFactory() {
        return customerFactory;
    }

    public EntityFactory<Driver> getDriverFactory() {
        return driverFactory; 
    }
}
