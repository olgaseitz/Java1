package ru.geekbrains.hw1;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println(mySum(4, 11));
        myPositive(-10);
        System.out.println(checkNegative(4));
        System.out.println("Задание 4");
        printString("We will Rock you", 4);
        System.out.println("Задание 5");
        checkYear(1986);

    }
/*  1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false. */

    public static boolean mySum(int x, int y) {
    int sum = x + y;
    return sum >= 10 && sum <= 20;
}
/*  2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом. */

    public static void myPositive(int number) {
    System.out.println("Задание 2");
    if (number >= 0) {
        System.out.println("Число " + number + " положительное");
    } else {
        System.out.println("Число " + number + " отрицательное");
    }
}

/*            3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. */

    static boolean checkNegative(int a) {
    System.out.println("Задание 3");
    return a < 0;
}

/*            4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз; */

    private static void printString(String string, int i) {
    for (int j = 0; j < i; j++) {
        System.out.println(string);
    }
}

/*  5.* Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/

    static void checkYear(int y) {
    if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
        System.out.println(y + " високосный");
    else
        System.out.println(y + " не високосный");
}
}
