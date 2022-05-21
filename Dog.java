package ru.geekbrains.hw6;

public class Dog extends Animal {
    private static int counter = 0;

    public Dog(String name, int distance) {
        this.name = name;
        this.distance = distance;
        counter++;
    }

    @Override
    public void run() {
        int maxRun = 500;
        if (distance < maxRun) {
            System.out.println(name + " пробежал(а) " + distance + " метров");
        } else {
            System.out.println(name + " не смог(ла) пробежать " + distance + " метров");
        }

    }

    @Override
    public void swim() {
        int maxSwim = 10;
        if (distance < maxSwim) {
            System.out.println(name + " проплыл(а) " + distance + " метров");
        } else {
            System.out.println(name + " не смог(ла) проплыть " + distance + " метров");
        }

    }
    public static int getCount() {
        return counter;
    }
}



