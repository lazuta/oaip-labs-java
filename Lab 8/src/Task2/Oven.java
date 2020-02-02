package Task2;

public class Oven extends Kitchen {
    protected boolean powerSocket;
    protected double power;

    Oven() {
        super();
    }

    Oven(boolean powerSocket, double power) {
        super(powerSocket, power);
        this.powerSocket = powerSocket;
        this.power = power;
    }

    @Override
    public boolean isPowerSocket() {
        return powerSocket;
    }

    @Override
    public void setPowerSocket(boolean powerSocket) {
        this.powerSocket = powerSocket;
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public double setPower(double power) {
        this.power = power;
        return power;
    }
}
