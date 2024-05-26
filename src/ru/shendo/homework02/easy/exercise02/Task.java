package ru.shendo.homework02.easy.exercise02;

/*
Написать программу для нахождения индекса минимального элемента в массиве.
Программа на вход принимает непустой, неотсортированный массив уникальных целых чисел
и возвращает индекс минимального числа в массиве.
 */

public class Task {
    public static void main(String[] args) {
        int[] array1 = {4};
        int[] array2 = {4, 10, 9, 2, 5};
        int[] array3 = {9, 2, -2, -10, 5};
        System.out.println(findIndexOfMinElement(array1));
        System.out.println(findIndexOfMinElement(array2));
        System.out.println(findIndexOfMinElement(array3));
    }

    public static int findIndexOfMinElement(int[] array) {
        int minValue = array[0];
        int elementIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                elementIndex = i;
            }
        }

        return elementIndex;
    }
}