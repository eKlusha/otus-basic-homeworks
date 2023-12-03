package ru.otus.java.basic.homeworks.homework7.vehicle;


import ru.otus.java.basic.homeworks.homework7.Terrain;

public class Horse implements Drivable {
    private String type;
    private int stamina;
    private final int staminaCost = 1;
    private boolean busy;

    public Horse(String type, int stamina) {
        this.type = type;
        this.stamina = stamina;
    }

    public String getType() {
        return type;
    }

    @Override
    public void drive(int distance, Terrain terrain) {
        if (terrain != Terrain.swamp) {
            if (stamina >= distance * staminaCost) {
                stamina -= distance * staminaCost;
                System.out.println(type + " прошла " + distance + " километров и у неё осталось " + stamina + " единиц выносливости");
            } else {
                System.out.println("у лошади не хватает сил для преодоления дистанции");
            }
        } else {
            System.out.println(type + " не может пройти по болоту");
        }
    }
}

