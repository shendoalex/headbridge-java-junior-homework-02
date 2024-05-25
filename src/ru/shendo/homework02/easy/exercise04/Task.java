package ru.shendo.homework02.easy.exercise04;

/*
Реализовать программу для расчета положительного n-го ряда числа Фибоначчи с помощью цикла.
Программа на вход принимает номер элемента ряда числа Фибоначчи
и возвращает посчитанный элемент числа ряда Фибоначчи, которое находится под заданным номером.
Предполагается, что ряд Фибоначчи начинается с единицы, а не с нуля.
 */

public class Task {
    public static void main(String[] args) {
        System.out.println(findNthFibonacciNumber(1));
        System.out.println(findNthFibonacciNumber(5));
        System.out.println(findNthFibonacciNumber(10));
    }

    public static int findNthFibonacciNumber(int number) {
        int number1 = 1;
        int number2 = 1;
        int sumOfTwoPreviousNumbers;

        for (int i = 1; i < number; i++) {
            sumOfTwoPreviousNumbers = number1 + number2;
            number1 = number2;
            number2 = sumOfTwoPreviousNumbers;
        }

        return number1;
    }

}
