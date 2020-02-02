package Task1;

import Task1.Abstracts.Equipment;

public class Ground extends Equipment {
    protected String type;
    protected double maxSpeed;
    protected double powerBattle;
    private double kAttack;

    public Ground() {}

    public Ground(String type, double maxSpeed, double powerBattle) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.powerBattle = powerBattle;
    }

    public Ground(boolean mode, double power, double price, String type, double maxSpeed, double powerBattle) {
        super(mode, power, price);
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.powerBattle = powerBattle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPowerBattle() {
        return powerBattle;
    }

    public void setPowerBattle(double powerBattle) {
        this.powerBattle = powerBattle;
    }

    public String newType(String type) {
        return this.type = type;
    }

    @Override
    protected String doWarMode() {
        super.warMode = !super.warMode;

        if (!super.warMode)
            return "Боевой режим включен";
        else
            return "Боевой режим выключен";
    }

    @Override
    protected void doAttack() {
        super.doAttack();
    }

    @Override
    protected void addPower() {
        super.addPower();
    }

    @Override
    protected void addPower(double power) {
        super.addPower(power);
    }

    @Override
    protected void addPower(double power, double procent) {
        super.addPower(power, procent);
    }

    @Override
    public String toString() {
        return "Ground{" +
                "type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", powerBattle=" + powerBattle +
                '}';
    }
}
