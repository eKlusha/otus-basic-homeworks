package ru.otus.java.basic.homeworks.homework7;

import ru.otus.java.basic.homeworks.homework7.vehicle.*;

public class HomeWork7 {
    public static void main(String[] args) {
        Human human = new Human("Павлик");
        BusyVeahicle car = new Car("легковой автомобиль", 40);
        Horse horse = new Horse("Лошадь", 50);
        Bicycle bicycle = new Bicycle("велосипед");
        CrossCountryVehicle ccv = new CrossCountryVehicle("вездеход", 50);

human.move(50,Terrain.swamp);
human.setCurrentTransport(car);
human.move(50,Terrain.plain);

car.drive(50, Terrain.plain);
human.dismount();
human.move(40,Terrain.swamp);

    }

}

