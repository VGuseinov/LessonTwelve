package com.company;

// в интерфейс можно помещать методы без их реализации (без тела)
// и стачические свойства
// у полей интерфейса не может быть модификатора доступа
public interface Messenger {
    static int test = 9;
    void sendMessege(String m);
    String getMessege();
}

