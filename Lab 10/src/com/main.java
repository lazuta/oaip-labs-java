package Luba.lab10;

import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();

        NeiroHururg n1 = new NeiroHururg("Игорь", 58, 330);
        System.out.println(n1.information());
        System.out.println(n1.place(hour));
    }
}
