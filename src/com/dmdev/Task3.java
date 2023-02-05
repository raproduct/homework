package com.dmdev;

/**
 * Задание 3
 * <p>
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class Task3 {
    public static void main(String[] args) {
        int triangle1 = 20;
        int triangle2 = 20;
        int triangle3 = 10;
        int triangle4 = 20;
        double square1 = calculateTriangle(triangle1, triangle2);
        double square2 = calculateTriangle(triangle3, triangle4);
        outputTriangle(square1, square2);


    }

    public static double calculateTriangle(int first, int second) {
        double result = 0.5 * first * second;
        return result;
    }

    public static void outputTriangle(double square1, double square2) {
        if (square1 > square2) {
            System.out.println("square1 > square2");
        } else if (square1 < square2) {
            System.out.println("square1 < square2");
        } else {
            System.out.println("square1 = square2");
        }


    }


}

