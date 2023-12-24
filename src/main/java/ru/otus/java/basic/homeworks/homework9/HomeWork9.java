package ru.otus.java.basic.homeworks.homework9;

import java.util.*;

public class HomeWork9 {

    public static void main(String[] args) throws MinMaxException {
        List<Integer> numbers = new ArrayList<>();
        Worker worker1 = new Worker("Sam", 34);
        Worker worker2 = new Worker("Jim", 40);
        Worker worker3 = new Worker("Jack", 30);
        Worker worker4 = new Worker("Peter", 20);
        Worker worker5 = new Worker("Bill", 58);
        Worker worker6 = new Worker("Joseph", 24);
        Worker worker7 = new Worker("David", 28);

//        Methods.notCorrectMinMax(4, 3, numbers);  //не завтавляйте удалять метод) он уродливый, но родной)
//        Methods.notCorrectMinMax(2, 7, numbers);
//        Methods.notCorrectMinMax(1, 0, numbers);
//        Methods.notCorrectMinMax(3, 4, numbers);
//        Methods.notCorrectMinMax(7, 7, numbers);
        System.out.println(Methods.minMax(2,10));
        System.out.println(Methods.sumOfNumbers(Methods.minMax(3, 9)));
        Methods.resetNumbers(0, Methods.minMax(2,10));
        Methods.changeNumbers(4, Methods.minMax(2,10));

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
        System.out.println(Methods.average(30,Workers));
        System.out.println(Methods.average(40,Workers));
        System.out.println(Methods.young(Workers));





    }
}