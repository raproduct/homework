package com.dmdev.lessone21;

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
public class Task2 {
    public static void main(String[] args) {
        double var1 = 20.20;
        double var2 = 10.10;
        char ivi = '-';
        findBest(12.0, 5.0, '%');
    }

    public static void findBest(double operand1, double operand2, char operation) {
        if (operation == '+') {
            System.out.println(operand1 + operand2);
        } else if (operation == '-') {
            System.out.println(operand1 - operand2);
        } else if (operation == '*') {
            System.out.println(operand1 * operand2);
        } else if (operation == '/') {
            System.out.println(operand1 / operand2);
        } else if (operation == '%') {
            System.out.println(operand1 % operand2);
        } else {
            System.out.println("not connect");
        }




    }


}

