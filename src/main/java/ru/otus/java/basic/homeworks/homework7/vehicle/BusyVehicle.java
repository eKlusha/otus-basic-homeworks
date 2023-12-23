package ru.otus.java.basic.homeworks.homework7.vehicle;

import ru.otus.java.basic.homeworks.homework7.Terrain;

public abstract class BusyVehicle implements Drivable {
    protected Human driver;


    @Override
    public void drive(int distance, Terrain terrain) {
        if (driver == null) {
            System.out.println("нет водителя");
        } else {
            Human.currentTransport.move(distance, terrain);
        }
    }

    protected abstract void move(int distance, Terrain terrain);


    public Human getDriver() {
        return driver;
    }

    public void setDriver(Human driver) {
        this.driver = driver;
    }
}
