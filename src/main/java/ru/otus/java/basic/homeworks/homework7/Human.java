package ru.otus.java.basic.homeworks.homework7;

import ru.otus.java.basic.homeworks.homework7.vehicle.BusyVeahicle;
import ru.otus.java.basic.homeworks.homework7.vehicle.Drivable;

public class Human {
    private String name;
    private BusyVeahicle currentTransport = null;

    public Human(String name) {
        this.name = name;
    }

    public boolean move(int distance, Terrain terrain) {
        if (currentTransport == null) {
            System.out.println("иду пешком");
        } else {
            currentTransport.drive(distance, terrain);
        }
        return true;
    }



    public void dismount() {
        currentTransport.setDriver(null);
        this.currentTransport = null;
    }

    public void setCurrentTransport(BusyVeahicle currentTransport) {
        this.currentTransport = currentTransport;
        currentTransport.setDriver(this);
    }

    //    void go(int distance) {
//        if (currentTransport != Vehicle.noVehicle) {
//            System.out.println(name + " сначала должен спешиться");
//        }
//        if (currentTransport == Vehicle.noVehicle) {
//            System.out.println(name + " прошёл " + distance + " метров пешком");
//        }
//    }
//
//    void useTransport(Vehicle vehicle) {
//        switch (vehicle) {
//            case noVehicle:
//                System.out.println(name + "не управляет транспортным средством");
//                break;
//            case car:
//                System.out.println(name + " теперь управляет легковым автомобилем");
//                break;
//            case ccv:
//                System.out.println(name + " теперь управляет вездеходом");
//                break;
//            case horse:
//                System.out.println(name + " оседлал лошадь");
//                break;
//            case bicycle:
//                System.out.println(name + " теперь управляет велосипедом");
//        }
//    }
//
//    void dismount() {
//        if (currentTransport == Vehicle.noVehicle) {
//            System.out.println(name + " и так на своих двоих");
//        }
//        if (currentTransport != Vehicle.noVehicle) {
//            currentTransport = Vehicle.noVehicle;
//            System.out.println(name + " спешился");
//        }
//    }
//
//    void drive(Car car, int distance, Terrain currentTerrain) {
//        if (currentTransport == Vehicle.car) {
//            car.drive(distance, currentTerrain);
//        } else {
//            System.out.println(name + " не за рулём автомобиля");
//        }
//    }
//
//    void drive(Bicycle bicycle, int distance, Terrain currentTerrain) {
//        if (currentTransport == Vehicle.bicycle) {
//            bicycle.drive(distance, currentTerrain);
//        } else {
//            System.out.println(name + " не на велосипеде");
//        }
//    }
//
//    void drive(CrossCountryVehicle crossCountryVehicle, int distance, Terrain currentTerrain) {
//        if (currentTransport == Vehicle.ccv) {
//            crossCountryVehicle.drive(distance, currentTerrain);
//        } else {
//            System.out.println(name + " не управляет вездиходом");
//        }
//    }
//
//    void drive(Horse horse, int distance, Terrain currentTerrain) {
//        if (currentTransport == Vehicle.horse) {
//            horse.drive(distance, currentTerrain);
//        } else {
//            System.out.println(name + " не на коне");
//
//        }
//    }
}

