package com;

public class Ground extends Equipment{
    protected String type;
    protected double maxSpeed;
    protected double powerBattle;

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

    @Override
    public String toString() {
        return "Ground{" +
                "type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", powerBattle=" + powerBattle +
                '}';
    }
}
