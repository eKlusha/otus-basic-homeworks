package ru.otus.java.basic.homeworks.homework7;

public class Bicycle implements Usable {
    private String type;
    private boolean busy;

    public Bicycle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void drive(int distance, Terrain terrain) {
        if (terrain != Terrain.swamp) {
            System.out.println("использовав " + type + ", получилось преодолеть дистанцию в " + distance + " километров");
        } else {
            System.out.println(type + " не может проехать по болоту");
        }
    }
}
