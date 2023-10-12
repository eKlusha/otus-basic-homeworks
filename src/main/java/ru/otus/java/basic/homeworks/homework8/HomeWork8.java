package ru.otus.java.basic.homeworks.homework8;


import static ru.otus.java.basic.homeworks.homework8.Check.ArrayStringsCheckSize;
public class HomeWork8 {
    public static void main(String[] args){

        String[][] array1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] array2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}, {"1", "2", "3", "4"}};
        String[][] array3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
        String[][] array4 = {null, null, null, null};
        String[][] array5 = {{"кое ", "как ", "получилось ", "сделать "}, {"домашку", ", ", "но ", "мне "}, {"кажется ", "я ", " сделал ", "что-то "}, {"не ", "так", ", ", "но ", "вроде ", "работает"}};

        ArrayStringsCheckSize(array1);
        ArrayStringsCheckSize(array2);
        ArrayStringsCheckSize(array3);
        ArrayStringsCheckSize(array4);
        ArrayStringsCheckSize(array5);
    }
}
