package homework_23.game;

public class Archer extends GameCharacter{
    public Archer(String name, String weapon, int strength, int speed) {
        super(name, weapon, strength, speed);
    }


    @Override
    public void attack() {
        System.out.printf("Лучник %s атакует %s c силой %d и скоростью %d\n",
                getName(),getWeapon(),getStrength(),getSpeed());
    }
}
