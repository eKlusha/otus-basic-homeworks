package ru.otus.java.basic.homeworks.homework7.vehicle;


import ru.otus.java.basic.homeworks.homework7.Terrain;

public class CrossCountryVehicle extends BusyVehicle {
    private String type;
    private float fuel;
    private final float fuelConsumption = 0.2f;

    public CrossCountryVehicle(String type, int fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    @Override
    protected void move(int distance, Terrain terrain) {
        if (fuel >= distance * fuelConsumption) {
            fuel -= distance * fuelConsumption;
            System.out.println(type + " проехал " + distance + " километров и у него осталось " + fuel + " литров ДТ");
        } else {
            System.out.println("у вездехода не хватит топлива для преодоления дистанции");
        }
    }
}