package homework_22.people;

public class ProfessionalAthlete extends AthleteAmateur {

    {
        this.setTypeRunner("Профессионал");
    }

    public ProfessionalAthlete(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }

    public ProfessionalAthlete() {
        super(25,5);
    }
}
