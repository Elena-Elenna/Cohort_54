package Home_Work.homework_15;

public class Doktor {
    String name;
    String speciality;
    int age;

    public Doktor(String name,String speciality, int age) {
        this.name = name;
        this.speciality = speciality;
        this.age = age;
    }
    public void info() {
        System.out.printf("\nМое имя %s, мне %d лет, я %s.\n", name, age, speciality);
    }

    public void work() {
        System.out.println("Я лечу людей.");
    }
    public void entertainment() {
        System.out.println("Я занимаюсь спортом.");
    }
    public void relax() {
        System.out.println("Я люблю отдыхать!");
    }

    public static void main(String[] args) {
        Doktor doktor = new Doktor("Иван", "Хирург", 60);
        doktor.info();
        doktor.work();
        doktor.entertainment();
        doktor.relax();
    }
}
