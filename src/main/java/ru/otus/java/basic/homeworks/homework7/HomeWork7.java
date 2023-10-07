package ru.otus.java.basic.homeworks.homework7;

public class HomeWork7 {
    public static void main(String[] args) {
        Human human = new Human("Павлик", Vehicle.noVehicle);
        Car car = new Car("легковой автомобиль", 40);
        Horse horse = new Horse("Лошадь", 50);
        Bicycle bicycle = new Bicycle("велосипед");
        CrossCountryVehicle ccv = new CrossCountryVehicle("вездеход", 50);

        human.go(10);
        human.useTransport(Vehicle.ccv);
        human.useTransport(Vehicle.horse);
        human.useTransport(Vehicle.bicycle);
        human.useTransport(Vehicle.car);
        human.go(100);
        human.dismount();
        human.dismount();
        human.useTransport(Vehicle.car);
        human.drive(car,5,Terrain.swamp);
        human.drive(car,5,Terrain.plain);
        human.drive(car,50,Terrain.forest);
        human.useTransport(Vehicle.bicycle);
        human.drive(car,5,Terrain.plain);
        human.dismount();
        human.useTransport(Vehicle.ccv);
        human.drive(ccv,50,Terrain.swamp);
        human.drive(ccv,50,Terrain.plain);
        human.drive(ccv,50,Terrain.forest);
        human.go(5);
        human.dismount();
        human.useTransport(Vehicle.bicycle);
        human.drive(bicycle,10,Terrain.swamp);
        human.drive(bicycle,10,Terrain.forest);
        human.dismount();
        human.useTransport(Vehicle.horse);
        human.drive(horse,25,Terrain.swamp);
        human.drive(horse,25,Terrain.plain);
        human.drive(horse,25,Terrain.forest);





    }

}

