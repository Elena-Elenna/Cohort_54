package Home_Work.homework_23.game;
/*
Task 2
Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
Определите абстрактный метод attack(), который будет различаться для разных типов персонажей
(например, воин атакует мечом, а маг использует магические заклинания).

Создайте несколько конкретных подклассов, представляющих разные типы персонажей,
такие как Warrior, Mage, Archer, и т. д.
Переопределите метод attack() для каждого класса.

Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.
 */

abstract class GameCharacter {
    private String name;
    private String weapon;
    private int strength;
    private int speed;


    public GameCharacter(String name, String weapon, int strength, int speed) {
        this.name = name;
        this.weapon = weapon;
        this.strength = strength;
        this.speed = speed;
    }



    public abstract void attack();

    @Override
    public String toString() {
        return "Name: " + name + "; weapon: " + weapon + "; strength: " + strength + "; speed: " + speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getSpeed() {
        return this.speed;
    }
}


