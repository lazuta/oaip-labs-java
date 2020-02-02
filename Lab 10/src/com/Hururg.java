package Luba.lab10;

abstract class Hururg implements IDoctorInterface{
    public  String name;
    private double salary;
    private int age;

    public Hururg(){}

    public Hururg(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract String information();

    public double finalSalary() { return countSolar() - tallage(); }

    public String place(int value) {
        if(value > 8 && value < 16) {
            return "На работе";
        } else {
            return "Дома";
        }
    }

    @Override
    public double countSolar() {
        return Math.round(this.salary * countWorkTime());
    }

    @Override
    public double countWorkTime() {
        return timeDay * weekWork * dayWork;
    }

    @Override
    public double tallage() { return countSolar() * 0.19; }
}
