package com.company;

public class Dog extends Animals{

    public Dog(String name, int lenght, int weight, int years, String color) {
        super(name, lenght, weight, years, color);
    }

    @Override
    public void color(String color) {
        System.out.println("Собака цветом: " + color +"\n");
    }

}
