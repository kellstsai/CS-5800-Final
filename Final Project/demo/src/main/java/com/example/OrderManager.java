package com.example;
import java.util.ArrayList;
import java.util.List; 

public class OrderManager {
    public static OrderManager instance;
    public List<Observer> observers = new ArrayList<>(); 
    public OrderManager() {}

    public static synchronized OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance; 
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Order order) {
        for (Observer observer : observers) {
            observer.update(order);
        }
    }
}
