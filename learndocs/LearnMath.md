## [Лёрн матх](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/LearnMath.java)
Здесь я разберу математику в Java. К примеру код:
```java
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
```
Новое в нем:
1. `int first, second, result;` - несколько переменных одного вида можно создать в одной строке.
2. `result = first + second;` - здесь мы сложили числа `first` и `second`
3. `result++;` - мы прибавили к `result` единицу