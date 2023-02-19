package com.dmdev.draft;

/**
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */


public class Draft {
    public static void main(String[] args) {
        double var = 10.10;
        double var2 = 20.20;
        char var3 = '-';
        findBest(var,var2,var3);
    }

    public static void findBest(double operand1, double operand2, char operation) {
        if (operation == '-'){
            System.out.println(operand1 + operand2);
        }
    }



}


