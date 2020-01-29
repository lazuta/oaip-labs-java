public class SeaTransport extends Transport {
    protected int model;
    protected float height;
    protected float length;

    public SeaTransport(String color, double weight, String type, int model) {
        super(color, weight, type);
        this.model = model;
    }

    public SeaTransport(String color, String type, int model, float height, float length) {
        super(color, type);
        this.model = model;
        this.height = height;
        this.length = length;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
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

    void boatType() {
        if (length < 100 && weight < 5000) {
            System.out.println("Small boat");
        } else if (length < 1000) {
            System.out.println("Big boat");
        } else {
            System.out.println("Unknown type");
        }
    }

    boolean dive(boolean canDive, boolean dive) {
        return canDive && dive;
    }

    @Override
    public String toString() {
        return "SeaTransport{" +
                "model=" + model +
                ", height=" + height +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
