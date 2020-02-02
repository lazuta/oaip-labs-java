package Task2;

public class Kitchen extends HomeDevice{
    protected double maxPower;
    protected boolean powerSocket;
    protected double power;

    Kitchen(boolean powerSocket, double power) {
        super(powerSocket, power);
    }

    public Kitchen() {
        super();
    }

    @Override
    protected void onSocket() {
    }
}
