package ru.otus.java.basic.homeworks.homework6;

class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

   public String getName() {
        return name;
   }

    public int getAppetite() {

        return appetite;
    }
    public boolean getSatiety() {

        return satiety;
    }
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public String toString() {
        String info;
        if (satiety) {
             info = name + " может съесть за 1 раз " + appetite + " еды. сейчас он сыт";
        } else {
             info = name + " может съесть за 1 раз " + appetite + " еды. сейчас он голоден";
        }
        return info;
    }
}
