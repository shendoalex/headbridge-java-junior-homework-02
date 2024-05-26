package ru.shendo.homework02.hard.exercise02;

/*
Написать программу для нахождения уникального элемента среди парных дубликатов
в целочисленном непустом неотсортированном массиве.
Программа на вход принимает неотсортированный массив целых чисел,
где существует только одно уникальное число, а все остальные числа имеют ровно один дубликат
и возвращает уникальное число.
 */

public class Task {
    public static void main(String[] args) {
        int[] array1 = {4};
        int[] array2 = {2, 4, 2};
        int[] array3 = {3, 2, 1, 2, 3, 0, 0};
        //Вызов первого варианта реализации метода поиска уникального элемента
        System.out.println(getUniqueElementFromArray1(array1));
        System.out.println(getUniqueElementFromArray1(array2));
        System.out.println(getUniqueElementFromArray1(array3));
        System.out.println();
        //Вызов второго варианта реализации метода поиска уникального элемента
        System.out.println(getUniqueElementFromArray2(array1));
        System.out.println(getUniqueElementFromArray2(array2));
        System.out.println(getUniqueElementFromArray2(array3));
    }

    public static int getUniqueElementFromArray1(int[] unsortedArray) {
        int foundUniqueNumber = 0;

        if (unsortedArray.length == 1) {
            return unsortedArray[0];
        }

        for (int i = 0; i < unsortedArray.length - 1; i++) {
            foundUniqueNumber = unsortedArray[i];
            for (int j = i + 1; j < unsortedArray.length; j++) {

                if (foundUniqueNumber == unsortedArray[j]) {
                    break;
                }
                if (j == unsortedArray.length - 1) {
                    return foundUniqueNumber;
                }
            }
        }

        return foundUniqueNumber;
    }

    public static int getUniqueElementFromArray2(int[] unsortedArray) {
        var singleNumber = 0;

        for (int number : unsortedArray) {
            singleNumber = singleNumber ^ number;
        }

        return singleNumber;
    }
}
