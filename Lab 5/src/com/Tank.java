package com;

public class Tank extends Ground {
    protected int people;
    protected int maxPeople;
    protected double speed;

    public Tank() {}

    public Tank(int people, int maxPeople, double speed) {
        this.people = people;
        this.maxPeople = maxPeople;
        this.speed = speed;
    }

    public Tank(String type, double maxSpeed, double powerBattle, int people, int maxPeople, double speed) {
        super(type, maxSpeed, powerBattle);
        this.people = people;
        this.maxPeople = maxPeople;
        this.speed = speed;
    }

    public Tank(boolean mode, double power, double price, String type, double maxSpeed, double powerBattle, int people, int maxPeople, double speed) {
        super(mode, power, price, type, maxSpeed, powerBattle);
        this.people = people;
        this.maxPeople = maxPeople;
        this.speed = speed;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    protected void checkSpeed() {
        if(this.speed <= super.maxSpeed)
            System.out.println("Скорость допустимая");
        else
            System.out.println("Скорость превышает допустимую");
    }

    protected void checkPeople() {
        if(this.people > this.maxPeople)
            System.out.printf("Высадите лишних: " + (this.maxPeople -  this.people));
        else
            System.out.println("Все хорошо");
    }

    @Override
    protected void addPower() {
        super.addPower();
    }

    @Override
    public String toString() {
        return "Tank{" +
                "people=" + people +
                ", maxPeople=" + maxPeople +
                ", speed=" + speed +
                '}';
    }
}
