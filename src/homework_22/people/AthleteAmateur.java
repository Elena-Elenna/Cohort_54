package homework_22.people;

public class AthleteAmateur extends Human{
    public AthleteAmateur() {
        super(15,10);
        this.setTypeRunner("Любитель");
    }

    public AthleteAmateur(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }
}
