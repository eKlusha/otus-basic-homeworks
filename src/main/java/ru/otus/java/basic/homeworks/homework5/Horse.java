package ru.otus.java.basic.homeworks.homework5;

class Horse extends Animal {
    Horse(String name, float runningSpeed, float swimmingSpeed, int stamina, int runningFatigue, int swimmingFatigue, float actualDistance, float runTime) {
        super(name, runningSpeed,swimmingSpeed, stamina,runningFatigue,swimmingFatigue,actualDistance,runTime);
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
            System.out.println(name + " пробежала " + distanceHelper + "метров за " + runTime + " секунд и у неё осталось " + stamina + " единиц выносливости");
        } else {
            runTime = -1.0f;
            System.out.println(name + " устала и больше ни куда не побежит. Но ведьмаку было всё равно)");
        }
        return runTime;
    }
    @Override
    float swim(int distance) {
        float distanceHelper = 0.0f;
        float swimTime = 0.0f;
        if (stamina > 0) {
            for (int i = 1; i != distance + 1; i++) {
                if (stamina > 0) {
                    stamina -= 4;
                    swimTime += (1 / swimmingSpeed);
                    distanceHelper = i;
                }
            }
            actualDistance += distanceHelper;
            actualTime += swimTime;
            System.out.println(name + " проплыла " + distanceHelper + "метров за " + swimTime + " секунд и у неё осталось " + stamina + " единиц выносливости");
        } else {
            actualTime = -1.0f;
            System.out.println(name + " устала и больше ни куда не поплывёт");
        }
        return actualTime;
    }
}
