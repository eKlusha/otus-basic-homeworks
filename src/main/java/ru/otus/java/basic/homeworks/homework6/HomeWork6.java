package ru.otus.java.basic.homeworks.homework6;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Бельфегор", 20, false),
                new Cat("Бруно", 35, false),
                new Cat("Люцифер", 18, false),
                new Cat("Василий", 25, false)
        };
        Plate plate = new Plate(150, 150, 5, 50);

        System.out.println(plate);
        plate.putFood();
        for (int i = 0; i < cats.length; i++) {
            plate.decreaseFood(cats[i]);
        }
        System.out.println(plate);
        for (int i = 0; i < cats.length; i++) {
            plate.decreaseFood(cats[i]);
        }
        System.out.println(plate);
        plate.putFood();
        plate.putFood();
        plate.putFood();
        for (int i = 0; i < cats.length; i++) {
            plate.decreaseFood(cats[i]);
        }
        for (int i = 0; i < cats.length; i++) {
            plate.decreaseFood(cats[i]);
        }
        plate.putFood();
        plate.putFood();
        plate.putFood();
        for (int i = 0; i < cats.length; i++) {
            plate.decreaseFood(cats[i]);
        }
        plate.putFood();
        plate.putFood();
        for (int i = 0; i < cats.length; i++) {
            plate.decreaseFood(cats[i]);
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);;
        }
    }
}