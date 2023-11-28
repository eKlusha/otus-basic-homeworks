package ru.otus.java.basic.homeworks.homework9;

public class Worker {
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Worker");
        sb.append(" ").append(name).append(" ");
        sb.append(", age ").append(age);
        return sb.toString();
    }
}

