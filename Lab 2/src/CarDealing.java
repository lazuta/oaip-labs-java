import java.util.Scanner;

public class CarDealing {
    public static void main(String[] args) {
        /*Car[] cars = {
                new Car("Honda", "Accord SE", 4900, 120, "Black"),
                new Car("Tesla", "Model X", 132000, 200, "Black"),
                new Car("Tesla", "Model 3", 35000, 200, "White"),
                new Car("Mercedes-Benz", "190 E", 2999, 100, "Grey"),
                new Car("Opel", "Zafira", 37000, 160, "Grey")
        };

        Customer[] customers = {
                new Customer("Yamikani", "Hortense", "Han", 26, 50000),
                new Customer("Milla", "Zuzana", "Vernersen", 18, 4000),
                new Customer("Isabelle", "Eugenia", "Long", 50, 100000),
                new Customer("Daniel", "Polydeukes", "Vinogradov", 29, 20000),
                new Customer("Ivan", "Ivanovich", "Belyj", 35, 150000)
        };*/

        int totalCars = 2;
        Car[] cars = new Car[totalCars];
        int totalCustomers = 2;
        Customer[] customers = new Customer[totalCustomers];

        Scanner input = new Scanner(System.in);
        System.out.println("Fill data about cars.");
        for (int i = 0; i < totalCars; i++) {
            System.out.println("Car " + (i + 1) + ":");
            System.out.print("Brand: ");
            String brand = input.nextLine();

            System.out.print("Model: ");
            String model = input.nextLine();

            System.out.print("Price: ");
            double price = input.nextDouble();

            System.out.print("Top speed: ");
            int topSpeed = input.nextInt();
            input.nextLine();

            System.out.print("Color: ");
            String color = input.nextLine();
            cars[i] = new Car(brand, model, price, topSpeed, color);
        }

        System.out.println("\nFill data about customers.");
        for (int i = 0; i < totalCustomers; i++) {
            System.out.println("Customer " + (i + 1) + ":");
            System.out.print("First name: ");
            String firstName = input.nextLine();

            System.out.print("Middle name: ");
            String middleName = input.nextLine();

            System.out.print("Last name: ");
            String lastName = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Money: ");
            double money = input.nextDouble();
            input.nextLine();
            customers[i] = new Customer(firstName, middleName, lastName, age, money);
        }

        System.out.println();
        for (Customer i : customers) {
            System.out.println(i.getFullName() + ":");

            for (Car j : cars) {
                if (j.getPrice() <= i.getMoney()) {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }
}
