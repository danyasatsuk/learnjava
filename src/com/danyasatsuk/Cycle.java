package com.danyasatsuk;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
