package com.company;

public class Cat extends Animals{

    public Cat(String name, int lenght, int weight, int years, String color) {
        super(name, lenght, weight, years, color);
    }

    @Override
    public void color(String color) {
        System.out.println("Кот цветом: " + color + "\n");
    }

}
