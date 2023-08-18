package ru.otus.java.basic.homeworks.homework1;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        System.out.println("Здравствуйте, введите число от 1 до 5:");
        Scanner scan = new Scanner(System.in);
        int part = scan.nextByte();
        if (part == 1) {
            greetings();
        } else if (part == 2) {
            checkSing();
        } else if (part == 3) {
            selectColor();
        } else if (part == 4) {
            compareNumbers();
        } else if (part == 5) {
            addOrSubtractAndPrint();
        } else {
            System.out.println("Вы ввели значние не из диапозона %(");
        }
    }

    public static void greetings() {
        System.out.println("Hello\nworld\nfrom\njava");     // в 1 строку %)
        words();
    }

    public static void words() {
        System.out.println("Hello");
        System.out.println("world");
        System.out.println("from");
        System.out.println("java");
    }

    public static void checkSing() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значние a:");
        int a = scan.nextInt();
        System.out.println("Введите значние b:");
        int b = scan.nextInt();
        System.out.println("Введите значние c:");
        int c = scan.nextInt();
        int sumNum = a + b + c;
        System.out.println(sumNum);
        if (sumNum >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательня");
        }
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 30);
        System.out.println("значение data: " + data);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 20);
        System.out.println("a = " + a);
        int b = (int) (Math.random() * 20);
        System.out.println("b = " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint() {
        int initValue = (int) (Math.random() * 100);
        System.out.println("значение initValue = " + initValue);
        int delta = (int) (Math.random() * 100);
        System.out.println("значенеи delta = " + delta);
        boolean increment;
        int x = (int) (Math.random() * 2);
        int MyRandomBoolean = x % 2;
        System.out.println(MyRandomBoolean);// это лучшее, что я смог придумать, чтобы дать рандомное
        if (MyRandomBoolean > 0) {          // значение для boolean) не бейте сильно)
            increment = true;
        } else {
            increment = false;
        }
        int action;
        if (increment == true) {
            action = initValue + delta;
            System.out.println("Сумма initValue и delta = " + action);
        } else {
            action = initValue - delta;
            System.out.println("Разница initValue и delta = " + action);
        }
    }
}