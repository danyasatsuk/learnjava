package com.danyasatsuk;

public class ClassObj {
    public static void main(String[] args) {
        ClassObj1 me = new ClassObj1();
        System.out.println("Долларов у меня: " + me.dollars);
        ClassObj1 friend = new ClassObj1();
        System.out.println("Долларов у друга: " + friend.dollars);
        System.out.println("Я получил зарплату в 3 доллара");
        me.dollars += 3;
        System.out.println("Мой друг купил себе мышь для компьютера за 10 долларов");
        friend.dollars -= 10;
        System.out.println("Долларов у меня: " + me.dollars);
        System.out.println("Долларов у друга: " + friend.dollars);
    }
}
