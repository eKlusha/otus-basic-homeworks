package ru.otus.java.basic.homeworks.homework7;

public class CrossCountryVehicle implements Usable{
    String type;
    int fuel;
    final int fuelConsumption = 1;
    public CrossCountryVehicle (String type, int fuel) {
        this.type = type;
        this.fuel = fuel;
    }
}
