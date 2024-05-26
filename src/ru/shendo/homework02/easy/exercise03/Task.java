package ru.shendo.homework02.easy.exercise03;

import java.util.Arrays;

/*
Написать программу для нахождения индексов минимального элемента в двумерном массиве.
Программа на вход принимает непустой, неотсортированный двумерный массив уникальных целых чисел
и возвращает массив индексов минимального числа в массиве.
Длина возвращаемого массива всегда будет равна двум.
 */

public class Task {
    public static void main(String[] args) {
        int[][] array1 = {{4}};
        int[][] array2 = {{4, 10}, {9, 2}, {5}};
        int[][] array3 = {{9, 2, -2}, {-10, 5}};
        System.out.println(Arrays.toString(findMinElementIn2DArray(array1)));
        System.out.println(Arrays.toString(findMinElementIn2DArray(array2)));
        System.out.println(Arrays.toString(findMinElementIn2DArray(array3)));
    }

    public static int[] findMinElementIn2DArray(int[][] twoDimArray) {
        int minValue = twoDimArray[0][0];
        int elementIndexFirst = 0;
        int elementIndexSecond = 0;

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j] < minValue) {
                    minValue = twoDimArray[i][j];
                    elementIndexFirst = i;
                    elementIndexSecond = j;
                }
            }
        }

        return new int[]{elementIndexFirst, elementIndexSecond};
    }
}
