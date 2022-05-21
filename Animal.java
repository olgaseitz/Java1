package ru.geekbrains.hw6;

public class Animal {

    protected String name;
    protected int distance;


    public void run() {
        System.out.println(name + " пробежал(а) " + distance + " метров");
    }

    public void swim() {
        System.out.println(name + " проплыл(а) " + distance);
    }


}
