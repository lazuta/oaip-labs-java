public class Boat extends SeaTransport {
    protected float speed;
    protected float maxLiftWeight;
    protected int passengerCount;

    public Boat(String color, double weight, String type, int model, float speed, float maxLiftWeight) {
        super(color, weight, type, model);
        this.speed = speed;
        this.maxLiftWeight = maxLiftWeight;
    }

    public Boat(String color, String type, int model, float height, float length, float speed, float maxLiftWeight, int passengerCount) {
        super(color, type, model, height, length);
        this.speed = speed;
        this.maxLiftWeight = maxLiftWeight;
        this.passengerCount = passengerCount;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getMaxLiftWeight() {
        return maxLiftWeight;
    }

    public void setMaxLiftWeight(float maxLiftWeight) {
        this.maxLiftWeight = maxLiftWeight;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    boolean canLift(float wight) {
        return weight <= maxLiftWeight;
    }

    int spaceForPassengersLeft(int passengers) {
        return passengerCount - passengers;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "speed=" + speed +
                ", maxLiftWeight=" + maxLiftWeight +
                ", passengerCount=" + passengerCount +
                ", model=" + model +
                ", height=" + height +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
