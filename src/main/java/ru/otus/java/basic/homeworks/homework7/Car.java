package ru.otus.java.basic.homeworks.homework7;

class Car implements Usable {
    String type;
    int fuel;
    final int fuelConsumption = 1;

    public Car(String type, int fuel) {
        this.type = type;
        this.fuel = fuel;

    }

    @Override
    public void inVehicle(int distance,) {

    }
}
