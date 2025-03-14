package Home_Work.homework_15;

public class Student {
    String name;
    String speciality;
    int age;

    public Student(String name, String speciality, int age){
        this.name = name;
        this.age = age;
        this.speciality = speciality;
    }
    public void info(){
        System.out.printf("\nМое имя %s, мне %d лет, я %s \n", name, age, speciality);
    }
    public void work(){
        System.out.println("Я учусь.");
    }
    public void relax(){
        System.out.println("Я отдыхаю с друзьями.");
    }
    public void entertainment(){
        System.out.println("Я играю на компьютере!");
    }

    public static void main(String[] args) {
        Student student = new Student("Maкс","студент!", 20 );
        student.info();
        student.work();
        student.entertainment();
        student.relax();
    }
}
