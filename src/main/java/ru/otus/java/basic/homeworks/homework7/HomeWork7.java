package ru.otus.java.basic.homeworks.homework7;

import ru.otus.java.basic.homeworks.homework7.vehicle.*;

public class HomeWork7 {
    public static void main(String[] args) {
        Human human = new Human("Павлик");
        BusyVehicle car = new Car("легковой автомобиль", 40);
        Horse horse = new Horse("Лошадь", 50);
        Bicycle bicycle = new Bicycle("велосипед");
        CrossCountryVehicle ccv = new CrossCountryVehicle("вездеход", 50);

        human.move(50, Terrain.swamp);
        human.setCurrentTransport(car);
//        System.out.println(human.getCurrentTransport());
        human.move(50, Terrain.plain);
//        System.out.println(human.getCurrentTransport());
        human.setCurrentTransport(horse);
//        System.out.println(human.getCurrentTransport());
        human.move(50, Terrain.swamp);
        human.setCurrentTransport(ccv);
        human.move(20, Terrain.plain);
        human.dismount();
        human.move(40, Terrain.swamp);
        human.setCurrentTransport(horse);
        human.move(20, Terrain.swamp);
        human.move(20, Terrain.forest);
        human.move(20, Terrain.plain);
        human.setCurrentTransport(bicycle);
        human.move(32, Terrain.swamp);
        human.move(21, Terrain.plain);

    }

}

