package com.dmdev.draft;

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
public class Draft3 {
    public static void main(String[] args) {
        int triangle1 = 10;
        int triangle2 = 20;
        int triangle3 = 30;
        int triangle4 = 40;
        double firstArea = getAreaTriangle(triangle1, triangle2);
        double secondArea = getAreaTriangle(triangle3, triangle4);
        System.out.println(firstArea);
        System.out.println(secondArea);
        print(20.20,10.10);
    }

    public static double getAreaTriangle(int first, int second) {
        return first * second / 2.0;
    }

    public static void print(double first, double second) {
        if (first > second) {
            System.out.println("что 1 треугольник больше");
        } else if (first < second) {
            System.out.println("что 1 треугольник меньше");
        } else if (first == second) {
            System.out.println("треугольники ровны");
        }
    }
}
