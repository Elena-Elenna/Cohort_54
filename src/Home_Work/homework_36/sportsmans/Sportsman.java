package Home_Work.homework_36.sportsmans;

public class Sportsman implements Comparable <Sportsman> {
    private String name;
    private double score;
    private int age;

    public Sportsman(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sportsman { name = " + name + "; age = " + age + "; score = " + score + " }";
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getScore() {return score;}

    public void setScore(double score) {this.score = score;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    @Override
    public int compareTo(Sportsman sportsman) {return this.getName().compareTo(sportsman.getName());}
}
