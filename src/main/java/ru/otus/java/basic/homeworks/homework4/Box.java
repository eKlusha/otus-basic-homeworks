package ru.otus.java.basic.homeworks.homework4;

class Box {
    private final int sizeX;
    private final int sizeY;
    private final int sizeZ;
    private String color;
    private boolean statusOpen;
    private boolean statusEmpty;

    Box(int sizeX, int sizeY, int sizeZ, String color, boolean statusEmpty, boolean statusOpen) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
        this.color = color;
        this.statusEmpty = statusEmpty;
        this.statusOpen = statusOpen;
    }

    public int getSIZE_X() {
        return sizeX;
    }

    public int getSIZE_Y() {
        return sizeY;
    }

    public int getSIZE_Z() {
        return sizeZ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void closed() {
        if (statusOpen) {
            statusOpen = false;
            System.out.println("коробка закрыта");
        }
        System.out.println();
    }

    public void open() {
        if (!statusOpen) {
            statusOpen = true;
            System.out.println("коробка открыта");
        }
        System.out.println();
    }

    public void info() {
        System.out.println("Раземры коробки: " + sizeX + "мм, " + sizeY + "мм, " + sizeZ + "мм.\n" +
                "Цвет коробки : " + color);
        if (statusEmpty) {
            System.out.println("коробка пуста");
        } else {
            System.out.println("в коробке лежит предмет");
        }
        if (statusOpen) {
            System.out.println("коробка открыта");
        } else {
            System.out.println("коробка закрыта");
        }
        System.out.println();
    }

    public void put() {
        if (!statusEmpty && statusOpen) {
            System.out.println("прежде чем положить предмет, выкиньте тот, который уже лежит в коробке");
        }
        if (statusEmpty && !statusOpen) {
            System.out.println("прежде чем положить предмет откройте коробку");
        }
        if (!statusEmpty && !statusOpen) {
            System.out.println("прежде чем положить предмет, откройте коробку и выкиньте тот, который уже лежит в коробке");
        }
        if (statusOpen && statusEmpty) {
            statusEmpty = false;
            System.out.println("Вы положили предмет в коробку");
        }
        System.out.println();
    }

    public void take() {
        if (statusEmpty && statusOpen) {
            System.out.println("из коробки нечего брать");
        }
        if (!statusOpen) {
            System.out.println("сначала откройте коробку");
        }
        if (statusOpen && !statusEmpty) {
            statusEmpty = true;
            System.out.println("Вы забрали предмет из коробки");
        }
        System.out.println();
    }
}
