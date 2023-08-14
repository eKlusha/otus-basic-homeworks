package ru.otus.java.basic.homeworks.homework2;
import java.util.Scanner;
import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        printStrings(5);
        int[] array1 = {23, 1, 5, 3, 8, 0, -1, 6, 3, 1, 0, 8, -5, 9, 4};
        sumAndPrint(array1);
        changeNums(6, array1);
        incrementNums(4, new int[]{3, 32, 1, 23, 45, 6, 7, 8, 4, 322, 212, 0, -501});
        halfs(new int[]{32, 56, 98, 1, 2, 3, 78, 65, 32, 0, -1, 2, 65, 77, 12});
        sumOfArrays(new int[]{2, 4, 5, 6, 2}, new int[]{5, 1, 5, 6}, new int[]{7, 5, 4});
        increaseOrDescending(new int[]{1, 2, 3, 4, 5});
        revers(new int[]{1, 2, 3, 4, 5});
        point(new int[]{1, 1, 1, 1, 1, 5, 10, 20, 40, 80});
    }

    public static void printStrings(int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println("Текст для печати");
        }
        System.out.println();
    }


    public static void sumAndPrint(int[] array1) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
                sum += array1[i];
            }
        }
        System.out.println(sum);
        System.out.println();
    }

    public static void changeNums(int a, int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = a;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println();
    }

    public static void incrementNums(int a, int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] += a;
        }
        System.out.println(Arrays.toString(array2));
        System.out.println();
    }

    public static void halfs(int[] array2) {
        int sumHalf1 = 0;
        int sumHalf2 = 0;
        for (int i = 0; i < array2.length / 2 + 1; i++) {
            sumHalf1 += array2[i];
        }
        for (int i = array2.length / 2; i < array2.length; i++) {
            sumHalf2 += array2[i];
        }
        System.out.println(sumHalf1);
        System.out.println(sumHalf2);
        if (sumHalf1 > sumHalf2) {
            System.out.println("Сумма занчений первой половины массива больше");
        } else if (sumHalf1 < sumHalf2) {
            System.out.println("Сумма занчений второй половины массива больше");
        } else {
            System.out.println("Суммы обеих половин равны");
        }
        System.out.println();
    }

    public static void sumOfArrays(int[] array3, int[] array4, int[] array5) {
        int a = 0;
        if (array3.length >= array4.length && array3.length >= array5.length) {
            a = array3.length;
        } else if (array4.length >= array3.length && array4.length >= array5.length) {
            a = array4.length;
        } else {
            a = array5.length;
        }
        System.out.println(a);
        int[] newArray3 = new int[a];
        int[] newArray4 = new int[a];
        int[] newArray5 = new int[a];
        changeArrays1(array3, newArray3);
        changeArrays1(array4, newArray4);
        changeArrays1(array5, newArray5);
        System.out.println(Arrays.toString(newArray3));
        System.out.println(Arrays.toString(newArray4));
        System.out.println(Arrays.toString(newArray5));
        int[] sumNumArray = new int[a];
        for (int i = 0; i < a; i++) {
            sumNumArray[i] = newArray3[i] + newArray4[i] + newArray5[i];
        }
        System.out.println(Arrays.toString(sumNumArray));
        System.out.println();
    }

    public static void changeArrays1(int[] array, int[] newArray) {
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
    }

    public static void increaseOrDescending(int[] array) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для запуска проверки на возростание элементов массива нажмите '1'\n" +
                "Для заупска проверки на убывание элементов массива нажмите '2'");
        int choice = scanner.nextInt();
        int counterIncrease = 0;
        int counterDescending = 0;
        System.out.println(Arrays.toString(array));
        if (choice == 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i] + 1) {
                    counterIncrease++;
                }
            }
            if (counterIncrease == array.length - 1) {
                System.out.println("Элементы массива идут в порядке возростания");
            } else {
                System.out.println("Элементы массива не идут в порядке возростания");
            }
        } else if (choice == 2) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i] + 1) {
                    counterDescending++;
                }
            }
            if (counterIncrease == array.length - 1) {
                System.out.println("Элементы массива идут в порядке убывания");
            } else {
                System.out.println("Элементы массива не идут в порядке убывания");
            }
        } else {
            System.out.println("Недопустимое значение. Попробуйте ещё раз");
        }
        System.out.println();
    }

    public static void revers(int array[]) {
        System.out.println(Arrays.toString(array));
        int[] arrayHelper = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayHelper[i] = array[i];
        }
        int memory = arrayHelper.length;
        for (int i = 0; i < array.length; i++) {

            array[i] = arrayHelper[memory - 1];
            memory--;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void point(int[] array) {
        int sum1 = 0;
        int sum2 = array[0];
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            sum1 += array[i];
        }
        for (int i = 1; i < array.length; i++) {
            if (sum1 == sum2) {
                System.out.println("Точка, в которой суммы правой и левой частей элементов массива равны," +
                        "находится между элементами " + i + " и " + (i + 1));
                break;
            } else {
                sum1 -= array[i];
                sum2 += array[i];
                System.out.println(sum1 + " " + sum2);
            }
        }
        if (sum1 != sum2) {
            System.out.println("Нет точки, в которой суммы правой и левой частей элементов массива равны");
        }
    }
}
