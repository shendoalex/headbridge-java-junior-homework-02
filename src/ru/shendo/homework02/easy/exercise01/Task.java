package ru.shendo.homework02.easy.exercise01;

/*
Написать программу для проверки нахождения заданного элемента в массиве.
Программа на вход принимает целое число и непустой, неотсортированный массив уникальных целых чисел
и возвращает логическое значение (true/false).
Где true - говорит о том, что число находится в массиве, а false - говорит о том, что число отсутствует в массиве.
 */

public class Task {
    public static void main(String[] args) {
        int[] array1 = {4};
        int[] array2 = {4, 10, 9, 2, 5};
        int[] array3 = {9, 2, -2, -10, 5};
        System.out.println(checkIfElementInArray(1, array1));
        System.out.println(checkIfElementInArray(9, array2));
        System.out.println(checkIfElementInArray(0, array3));
    }

    public static boolean checkIfElementInArray(int number, int[] array) {
        boolean elementIsInArray = false;

        for (int arrayElement : array) {
            if (arrayElement == number) {
                return true;
            }
        }

        return elementIsInArray;
    }
}
