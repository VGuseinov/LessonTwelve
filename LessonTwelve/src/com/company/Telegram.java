package com.company;

public class Telegram extends Chat {

    @Override
    public void sendMessege(String m) {
        super.sendMessege(m);
        System.out.println(m);
        System.out.println("Отправлено через Telegram");
    }

    @Override
    public String getMessege() {
        String m = "Hello";
        char[] chars = m.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i]++;
        }
        return new String(chars);
    }
}
