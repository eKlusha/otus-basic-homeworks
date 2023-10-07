package ru.otus.java.basic.homeworks.homework7;

public class Human {
    private String name;
    Vehicle currentTransport = Vehicle.noVehicle;
    private Terrain currentTerrain;
    private Car owner;


    public Human(String name, Vehicle currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public Vehicle getCurrentTransport() {
        return this.currentTransport;
    }

    void go(int distance) {
        if (currentTransport != Vehicle.noVehicle) {
            System.out.println(name + " сначала должен спешиться");
        }
        if (currentTransport == Vehicle.noVehicle) {
            System.out.println(name + " прошёл " + distance + " метров пешком");
        }
    }

    void useTransport(Vehicle vehicle) {
        if (vehicle == Vehicle.noVehicle) {
            System.out.println(name + " вроде бы хотел занять транспорт");
        }
        if (vehicle == Vehicle.ccv) {
            this.currentTransport = Vehicle.ccv;
            System.out.println(name + " теперь управляет вездеходом");
        }
        if (vehicle == Vehicle.bicycle) {
            this.currentTransport = Vehicle.bicycle;
            System.out.println(name + " теперь управляет велосипедом");
        }
        if (vehicle == Vehicle.car) {
            this.currentTransport = Vehicle.car;
            System.out.println(name + " теперь управляет легковым автомобилем");
        }
        if (vehicle == Vehicle.horse) {
            this.currentTransport = Vehicle.horse;
            System.out.println(name + " оседлал лошадь");
        }
    }

    void dismount() {
        if (currentTransport == Vehicle.noVehicle) {
            System.out.println(name + " и так на своих двоих");
        }
        if (currentTransport != Vehicle.noVehicle) {
            currentTransport = Vehicle.noVehicle;
            System.out.println(name + " спешился");
        }
    }

    void drive(Car car, int distance, Terrain currentTerrain) {
                if (currentTransport == Vehicle.car) {
            car.drive(distance,currentTerrain);
        } else {
            System.out.println(name + " не за рулём автомобиля" );
        }
    }
    void drive(Bicycle bicycle, int distance, Terrain currentTerrain) {
        if (currentTransport == Vehicle.bicycle) {
            bicycle.drive(distance,currentTerrain);
        } else {
            System.out.println(name + " не на велосипеде");
        }
    }
    void drive(CrossCountryVehicle crossCountryVehicle, int distance, Terrain currentTerrain) {
        if (currentTransport == Vehicle.ccv) {
            crossCountryVehicle.drive(distance, currentTerrain);
        } else {
            System.out.println(name + " не управляет вездиходом");
        }
    }
    void drive(Horse horse, int distance, Terrain currentTerrain) {
        if (currentTransport == Vehicle.horse) {
            horse.drive(distance, currentTerrain);
        } else {
            System.out.println(name + " не на коне");

        }
    }
}

