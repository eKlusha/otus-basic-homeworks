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


    public Animal(String name, float runningSpeed, float swimmingSpeed, int stamina, int runningFatigue, int swimmingFatigue, float actualDistance, float actualTime) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
        this.runningFatigue = runningFatigue;
        this.swimmingFatigue = swimmingFatigue;
        this.actualDistance = actualDistance;
        this.actualTime = actualTime;
    }

    public Animal(String name, float runningSpeed, int stamina, int runningFatigue, float actualDistance, float actualTime) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.stamina = stamina;
        this.runningFatigue = runningFatigue;
        this.actualDistance = actualDistance;
        this.actualTime = actualTime;
    }

    public void run(int distance) {
        float time = 0;
        if (stamina >= distance * runningFatigue) {
            stamina -= runningFatigue * distance;
            time = (distance / runningSpeed);
            actualDistance += distance;
            actualTime += time;
            System.out.println(name + " пробежал(а) " + distance + "метров за " + time + " секунд и у него(неё) осталось " + stamina + " единиц выносливости");
        }
        else if (stamina < distance * runningFatigue && stamina > 0) {
            distance = stamina / runningFatigue;
            stamina = 0;
            time = (distance / runningSpeed);
            actualDistance += distance;
            actualTime += time;
            System.out.println(name + " пробежал(а) " + distance + " метров за " + time + " секунд и у него(неё) осталось " + stamina + " единиц выносливости");
        }
        else if (stamina == 0) {
            System.out.println(name + " устал(а) и больше ни куда не побежит");
        }
    }

    public void swim(int distance) {
        float time = 0;
        if (stamina >= distance * swimmingFatigue) {
            stamina -= swimmingFatigue * distance;
            time = (distance / swimmingSpeed);
            actualDistance += distance;
            actualTime += time;
            System.out.println(name + " проплыл(а) " + distance + "метров за " + time + " секунд и у него(неё) осталось " + stamina + " единиц выносливости");
        }
        else if (stamina < distance * runningFatigue && stamina > 0) {
            distance = stamina / swimmingFatigue;
            stamina = 0;
            time = (distance / swimmingSpeed);
            actualDistance += distance;
            actualTime += time;
            System.out.println(name + " проплыл(а) " + distance + " метров за " + time + " секунд и у него(неё) осталось " + stamina + " единиц выносливости");
        }
        else if (stamina == 0) {
            System.out.println(name + " устал(а) и больше ни куда не поплывёт");
        }
    }

    void info() {
        System.out.println("Имя: " + name + ", оставщаяся выносливость: " + stamina + ", пройденная дистанция: " + actualDistance + " метров за " + actualTime + " секунд");
    }

}
