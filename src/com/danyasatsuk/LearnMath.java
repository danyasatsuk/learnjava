package com.danyasatsuk;

import java.util.Scanner;

public class LearnMath {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Введите первое число: ");
        first = num.nextInt();
        System.out.print("Введите второе число: ");
        second = num.nextInt();
        result = first + second;
        result++;
        System.out.println("Результат + 1: " + result);
    }
}
