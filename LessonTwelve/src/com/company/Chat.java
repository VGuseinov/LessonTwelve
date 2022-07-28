package com.company;




// абстрактный класс не обязан иметь абсрактные методы
// если в классе есть абстркатные методы то и класс обязан быть абстрактным
public abstract class Chat implements Messenger {
    private int traffic;

    public int getTraffic() {
        return traffic;
    }

    private void addTraffic(String m) {
        this.traffic += m.length();
    }

    @Override
    public void sendMessege(String m) {
        this.addTraffic(m);
    }

    @Override
    public abstract String getMessege();
}
