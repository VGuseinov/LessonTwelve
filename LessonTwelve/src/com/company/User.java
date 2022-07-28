package com.company;

public class User {
    public void chat(Messenger m) {
        m.sendMessege("How r u?");
        System.out.println(m.getMessege());
        System.out.println(m.getMessege());
        m.sendMessege("Goodbye");
    }
}
