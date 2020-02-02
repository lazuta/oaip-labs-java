package Task1;

import java.util.Date;

public class Minute extends Hour{
    protected int min;

    public Minute(int hour) {
        super(hour);
    }

    public Minute(int hour, int min) {
        super(hour);
        this.min = min;
    }

    @Override
    void getDate() {
        Date dateNow = new Date();
        super.hour = dateNow.getHours();
        System.out.printf(String.valueOf(dateNow.getHours()));
    }

    @Override
    String time() {
        if (super.hour > 12 && super.hour < 18)
            return "день";
        else if(super.hour > 19 && super.hour < 23)
            return "Вечер";
        else if(super.hour > 0 && super.hour < 6)
            return "Ночь";
        else
            return "Утро";
    }
}
