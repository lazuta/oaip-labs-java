package com;

public class Equipment {
    protected boolean warMode;
    protected double power;
    protected double price;

    public Equipment() {}

    public Equipment(boolean mode, double power, double price) {
        this.warMode = mode;
        this.power = power;
        this.price = price;
    }

    public boolean iswarMode() {
        return warMode;
    }

    public void setwarMode(boolean mode) {
        this.warMode = mode;
    }

    public double getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected void doWarMode() {
        if (warMode)
            System.out.println("Боевой режим включен");
        else
            System.out.println("Боевой режим выключен");

        this.warMode = !this.warMode;
    }

    protected void doAttack() {
        if (warMode)
            System.out.println("Начинаем атаку");
        else
            System.out.println("Боевой режим выключен");
    }

    protected void addPower() {
        this.power = this.power * 0.6 + this.power;

        System.out.println("Мощность увеличина на 60%");
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "warMode=" + warMode +
                ", power=" + power +
                ", price=" + price +
                '}';
    }
}
