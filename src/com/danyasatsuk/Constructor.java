package com.danyasatsuk;

public class Constructor {
    public static void main(String[] args) {
        Constructor1 me = new Constructor1(142, 1058);
        Constructor1 friend = new Constructor1();
        System.out.println("Я инициализирован, долларов у меня " + me.dollars);
        System.out.print("Друг инициализирован с пустыми данными, долларов у друга " + friend.dollars);
    }
}