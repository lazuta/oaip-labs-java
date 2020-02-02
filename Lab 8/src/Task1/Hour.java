package Task1;

import java.util.Date;

abstract class Hour {
    protected int hour;

    public Hour(int hour) {
        this.hour = hour;
    }

    abstract void getDate();
    abstract String time();
}
