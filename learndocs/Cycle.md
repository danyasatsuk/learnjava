## [Сайкл](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/Cycle.java)
Циклы в Java в точности такие же как и в JavaScript, к примеру: 
```java
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
```