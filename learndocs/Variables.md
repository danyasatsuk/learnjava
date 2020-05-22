## [Вариэйблс](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/Variables.java)
Какие переменные бывают в Java:
1. `byte` - может поместить в себя 1 байт или от -128 и до 127
2. `short` - может поместить в себя 2 байта или от -32768 и до 32767
3. `int` - может поместить в себя 4 байта или от -2^32 и до 2^31-1
4. `long` - может поместить в себя 8 байт или от -2^63 и до 2^63-1
5. `float` - как `int` но с плавающей точкой
6. `double` - как `long` но с плавающей точкой
7. `boolean` - условная переменная (то есть либо `true`, либо `false`)
8. `char` - может содержать в себе 1 символ
9. `String` - может содержать в себе текст

К примеру:
```java
package com.danyasatsuk;

public class Variables {
    public static void main (String[] argv) {
        byte a = 118;
        System.out.println(a);
        short b = 15387;
        System.out.println(b);
        int c = 2937491;
        System.out.println(c);
        long d = 193498235;
        System.out.println(d);
        float e = 304.123953f;
        System.out.println(e);
        double f = 3940234.194325234d;
        System.out.println(f);
        boolean g = true;
        System.out.println(g);
        char h = 'A';
        System.out.println(h);
        String i = "Hello!";
        System.out.println(i);
    }
}


```
