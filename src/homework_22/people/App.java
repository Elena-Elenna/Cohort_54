package homework_22.people;

public class App {
    public static void main(String[] args) {
        Human human = new Human();
        AthleteAmateur amateur = new AthleteAmateur();

        human.run();
        System.out.println("++++++++++++++");

        amateur.run();
        System.out.println("============");



        ProfessionalAthlete prof = new ProfessionalAthlete();
        prof.run();

        ProfessionalAthlete prof2 = new ProfessionalAthlete(30,3);
        prof2.run();

    }
}
