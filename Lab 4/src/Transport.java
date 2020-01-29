public class Transport {
    protected String color;
    protected double weight;
    protected String type;

    Transport(String color, double weight, String type) {
        this.color = color;
        this.weight = weight;
        this.type = type;
    }

    Transport(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void applyPaint(String paint) {
        color += paint;
    }

    void reduceWeight(String action) {
        switch (action){
            case "Replace heavy parts":
                weight *= 0.9f;
                break;
            case "Install armor":
                weight *= 1.2f;
                break;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
