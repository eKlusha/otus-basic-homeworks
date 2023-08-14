package ru.otus.java.basic.homeworks.homework5;

public class HomeWork5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Belphegor", 3.5f, 1000, 1, 0.0f, 0.0f);
        Dog dog = new Dog("Barbas", 12f, 1.5f, 1500, 1, 2, 0.0f, 0.0f);
        Horse horse = new Horse("Plotva", 88f, 1.2f, 2000, 1, 4, 0.0f, 0.0f);

        cat.run(20);
        cat.run(30);
        cat.swim(20);
        cat.info();
        cat.swim(455);
        cat.run(1);
        cat.info();
        dog.run(20);
        dog.run(30);
        dog.swim(20);
        dog.swim(705);
        dog.run(1);
        dog.info();
        horse.run(20);
        horse.run(30);
        horse.swim(20);
        horse.info();
        horse.swim(467);
        horse.run(3);
        horse.info();
    }
}
