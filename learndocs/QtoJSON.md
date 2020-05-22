## [КЬЮтуЖСОН](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/QtoJSON.java)
Здесь я решил попробовать написать программу которая бы собирала данные от пользователя и выводила их в JSON файл. Что у меня получилось:
```java
package com.danyasatsuk;

import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QtoJSON {
    public static boolean print(String print) { //мне каждый раз было лень писать System.out.print, поэтому вот
        System.out.print(print);
        return true;
    }
    public static String question(String question) { //функция для того чтобы задать вопрос пользователю
        print(question + ": ");
        Scanner q = new Scanner(System.in);
        return q.nextLine();
    }
    public static boolean toJSON(String file, JSONObject data) { //функция для того чтобы сохранить все данные в JSON
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
        String name = question("Как тебя зовут"); //первый вопрос
        String lastname = question("Твоя фамилия"); //второй вопрос
        String age = question("Сколько тебе лет"); //третий вопрос
        JSONObject data = new JSONObject(); //создаем JSON обьект
        data.put("name", name); //добавляем в него первый ответ
        data.put("lastname", lastname); //второй ответ
        data.put("age", age); //третий ответ
        if (toJSON("data/data.json", data)) { //проверка, успешно ли произошла запись
            System.out.print("Запись произведена успешно");
        } else {
            System.out.print("Произошла ошибка");
            System.exit(1);
        }
    }
}
```