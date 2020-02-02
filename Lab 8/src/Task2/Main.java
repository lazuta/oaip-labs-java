package Task2;

public class Main {
    public static void main(String[] args) {
        Oven o =  new Oven(true, 240);
        Fridge f =  new Fridge(false, 240);

        System.out.println(o.counPower());
    }
}
