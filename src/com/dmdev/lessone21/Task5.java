package com.dmdev.lessone21;

/**
 * Задание 2
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Task5 {
    public static void main(String[] args) {
        int value = 1234;
        System.out.println(vozvratChisla(value));
    }
    public static int vozvratChisla(int chislo) {
        int value1 = 0;
        while (chislo != 0) {
            value1 = value1 * 10 + (chislo % 10);
            chislo = chislo / 10;
        }
        return value1;
    }

}
