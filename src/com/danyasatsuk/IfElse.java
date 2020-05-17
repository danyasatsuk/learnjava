package com.danyasatsuk;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        number = num.nextInt();
        if (number > 10) {
            System.out.print("Это число больше 10");
        } else if (number == 10) {
            System.out.print("Это число равно 10");
        } else {
            System.out.print("Это число меньше 10");
        }
    }
}
