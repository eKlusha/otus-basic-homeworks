package ru.otus.java.basic.homeworks.homework7;

public class Horse implements Usable{
    private String type;
    private int stamina;
    private int staminaCost;
    public Horse(String type, int stamina, int staminaCost) {
        this.type = type;
        this.stamina = stamina;
        this.staminaCost = staminaCost;
    }
    @Override
    public void drive(int distance) {
        if (stamina >= distance * staminaCost) {
            stamina -= distance * staminaCost;
            System.out.println(type + " преодолела " + distance + " и у неё осталось " + stamina + " единиц(ы) выносливости");
        }
        if (stamina < distance * staminaCost && stamina > 0) {

        }
    }
}
