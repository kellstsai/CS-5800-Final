package com.example;

public class Driver implements Observer {
    public String name;
    public String address;
    public String county;

    public Driver(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
    }

    @Override
    public void update(Order order) {
        System.out.println("Driver " + name + " notified about new order: " + order);
    }

    public String getName() {
        return name; 
    }
}
