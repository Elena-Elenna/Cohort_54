package homework_23.game;

public class Warrior extends GameCharacter{

    public Warrior(String name, String weapon, int strength, int speed) {
        super(name, weapon, strength, speed);
    }


    @Override
    public void attack() {
        System.out.printf("Воин %s атакует %s c силой %d и скоростью %d\n",
                getName(),getWeapon(),getStrength(),getSpeed());
    }
}
