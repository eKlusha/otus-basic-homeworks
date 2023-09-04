package ru.otus.java.basic.homeworks.homework5;

class Cat extends Animal {


    public Cat(String name, float runningSpeed, int stamina, int runningFatigue, float actualDistance, float actualTime) {
        super(name, runningSpeed, stamina, runningFatigue, actualDistance, actualTime);
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " плавает как топор и поэтому он побежал в обход");
        distance *= 2;
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
            System.out.println(name + " пробежал(а) " + distance + "метров за " + time + " секунд и у него(неё) осталось " + stamina + " единиц выносливости");
        }
        else if (stamina == 0) {
            System.out.println(name + " устал(а) и больше ни куда не побежит");
        }
    }
}