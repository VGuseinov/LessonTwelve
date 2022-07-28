package com.company;

import java.io.Serializable;
import java.util.Random;

public class Viber extends Chat {
    @Override
    public void sendMessege(String m) {
        super.sendMessege(m);
        System.out.println(m);
        System.out.println("Отправлено через Viber");
    }

    @Override
    public String getMessege() {
        Random random = new Random();
        boolean p = random.nextBoolean();
        if (p) {
            return "hello";
        }
        return "ошибка отправки";
    }
}
