package com.company;

public class Main {

    public static void main(String[] args) {
	    // абстрактные классы
        // интерфейсы

        // Java потдерживает множественное наследование интерфейсов
        System.out.println(Messenger.test);
        Viber viber = new Viber();
        Telegram telegram = new Telegram();
        User user = new User();

        user.chat(telegram);
        user.chat(viber);

        
    }
}
