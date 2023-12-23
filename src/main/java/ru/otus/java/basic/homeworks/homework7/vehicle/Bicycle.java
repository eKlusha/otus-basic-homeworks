package ru.otus.java.basic.homeworks.homework7.vehicle;

import ru.otus.java.basic.homeworks.homework7.Terrain;

public class Bicycle extends BusyVehicle {
    private String type;

    public Bicycle(String type) {
        this.type = type;
    }

    @Override
    protected void move(int distance, Terrain terrain) {
        if (terrain != Terrain.swamp) {
            System.out.println("использовав " + type + ", получилось преодолеть дистанцию в " + distance + " километров");
        } else {
            System.out.println(type + " не может проехать по болоту");
        }
    }
}
