package com.danyasatsuk;

import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QtoJSON {
    public static boolean print(String print) {
        System.out.print(print);
        return true;
    }
    public static String question(String question) {
        print(question + ": ");
        Scanner q = new Scanner(System.in);
        return q.nextLine();
    }
    public static boolean toJSON(String file, JSONObject data) {
        try {
            FileWriter filedata = new FileWriter(file);
            filedata.write(data.toString());
            filedata.flush();
            filedata.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        String name = question("Как тебя зовут");
        String lastname = question("Твоя фамилия");
        String age = question("Сколько тебе лет");
        JSONObject data = new JSONObject();
        data.put("name", name);
        data.put("lastname", lastname);
        data.put("age", age);
        if (toJSON("data/data.json", data)) {
            System.out.print("Запись произведена успешно");
        } else {
            System.out.print("Произошла ошибка");
            System.exit(1);
        }
    }
}
