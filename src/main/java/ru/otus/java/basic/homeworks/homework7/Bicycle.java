package ru.otus.java.basic.homeworks.homework7;

public class Bicycle implements Usable{
    String type;

    public Bicycle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
