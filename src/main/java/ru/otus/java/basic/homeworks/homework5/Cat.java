package ru.otus.java.basic.homeworks.homework5;

class Cat extends Animal {


    Cat(String name, float runningSpeed, int stamina, int runningFatigue, float actualDistance, float actualTime) {
        super(name, runningSpeed, stamina, runningFatigue, actualDistance, actualTime);
    }

    @Override
    float run(int distance) {
        float distanceHelper = 0.0f;
        float runTime = 0.0f;
        if (stamina > 0) {
            for (int i = 1; i != distance + 1; i++) {
                if (stamina > 0) {
                    stamina--;
                    runTime += (1 / runningSpeed);
                    distanceHelper = i;
                }
            }
            actualDistance += distanceHelper;
            actualTime += runTime;
            System.out.println(name + " пробежал " + distanceHelper + "метров за " + runTime + " секунд и у него осталось " + stamina + " единиц выносливости");
        } else {
            runTime = -1.0f;
            System.out.println(name + " устал и больше ни куда не побежит. Да и ему вообще не нужны были эти ваши беги, он хотел спать %)");
        }
        return runTime;
    }

    @Override
    float swim(int distance) {
        System.out.println(name + " плавает как топор и поэтому он побежал в обход");
        distance *= 2;
        float distanceHelper = 0.0f;
        float runTime = 0.0f;
        if (stamina > 0) {
            for (int i = 1; i != distance + 1; i++) {
                if (stamina > 0) {
                    stamina--;
                    runTime += (1 / runningSpeed);
                    distanceHelper = i;
                }
            }
            actualDistance += distanceHelper;
            actualTime += runTime;
            System.out.println(name + " пробежал " + distanceHelper + "метров за " + runTime + " секунд и у него осталось " + stamina + " единиц выносливости");
        } else {
            runTime = -1.0f;
            System.out.println(name + " устал и больше ни куда не побежит. Да и ему вообще не нужны были эти ваши беги, он хотел спать %)");
        }
        return runTime;
    }
}