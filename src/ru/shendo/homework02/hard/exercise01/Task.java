package ru.shendo.homework02.hard.exercise01;

/*
Написать программу для нахождения индексов дубликатов в целочисленном непустом неотсортированном массиве.
Программа на вход принимает неотсортированный массив целых чисел, среди которых находится повторяющееся значение n,
а все отличные числа от n уникальны, и возвращает массив индексов под которыми находятся дублирующиеся элементы массива.
Если дубликаты отсутствуют возвращать массив нулевой длины (текстовое обозначение в задании [_]).
 */

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] array1 = {4};
        int[] array2 = {2, -10, 4};
        int[] array3 = {3, 2, 1, 3, 3, 0, 3};
        System.out.println(Arrays.toString(getIndexesOfDuplicateNumbers(array1)));
        System.out.println(Arrays.toString(getIndexesOfDuplicateNumbers(array2)));
        System.out.println(Arrays.toString(getIndexesOfDuplicateNumbers(array3)));
    }

    public static int[] getIndexesOfDuplicateNumbers(int[] unsortedArray) {
        int resultArraySize = 0;
        int[] indexesOfDuplicatesFound = new int[unsortedArray.length];

        outerLoop:
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[i] == unsortedArray[j]) {
                    if (resultArraySize == 0) {
                        indexesOfDuplicatesFound[resultArraySize] = i;
                        resultArraySize++;
                    }
                    indexesOfDuplicatesFound[resultArraySize] = j;
                    if (resultArraySize < unsortedArray.length - 1) {
                        resultArraySize++;
                    }
                    if (j == unsortedArray.length - 1) {
                        break outerLoop;
                    }
                }
            }
        }

        return Arrays.copyOf(indexesOfDuplicatesFound, resultArraySize);
    }
}
