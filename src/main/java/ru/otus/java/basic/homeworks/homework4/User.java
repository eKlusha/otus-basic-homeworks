package ru.otus.java.basic.homeworks.homework4;

class User {
    private String firstName;
    private String secondName;
    private String patronymic;
    private int yearOfBorn;
    private String email;

    public User(String secondName,String firstName, String patronymic, int yearOfBorn, String email) {
        this.firstName = firstName;
        this.secondName =secondName;
        this.patronymic = patronymic;
        this.yearOfBorn = yearOfBorn;
        this.email = email;

    }

    public int getYearOfBorn() {
        return yearOfBorn;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getEmail() {
        return email;
    }

    public void info() {
        System.out.println("ФИО: " + secondName + " " + firstName + " " + patronymic + "\n" +
                "год рождения: " + yearOfBorn + "\n" + "email:" + email);
    }
}
