## [Хеллоу ворлд](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/HelloWorld.java)
Здесь начинается мой этап изучения языка Java. Возьмем в пример код:
```java
package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World!");
    }
}
```

И так, данная программа выводит на экран надпись `Hello World!`, разберем каждую строчку:

`package com.company;` - эта строка обозначает то что класс `Main` сейчас находится в пакете `com.company`

`public class Main {}` - здесь мы создаем публичный класс `Main` {

1. `public` - модификатор доступа, означает то что классом можно воспользоваться везде
2. `class` - класс
3. `Main` - название класса

}

`public static void main(String[] args) {}` - здесь мы создаем метод `main` {

1. `public` - модификатор доступа (можно прочитать выше)
2. `static` - означает то что переменные могут работать только в данном методе
3. `void` - этот метод может ничего не возвращать
4. `main` - название нашего метода
5. `String[] args` - наш метод принимает параметр `args` которые представляет собой массив данных.
   
}

`System.out.print("Hello World!");` - здесь мы просим вывести на экран фразу `Hello World!` {

1. `System` - это класс `System` в котором есть все для взаимодействия с консолью и не только.
2. `out` - это объект в котором содержится все для вывода данных в консоль
3. `print` - метод, который дает нам вывести в консоль текст

}

З.Ы. В Java есть метод `System.out.println("Hello World!")` который выводит текст с новой строки