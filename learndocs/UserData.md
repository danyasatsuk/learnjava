## [Юзер дата](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/UserData.java)
Мы будем получать данные от пользователя. К примеру код: 
```java
package com.danyasatsuk;

import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Мы ввели: " + str.nextLine());
    }
}
```

В этом коде появились новые строки:
1. `import java.util.Scanner;` - мы импортируем из класса java метод Scanner который поможет нам получить данные от пользователя
2. `Scanner str = new Scanner(System.in);` - здесь мы создаем переменную в которой содержится метод для получения данных из консоли
3. `System.out.println("Мы ввели: " + str.nextLine());` - тут мы получили данные пользователя из `str.nextLine()` и вывели их консоль