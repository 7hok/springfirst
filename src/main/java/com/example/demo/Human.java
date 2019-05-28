package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Human
 */

public class Human {
    int age = 5;
    String name = "menghok";

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}