public class WheeledTransport extends Transport {
    protected int wheelCount;
    protected float height;
    protected float length;

    WheeledTransport(String color, double weight, String type, int wheelCount, float height, float length) {
        super(color, weight, type);
        this.wheelCount = wheelCount;
        this.height = height;
        this.length = length;
    }

    WheeledTransport(String color, double weight, String type) {
        super(color, weight, type);
        this.wheelCount = 4;
        this.height = 1.5f;
        this.length = 10;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    void determineType(boolean isMotorized) {
        if (wheelCount == 2) {
            if (isMotorized) {
                System.out.println("Seems like motorcycle");
            } else {
                System.out.println("Bicycle");
            }
        } else if (wheelCount == 4) {
            System.out.println("Car");
        } else {
            System.out.println("Something else");
        }
    }

    boolean canPass(float maxHeight) {
        return height < maxHeight;
    }

    @Override
    public String toString() {
        return "WheeledTransport{" +
                "wheelCount=" + wheelCount +
                ", height=" + height +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
