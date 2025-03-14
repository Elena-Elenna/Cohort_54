package Home_Work.homework_23.game;

public class Mage extends GameCharacter{
    public Mage(String name, String weapon, int strength, int speed) {
        super(name, weapon, strength, speed);
    }

    @Override
    public void attack() {
        System.out.printf("Маг %s использует %s c силой %d и скоростью %d\n",
                getName(),getWeapon(),getStrength(),getSpeed());
    }
}
