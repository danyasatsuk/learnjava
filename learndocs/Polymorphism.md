## [ком.данясацук.полиморфизм](https://github.com/danyasatsuk/learnjava/blob/master/src/com/danyasatsuk/polymorphism)
Здесь я рассмотрел одну фичу из ООП (объектно-ориентированного программирования), а точнее - полиморфизм.

Создал я для этого 4 класса:

Polymorphism
```java
package com.danyasatsuk.polymorphism;

public class Polymorphism {
    public void out() {

    }
}
```
Test1
```java
package com.danyasatsuk.polymorphism;

public class Test1 extends Polymorphism {
    public void out() {
        System.out.println("Тест1");
    }
}
```
Test2
```java
package com.danyasatsuk.polymorphism;

public class Test2 extends Polymorphism {
    public void out() {
        System.out.println("Test2");
    }
}
```
Main
```java
package com.danyasatsuk.polymorphism;

public class Main {
    public static void main(String[] args) {
        Polymorphism[] poly = new Polymorphism[] {new Test1(), new Test2()};
        for(Polymorphism polymorphism: poly)polymorphism.out();
    }
}
```