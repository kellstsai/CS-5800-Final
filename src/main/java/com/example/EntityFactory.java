package com.example;
import java.util.ArrayList;
import java.util.List; 

public interface EntityFactory<T> {
    T create(String name, String address, String county); 
}
