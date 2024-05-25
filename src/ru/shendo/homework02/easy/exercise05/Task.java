package ru.shendo.homework02.easy.exercise05;

import java.util.Arrays;

/*
Написать программу для нахождения индексов дубликатов в целочисленном непустом отсортированном массиве.
Программа на вход принимает отсортированный массив целых чисел,
среди которых находится повторяющееся значение n, а все отличные числа от n уникальны,
и возвращает массив индексов под которыми находятся дублирующиеся элементы массива.
Если дубликаты отсутствуют возвращать массив нулевой длины (текстовое обозначение в задании [_]).
 */

public class Task {
    public static void main(String[] args) {
        int[] array1 = {4};
        int[] array2 = {-10, 2, 4};
        int[] array3 = {1, 2, 3, 3, 3, 4};
        System.out.println(Arrays.toString(getIndexesOfDuplicateNumbers(array1)));
        System.out.println(Arrays.toString(getIndexesOfDuplicateNumbers(array2)));
        System.out.println(Arrays.toString(getIndexesOfDuplicateNumbers(array3)));
    }

    public static int[] getIndexesOfDuplicateNumbers(int[] sortedArray) {
        int resultArraySize = 0;
        int[] indexesOfDuplicatesFound = new int[sortedArray.length];

        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] == sortedArray[i + 1]) {
                if (resultArraySize == 0) {
                    indexesOfDuplicatesFound[resultArraySize] = i;
                    resultArraySize++;
                }
                indexesOfDuplicatesFound[resultArraySize] = i + 1;
                resultArraySize++;
            }
        }

        return Arrays.copyOf(indexesOfDuplicatesFound, resultArraySize);
    }
}
