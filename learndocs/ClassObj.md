## [КлассОбж](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/ClassObj.java) и [КлассОбж1](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/ClassObj1.java)
Познаем смысл классов и объектов

Класс `ClassObj1`
```java
package com.danyasatsuk;

public class ClassObj1 {
    public int dollars = 15;
}
```

Класс `ClassObj`
```java
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
```

Мы инициализировали класс у себя в строках `ClassObj1 me = new ClassObj1()` и `ClassObj1 friend = new ClassObj1();`. Потом мы стали изменять переменные в инициализированных классах `me.dollars += 3` и `friend.dollars -= 10`