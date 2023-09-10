package ru.otus.java.basic.homeworks.homework7;

public class HomeWork7 {
    public static void main(String[] args) {
        Car car = new Car("легковой автомобиль", 100);
        Human human = new Human("Павлик", false, 100);
        Horse horse = new Horse("Лошадь", 50, 1);
        Bicycle bicycle = new Bicycle("велосипед");
        CrossCountryVehicle ccv = new CrossCountryVehicle("вездеход", 100);
horse.drive();
    }

}

