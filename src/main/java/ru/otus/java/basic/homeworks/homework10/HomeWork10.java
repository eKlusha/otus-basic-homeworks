package ru.otus.java.basic.homeworks.homework10;

public class HomeWork10 {
    public static void main(String[] args) {
        PhoneBook contact1 = new PhoneBook("+71111111111", "Александров", "Александр", "Александрович");
        PhoneBook contact2 = new PhoneBook("+72222222222", "Борисов", "Борис", "Борисович");
        PhoneBook contact3 = new PhoneBook("+73333333333", "Владимиров", "Владимир", "Владимирович");
        PhoneBook contact4 = new PhoneBook("+74444444444", "Григорьев", "Григорий", "Гигорьевич");
        PhoneBook contact5 = new PhoneBook("+75555555555", "Дмитриев", "Дмитрий", "Дмитриевич");
        PhoneBook contact6 = new PhoneBook("+76666666666", "Евгеньев", "Евгений", "Евгеньевич");
        PhoneBook contact7 = new PhoneBook("+77777777777", "Жмышенко", "Валерий", "Альбертович");
        PhoneBook contact8 = new PhoneBook("+78888888888", "Зубенко", "Михаил", "Петрович");
        PhoneBook contact71 = new PhoneBook("+77777777771", "Жмышенко", "Валерий", "Альбертович");
        PhoneBook contact81 = new PhoneBook("+78888888881", "Зубенко", "Михаил", "Петрович");
        PhoneBook contact72 = new PhoneBook("+77777777772", "Жмышенко", "Валерий", "Альбертович");
        PhoneBook contact82 = new PhoneBook("+78888888882", "Зубенко", "Михаил", "Петрович");

        System.out.println(contact6.getFIO() + " " + contact6.getPhoneNumber());

        PhoneBook.add(contact1);
        PhoneBook.add(contact2);
        PhoneBook.add(contact3);
        PhoneBook.add(contact4);
        PhoneBook.add(contact5);
        PhoneBook.add(contact6);
        PhoneBook.add(contact7);
        PhoneBook.add(contact8);
        PhoneBook.add(contact71);
        PhoneBook.add(contact81);
        PhoneBook.add(contact72);
        PhoneBook.add(contact82);
        System.out.println(PhoneBook.listPhoneBook);

        System.out.println("Александров Александр Александрович");
        System.out.println(contact1.getFIO().hashCode());
        System.out.println("Александров Александр Александрович".hashCode());
        System.out.println();

        System.out.println("1111" + PhoneBook.listPhoneBook.entrySet());
        System.out.println(PhoneBook.listPhoneBook.size());
        PhoneBook.findPhone("Александров Александр Александрович");
        PhoneBook.findPhone("Жмышенко Валерий Альбертович");
        PhoneBook.findPhone("Зубенко Михаил Петрович");
        System.out.println(PhoneBook.containsPhoneNumber("zxc"));
        System.out.println(PhoneBook.containsPhoneNumber(contact1.getPhoneNumber()));
        System.out.println(PhoneBook.containsPhoneNumber("+78888888882"));
    }
}


