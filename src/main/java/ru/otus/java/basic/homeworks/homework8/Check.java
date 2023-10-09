package ru.otus.java.basic.homeworks.homework8;

import static java.lang.Integer.parseInt;

public class Check {
    public static void sizeArray(Object[] array) throws AppArraySizeException {
        if (array.length != 4) {
            throw new AppArraySizeException();
        }
    }

    public static void dataArray(String o) throws AppArrayDataException {
        try {
            Integer.parseInt(o);
        } catch (NumberFormatException e) {
            throw new AppArrayDataException();
        }
    }
    public static void ArrayStringsCheckSize(String[][] array) {
        int sumOfHelpers = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                Check.sizeArray(array);
                for (int j = 0; j < array[i].length; j++) {
                    Check.dataArray(array[i][j]);
                    Check.sizeArray(array[i]);
                    int helper = parseInt(array[i][j]);
                    sumOfHelpers += helper;
                }
            }
            System.out.println(sumOfHelpers);
        } catch (AppArraySizeException exception) {
            System.out.println("exception AppArraySizeException. не корректная длина массива");
        } catch (NullPointerException exception) {
            System.out.println("exception NullPointerException");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("exception ArrayIndexOfBoundsException");
        } catch (NumberFormatException exception) {
            System.out.println("NumberFormatException exception. не корректное значение");
        } catch (AppArrayDataException exception) {
            System.out.println("AppArrayDataException exception. не корректные данные в массиве " + array.hashCode());
        }
    }
}
