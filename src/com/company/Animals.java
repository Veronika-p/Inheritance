package com.company;

public abstract class Animals {

    private String name;
    private int lenght;
    private int weight;
    private int years;
    private String color;

    public Animals (String name, int lenght, int weight, int years, String color){
        this.setValues(name, lenght, weight, years, color);
    }

    public abstract void color(String color);

    public Animals (String name, String color){
        this.name = name;
        this.color = color;
    }

    protected void setValues (String name, int lenght, int weight, int years, String color){
        this.name = name;
        this.lenght = lenght;
        this.weight = weight;
        this.years = years;
        this.color = color;
    }

    protected String getValues(){
        String info = "Данные о животном: " +  "\nИмя: " + this.name
                +  "\nЦвет: " + this.color + "\nРост: " + this.lenght + "см" + "\nВес: "
                + this.weight + "кг"+ "\nПолных лет: " + this.years + "\n";
        return info;
    }
}
