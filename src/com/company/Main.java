package com.company;

public class Main {

    public static void main(String[] args) {
        Cat myrzik = new Cat("Мурзик", 50, 7, 3,"Белый");
        System.out.println(myrzik.getValues());

        myrzik.color("Белый");

        Dog archi = new Dog("Арчи", 110, 40, 7, "Черный");
        System.out.println(archi.getValues());

        Animals barsik = new Cat("Barsik", 45, 7, 4,"Grey");
        System.out.println(barsik.getValues());

    }
}
