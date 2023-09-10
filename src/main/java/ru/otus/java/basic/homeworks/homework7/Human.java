package ru.otus.java.basic.homeworks.homework7;

public class Human {
    private String name;
    private boolean DriveVehicle;
    private int stamina;
    private String actualVehicle = "без транспорта";


    public Human(String name, boolean driveVehicle, int stamina) {
        this.name = name;
        DriveVehicle = driveVehicle;
        this.stamina = stamina;
    }
    String getName() {
        return name;
    }
    public boolean isDriveVehicle() {
        return DriveVehicle;
    }
    public int getStamina() {
        return stamina;
    }
     public String getActualVehicle() {
        return actualVehicle;
    }


    void setDriveVehicle(boolean driveVehicle) {
        DriveVehicle = driveVehicle;
    }

    void setStamina(int stamina) {
        this.stamina = stamina;
    }

    void setActualVehicle(String actualVehicle) {
        this.actualVehicle = actualVehicle;
    }
}

