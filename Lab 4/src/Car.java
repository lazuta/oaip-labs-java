public class Car extends WheeledTransport {
    protected float speed;
    protected float engineVolume;
    protected String bodyworkType;

    public Car(String color, double weight, String type, int wheelCount, float height, float length, float speed, float engineVolume, String bodyworkType) {
        super(color, weight, type, wheelCount, height, length);
        this.speed = speed;
        this.engineVolume = engineVolume;
        this.bodyworkType = bodyworkType;
    }

    public Car(String color, double weight, String type, float speed, float engineVolume, String bodyworkType) {
        super(color, weight, type);
        this.speed = speed;
        this.engineVolume = engineVolume;
        this.bodyworkType = bodyworkType;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBodyworkType() {
        return bodyworkType;
    }

    public void setBodyworkType(String bodyworkType) {
        this.bodyworkType = bodyworkType;
    }

    void accelerate(float seconds) {
        speed += 10;
    }

    void requiresALotOfFuel() {
        if (engineVolume > 1.4f) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", engineVolume=" + engineVolume +
                ", bodyworkType='" + bodyworkType + '\'' +
                ", wheelCount=" + wheelCount +
                ", height=" + height +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
