package ru.otus.java.basic.homeworks.homework7.vehicle;

import ru.otus.java.basic.homeworks.homework7.Terrain;

public class Car extends BusyVeahicle {
    private String type;
    private float fuel;
    private final float fuelConsumption = 0.1f;




    public Car(String type, int fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    @Override
    protected void move(int distance, Terrain terrain) {

        if (terrain == Terrain.plain) {
            if (fuel >= distance * fuelConsumption) {
                fuel -= distance * fuelConsumption;
                System.out.println(type + " проехал " + distance + " километров и у него осталось " + fuel + " литров бензина");
            } else {
                System.out.println("у машины не хватит топлива для преодоления дистанции");
            }
        } else {
            if (terrain == Terrain.forest) {
                System.out.println(type + " не может проехать через густой лес");
            }
            if (terrain == Terrain.swamp)
                System.out.println(type + " не может проехать по болоту");
        }
    }

}
