package ru.geekbrains.hw6;

public class HomeWork6 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("Пёс Рекс", 400),
                new Dog("Пёс Хатико", 800),
                new Dog("Пёс Котик", 9),
                new Cat("Кот Альфред", 220),
                new Cat("Кот Мишка", 50),
                new Cat("Кошка Челси", 9)

        };

        for (int i = 0; i < 1; i++) {
            animals[0].run();
            animals[1].run();
            animals[2].swim();
            animals[3].run();
            animals[4].run();
            animals[5].swim();

        }
        System.out.println("Всего кошек: " + Cat.getCount());
        System.out.println("Всего собак: " + Dog.getCount());
        System.out.println("Всего животных: " + (Cat.getCount() + Dog.getCount()));
    }

}
