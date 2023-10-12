package ru.otus.java.basic.homeworks.homework9;

import java.util.*;

public class HomeWork9 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Worker worker1 = new Worker("Sam", 34);
        Worker worker2 = new Worker("Jim", 40);
        Worker worker3 = new Worker("Jack", 30);
        Worker worker4 = new Worker("Peter", 20);
        Worker worker5 = new Worker("Bill", 58);
        Worker worker6 = new Worker("Joseph", 24);
        Worker worker7 = new Worker("David", 28);

        Methods.minMax(4, 3, numbers);
        Methods.minMax(2, 7, numbers);
        Methods.minMax(1, 0, numbers);
        Methods.minMax(3, 4, numbers);
        Methods.minMax(7, 7, numbers);
        System.out.println(Methods.sumOfNumbers(numbers));
        Methods.resetNumbers(0, numbers);
        Methods.changeNumbers(4, numbers);

        List<Worker> Workers = new ArrayList<>();
        Workers.add(worker1);
        Workers.add(worker2);
        Workers.add(worker3);
        Workers.add(worker4);
        Workers.add(worker5);
        Workers.add(worker6);
        Workers.add(worker7);
        System.out.println(Methods.names(Workers));
        System.out.println(Methods.minAgeList(25,Workers));
        Methods.average(30,Workers);
        Methods.average(40,Workers);
        System.out.println(Methods.young(Workers));





    }
}