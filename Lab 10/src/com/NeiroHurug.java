package Luba.lab10;

class NeiroHururg extends Hururg{
    public  String name;
    private double salary;
    private int age;

    public NeiroHururg(){}

    public NeiroHururg(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void getSalary(double salary) { this.salary = salary; }

    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public double getSalary() { return this.salary; }

    public String information() {
        return  this.name + ", " + this.age + " лет. Неирохирург. Зарплата: " + finalSalary() + " $/месяц.";
    }

    @Override
    public String place(int value) {
        if(value > 1 && value < 12) {
            return "Дома";
        } else if (value >= 12 && value < 14) {
            return "На приеме";
        } else {
            return "В хирургие.";
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
    public double tallage() {
        double talleg = 0.19;
        return countSolar() * talleg;
    }
}
