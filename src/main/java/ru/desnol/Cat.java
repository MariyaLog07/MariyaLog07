package ru.desnol;


public class Cat {
    int weight;
    String name;
    boolean whitecolour;

    public Cat(int weight, String name, boolean whitecolour) {
        this.weight = weight;
        this.name = name;
        this.whitecolour = whitecolour;
    }

    void printItems() {

        if (whitecolour & weight==5) {
            System.out.println("Да, это Хоси");

        } else {
            System.out.println("Нет, это не Хоси");
        }

    }
}