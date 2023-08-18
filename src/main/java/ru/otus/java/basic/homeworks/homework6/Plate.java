package ru.otus.java.basic.homeworks.homework6;

class Plate {
    private final int maxValueFood;
    private int actualFood;
    private int packageCounter;
    private final int capacityPackage;

    Plate(int maxValueFood, int actualFood, int packageCounter, int capacityPackage) {
        this.maxValueFood = maxValueFood;
        this.actualFood = actualFood;
        this.packageCounter = packageCounter;
        this.capacityPackage = capacityPackage;

    }
    @Override
    public String toString() {
        return "В миске осталось " + actualFood + ". В запасе ещё " + packageCounter + " пакетов по " + capacityPackage + " еды";
    }



    public void putFood() {
        if (actualFood + capacityPackage > maxValueFood) {
            System.out.println("В миске достаточно еды.");
        } else {
          actualFood += capacityPackage;
          packageCounter--;
            System.out.println("Вы насыпали еду в миску. Осталось " + packageCounter + " пакетов еды");
        }

    }


}