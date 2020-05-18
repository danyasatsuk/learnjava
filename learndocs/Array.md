## Эррэй
Массивы в Java выглядят так
```java
package com.danyasatsuk;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0] = 15;
        a[1] = 25;
        System.out.print(a[0] + a[1]);
    }
}
```
`int[] a = new int[2]` - это инициализация массива, где {

1. `int[]` - мы говорим Java то что это массив
2. `new int[2]` - мы инициализируем массив в котором будет содержаться 2 числа

}