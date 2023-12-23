package ru.otus.java.basic.homeworks.homework7.vehicle;

import ru.otus.java.basic.homeworks.homework7.Terrain;

public class Human {
    private String name;
    static BusyVehicle currentTransport = null;

    public Human(String name) {
        this.name = name;
    }

    public void move(int distance, Terrain terrain) {
        if (currentTransport == null) {
            System.out.println(name + " прошёл " + distance + " километров по " + terrain);
        } else {
            currentTransport.drive(distance, terrain);
        }
    }

    public void dismount() {
        currentTransport.setDriver(null);
        this.currentTransport = null;
    }

    public void setCurrentTransport(BusyVehicle currentTransport) {
        this.currentTransport = currentTransport;
        currentTransport.setDriver(this);
    }
}

