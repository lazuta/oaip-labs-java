package Task2;

abstract class HomeDevice {
    protected boolean powerSocket = false;
    protected double power = 0;

    protected HomeDevice(boolean powerSocket, double power) {
        this.powerSocket = powerSocket;
        this.power = power;
    }

    public HomeDevice() {}


    protected double counPower() {
        return power;
    }

    public boolean isPowerSocket() {
        return powerSocket;
    }

    public void setPowerSocket(boolean powerSocket) {
        this.powerSocket = powerSocket;
    }

    public double getPower() {
        return power;
    }

    public double setPower(double power) {
        if(powerSocket)
            return power;
        else
            return 0;
    }

    public String searchDevice(double power) {
        if(this.power == power)
            return "Девайсы найдены.";
        else
            return "Девайсы не найдены.";
    }

    abstract protected void onSocket();

}
