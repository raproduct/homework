package com.dmdev.prostoZadacha;

public class Zadacha21 {

    public static void main(String[] args) {

        int znachenie = 5;
        System.out.println(factorial(znachenie)); // 120
    }

    public static int factorial(int value) {
        int fact = 1;
        for (int currentValue = 1; currentValue <= value; currentValue++) {
            fact *= currentValue;

        }
        return fact;
    }
}
