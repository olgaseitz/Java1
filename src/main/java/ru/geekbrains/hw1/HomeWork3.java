package ru.geekbrains.hw1;
import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        changeArray();
        System.out.println("\nЗадание 2:");
        createArray();
        System.out.println("\nЗадание 3:");
        doubleArray();
        System.out.println("\nЗадание 4:");
        quadArray();
        System.out.println("\nЗадание 5:");
        lenArray();
        System.out.println("\nЗадание 6:");
        minMaxArray();

    }

/*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    public static void changeArray() {
        int[] myChange = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Дан массив: ");
        for (int i = 0; i < myChange.length; i++) {
            System.out.print(myChange[i] + " | ");
        }
        System.out.print("\nМеняем 0 и 1 местами: ");
        for (int i = 0; i < myChange.length; i++) {
        if (myChange[i] == 1) myChange[i] = 0;
        else myChange[i] = 1;
            System.out.print(myChange[i] + " | ");
        }

    }

/*2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/

    public static void createArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = i + 1;
        }
            System.out.println(Arrays.toString(arr));
    }

/*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2 в массиве;*/

    public static void doubleArray() {
        int[] myDouble = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Дан массив: ");
        for (int i = 0; i < myDouble.length; i++) {
            System.out.print(myDouble[i] + " | ");
        }
            System.out.print("\nУмножим все числа менее 6 на 2: ");
        for (int i = 0; i < myDouble.length; i++) {
            if (myDouble[i] < 6) myDouble[i] *= 2;
            System.out.print(myDouble[i] + " | ");
        }
    }

/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/

    public static void quadArray() {
        int addOne = 1;
        int[][] oneArray= new int[7][7];
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                if((i == j) || (i == 7 - 1 - j))
                    oneArray [i][j] = addOne;
                System.out.print(oneArray [i][j] + "\t");

            }
            System.out.println();
        }
    }

/*5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/

    public static void lenArray(){
        int len = 8;
        int initialValue = 3;
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]);
        }

    }

/*6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов;*/

    public static void minMaxArray() {
        int[] myArray = {17, 5, -3, 2, 21, -14, 54, 12, 34, 8};
        int min = myArray[0];
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min)
                min = myArray[i];
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max)
                max = myArray[i];
        }
        System.out.println("Минимальное число: " + min + "\nМаксимальное число: " + max);

    }

}
