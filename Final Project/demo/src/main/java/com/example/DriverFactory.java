package com.example;

public class DriverFactory implements EntityFactory<Driver>{
    @Override
    public Driver create(String name, String address, String county) {
        return new Driver(name, address, county); 
    }
}
