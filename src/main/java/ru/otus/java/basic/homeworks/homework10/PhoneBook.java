package ru.otus.java.basic.homeworks.homework10;

import java.util.*;

public class PhoneBook {
    private final String firstName;
    private final String secondNme;
    private final String surname;
    private final String phoneNumber;

    public PhoneBook(String phoneNumber, String firstName, String secondNme, String surname) {
        this.firstName = firstName;
        this.secondNme = secondNme;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }
    public String getFIO() {
        String FIO = firstName + " " + secondNme + " " + surname;
        return FIO;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    static Map<String, String> listPhoneBook = new HashMap<>();

    public static void add(PhoneBook contact) {
        listPhoneBook.put(contact.getPhoneNumber(), contact.getFIO());
    }
    public static void findPhone(String FIO) {
        String phone = "";
        if (listPhoneBook.containsValue(FIO)) {
            for (String key : listPhoneBook.keySet()) {
                if (listPhoneBook.get(key).equals(FIO)) {
                    phone += key + " "; // по нормальному наверно через стрингбилдер гужно, но телефонов на одного не так много
                }
            }
        } else {
            System.out.println("Такого человека нет в списке контактов");
        }
        System.out.println(FIO + " phone: " + phone);
    }
    public static boolean containsPhoneNumber (String number) {
        if (listPhoneBook.containsKey(number)) {
            return true;
        } else {
            return false;
        }
    }
}


