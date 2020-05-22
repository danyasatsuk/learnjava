## [Конструктор](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/Constructor.java) и [Конструктор1](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/Cycle.java)
С помощью конструктора можно сразу добавлять данные, к примеру создаем два класса: 

Constructor1:
```java
package com.danyasatsuk;

public class Constructor1 {
    public int dollars;
    public int roubles;
    public Constructor1(int d, int r) {
        dollars = d;
        roubles = r;
    }
    public Constructor1() {
        dollars = 15;
        roubles = 150;
    }
}
```

Constructor:
```java
package com.danyasatsuk;

public class Constructor {
    public static void main(String[] args) {
        Constructor1 me = new Constructor1(142, 1058);
        Constructor1 friend = new Constructor1();
        System.out.println("Я инициализирован, долларов у меня " + me.dollars);
        System.out.print("Друг инициализирован с пустыми данными, долларов у друга " + friend.dollars);
    }
}
```