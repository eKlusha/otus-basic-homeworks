package ru.otus.java.basic.homeworks.homework5;

abstract class Animal {
    protected String name;
    protected float runningSpeed;
    protected float swimmingSpeed;
    protected int stamina;
    protected int runningFatigue;
    protected int swimmingFatigue;
    protected float actualDistance;
    protected float actualTime;


    Animal(String name, float runningSpeed, float swimmingSpeed, int stamina, int runningFatigue, int swimmingFatigue, float actualDistance, float actualTime) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
        this.actualDistance = actualDistance;
        this.actualTime = actualTime;
    }

    Animal(String name, float runningSpeed, int stamina, int runningFatigue, float actualDistance, float actualTime) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.stamina = stamina;
        this.actualDistance = actualDistance;
        this.actualTime = actualTime;
    }

    float run(int distance) {
        float distanceHelper = 0.0f;
        float runTime = 0.0f;
        if (stamina > 0) {
            for (int i = 1; i != distance + 1; i++) {
                if (stamina > 0) {
                    stamina -= runningFatigue;
                    runTime += (1 / runningSpeed);
                    distanceHelper = i;
                }
            }
            actualDistance += distanceHelper;
            actualTime += runTime;
            System.out.println(name + " пробежал " + actualDistance + "метров за " + runTime + " секунд и у него осталось " + stamina + " единиц выносливости");
        } else {
            actualTime = -1.0f;
            System.out.println(name + " устал и больше ни куда не побежит");
        }
        return actualTime;
    }

    float swim(int distance) {
        float distanceHelper = 0.0f;
        float swimTime = 0.0f;
        if (stamina > 0) {
            for (int i = 1; i != distance + 1; i++) {
                if (stamina > 0) {
                    stamina -= swimmingFatigue;
                    swimTime += (1 / swimmingSpeed);
                    distanceHelper = i;
                }
            }
            actualDistance += distanceHelper;
            actualTime += swimTime;
            System.out.println(name + " проплыл " + actualDistance + "метров за " + swimTime + " секунд и у него осталось " + stamina + " единиц выносливости");
        } else {
            actualTime = -1.0f;
            System.out.println(name + " устал и больше ни куда не поплывёт");
        }
        return actualTime;
    }

    void info() {
        System.out.println("Имя: " + name + ", оставщаяся выносливость: " + stamina + ", пройденная дистанция: " + actualDistance + " метров за " + actualTime + " секунд");
    }

}
