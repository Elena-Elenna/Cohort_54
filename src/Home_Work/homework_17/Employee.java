package Home_Work.homework_17;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 100){
            this.age = age;
        }
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0){
            this.salary = salary;
        }
    }
    public void info(){
        System.out.printf("Я %s, мой возвраст: %d, моя зарплата: %.2f", name, age, salary);
    }
}
