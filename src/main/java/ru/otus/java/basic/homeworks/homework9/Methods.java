package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static void notCorrectMinMax(Integer a, Integer b, List<Integer> list) {
        if (list.size() == 0) {
            list.add(a);
            if (list.get(0) >= b) {
                list.add(0, b);
                System.out.println(list);
            }
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                if (a >= list.get(list.size() - 1)) {
                    list.add(a);
                    break;
                } else if (a <= list.get(0)) {
                    list.add(0, a);
                    break;
                } else if (list.get(i) >= a && a <= list.get(i + 1)) {
                    list.add(i + 1, a);
                    break;
                }
            }
            System.out.println(list);
            for (int i = 0; i < list.size() - 1; i++) {
                if (b >= list.get(list.size() - 1)) {
                    list.add(b);
                    break;
                } else if (b <= list.get(0)) {
                    list.add(0, b);
                    break;
                } else if (list.get(i) >= b && b <= list.get(i + 1)) {
                    list.add((i + 1), b);
                    break;
                }
            }
            System.out.println(list);
        }
    }

    public static List<Integer> minMax(int min, int max) {
        List<Integer> diapason = new ArrayList<>();
        if (max < min) {
            System.out.println("****** рот этого казино");
            diapason.add(-1);
        } else if (min == max) {
            diapason.add(0);
        } else {
            while (min != max) {
                diapason.add(min);
                min++;
            }
            diapason.add(max);
        }
        return diapason;

    }

    public static int sumOfNumbers(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    public static void resetNumbers(int a, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, a);
        }
        System.out.println(list);
    }

    public static void changeNumbers(int a, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + a);
        }
        System.out.println(list);
    }

    public static List<String> names(List<Worker> workers) {
        List<String> names = new ArrayList<>();
        for (var w : workers) {
            names.add(w.getName());
        }
        return names;
    }

    public static List minAgeList(int minAge, List<Worker> workers) {
        List<String> names = new ArrayList<>();
        for (Worker w : workers) {
            if (w.getAge() >= minAge) {
                names.add(w.getName());
            }
        }
        return names;
    }

    public static boolean average(int age, List<Worker> workers) {
        int middleAgeWorkers = 0;
        int counter = 0;
        for (Worker w : workers) {
            middleAgeWorkers += w.getAge();
            counter++;
        }
        return (middleAgeWorkers / counter > age);
    }

    public static Worker young(List<Worker> workers) {
        Worker youngWorker = workers.get(0);
        for (int i = 1; i < workers.size(); i++) {
            if (workers.get(i).getAge() <= youngWorker.getAge()) {
                youngWorker = workers.get(i);
            }
        }
        return youngWorker;
    }
}

