package com.danyasatsuk.polymorphism;

public class Main {
    public static void main(String[] args) {
        Polymorphism[] poly = new Polymorphism[] {new Test1(), new Test2()};
        for (Polymorphism polymorphism : poly) polymorphism.out();
    }
}
