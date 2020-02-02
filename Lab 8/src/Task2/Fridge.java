package Task2;

public class Fridge extends Kitchen{
    protected boolean powerSocket;
    protected double power;

    Fridge() {
        super();
    }

    Fridge(boolean powerSocket, double power) {
        super(powerSocket, power);
        this.powerSocket = powerSocket;
        this.power = power;
    }

}
