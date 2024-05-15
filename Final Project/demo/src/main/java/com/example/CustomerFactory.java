package com.example;

public class CustomerFactory implements EntityFactory<Customer>{
    @Override
    public Customer create(String name, String address, String county) {
        return new Customer (name, address, county);
    }
}
