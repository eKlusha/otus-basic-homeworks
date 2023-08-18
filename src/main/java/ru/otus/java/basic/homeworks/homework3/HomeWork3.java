package ru.otus.java.basic.homeworks.homework3;

public class HomeWork3 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int[][] array1 = new int[][]{{1, 45, 67, -34, 54, -87}, {-4, 56, -5, -8, -13, 83, 41}};
        float[][] array2 = new float[][]{{1.25f, 68.5f, -72.1f}, {-4.5f, -75.4f, 100.0f, 44.4f}};
        int[][] array3 = new int[][]{{1, 34, 5, 7}, {44, 21, -65, -11}};
        int[][] array4 = new int[][]{{1, 34, 5, 7}};
        sumOfPositiveElements(array1);
        System.out.println("Сумма положительных элементов массива array1: " + sumOfPositiveElements(array1) + "\n");
        drawSquare(5);
        twoDiagonals(array);
        findMax(array2);
        System.out.println("Максимальное значение массива array2: " + findMax(array2) + "\n");
        returnSecondStringSum(array3);
        System.out.println(returnSecondStringSum(array3));
        returnSecondStringSum(array4);
        System.out.println(returnSecondStringSum(array4));
    }

    public static int sumOfPositiveElements(int array[][]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void drawSquare(int size) {
        char[][] starsForSquare = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                starsForSquare[i][j] = '*';
            }
        }
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                starsForSquare[i][j] = ' ';
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(starsForSquare[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void twoDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 5;
                if (i == j) {
                    array[i][j] = 0;
                }
                if (Math.abs((array.length - 1 - j) - i) < 1) {
                    array[i][j] = 0; // я сделал с помощью Вашего примера. Не уверен,
                }   // что до конца понял как это работает, с графикой не работал
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static float findMax(float[][] array) {
        float maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }

    public static int returnSecondStringSum(int[][] array) {
        int sumSecondString = 0;
        if (array.length > 1) {
            for (int i = 0; i < array[1].length; i++) {
                sumSecondString += array[1][i];
            }
        } else {
            sumSecondString = -1;
        }
        return sumSecondString;
    }
}