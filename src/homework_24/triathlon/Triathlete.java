package homework_24.triathlon;

public class Triathlete implements Runner, Swimmer{
    private String name;
    private int age;


    public Triathlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Triathlete {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public void run() {
        System.out.println(name + " бежит");
    }

    @Override
    public void swim() {
        System.out.println(name + " плывет");
    }
}
