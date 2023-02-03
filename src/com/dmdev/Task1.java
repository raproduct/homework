package com.dmdev;

public class Task1 {
    public static void main(String[] args) {
    int minutes = 59;
    if (minutes >= 0 && minutes <= 14) {
        System.out.println(minutes + " первая");
    } else if (minutes >= 15 && minutes <= 29) {
        System.out.println(minutes + " вторая");
    } else if (minutes >= 30 && minutes <= 44) {
        System.out.println(minutes + " третяя");
    } else if (minutes >= 45 && minutes <= 59){
        System.out.println( " четвертая");
    } else {
        System.out.println("file is not correct ");
    }
}
}
