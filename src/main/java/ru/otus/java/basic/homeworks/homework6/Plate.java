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
        return "В миске " + actualFood + " еды. В запасе ещё " + packageCounter + " пакетов по " + capacityPackage + " еды";
    }
    boolean decreaseFood(Cat cat) {
        if (actualFood - cat.getAppetite() >= 0) {
            actualFood -= cat.getAppetite();
            System.out.println(cat.getName() + " пока что наелся");
            cat.setSatiety(true) ;
        } else {
            System.out.println(cat.getName() + " не выдержал такого неуважения, потому что для него в тарелке не хватает еды. Он выбирает голодную смерть %)");
            cat.setSatiety(false);
        }
        return cat.getSatiety();
    }
    public void putFood() {
        if (packageCounter > 0) {
            if (actualFood + capacityPackage > maxValueFood) {
                System.out.println("В миске достаточно еды.");
            } else {
                actualFood += capacityPackage;
                packageCounter--;
                System.out.println("Вы насыпали еду в миску. Осталось " + packageCounter + " пакетов еды.\nВ миске теперь " + actualFood + " еды");
            }
        } else {
            System.out.println("Милорд, запасы провизии на исходе. Коты требуют заказать им ещё еды.\nВ миске " + actualFood + " еды");
        }
    }
}