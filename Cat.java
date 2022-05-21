package ru.geekbrains.hw6;

public class Cat extends Animal {
    private static int counter = 0;

    public Cat(String name, int distance){
        this.name = name;
        this.distance = distance;
        counter++;
    }

    @Override
    public void run() {
        int maxRun = 200;
        if (distance < maxRun) {
            System.out.println(name + " пробежал(а) " + distance + " метров");
        } else {
            System.out.println(name + " не смог(ла) пробежать " + distance + " метров");
        }
    }

    @Override
    public void swim() {
        System.out.println(name + " не умеет плавать");
    }

    public static int getCount() {
        return counter;
    }

}
