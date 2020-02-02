package Task1;

import Task1.Techniks.Tank;

public class Main {
    public static void main(String[] args) {
        Tank tank =  new Tank(false, 127.1, 100000, "Armata", 90, 90, 10, 4, 80);

        tank.addPower();
        tank.checkPeople();
    }
}
