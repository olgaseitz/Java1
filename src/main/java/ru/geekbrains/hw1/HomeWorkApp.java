package ru.geekbrains.hw1;

import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        double a = Math.random()*30 - 8;
        double b = Math.random()*40 - 35;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        Random randNumber = new Random();
        int value = randNumber.nextInt(130 + 20) - 20;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        Random randNumber = new Random();
        int a = randNumber.nextInt(50 + 10) - 10;
        int b = randNumber.nextInt(50 + 10) - 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

}
