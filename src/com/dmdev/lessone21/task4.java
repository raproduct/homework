package com.dmdev.lessone21;

/**
 * Задание 1
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 */
public class task4 {
    public static void main(String[] args) {
        int value = 123334;
        //      int chetChisla = getChetnoeChislo(567888);
//        int x = chetChisla * 5;
        //     System.out.println(chetChisla);
        System.out.println(getChetnoeChislo(value));
        System.out.println(getNechet(value));
//        System.out.println(x);
//        System.out.println(x);
    }

    public static int getChetnoeChislo(int number1) {
        int colichestvoCet = 0;
        while (number1 != 0) {
            if (number1 % 2 == 0) {
                colichestvoCet++;
            }
            number1 /= 10;
        }
        return colichestvoCet;
    }
    public static int getNechet(int chislo) {
        int colichNechet = 0;
        while (chislo != 0) {
            if (chislo % 2 == 1) {
                colichNechet++;
            }
            chislo /= 10;
        }
        return colichNechet;
    }
}
