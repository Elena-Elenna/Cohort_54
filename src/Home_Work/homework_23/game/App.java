package Home_Work.homework_23.game;

public class App {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Sem","мечем", 20, 10);
        warrior.attack();
        System.out.println(warrior.toString());

        System.out.println("++++++++++++++++");

        Mage mage = new Mage("Janet", "заклинание", 100, 50);
        mage.attack();
        System.out.println(mage.toString());

        System.out.println("++++++++++++++++");

        Archer archer = new Archer("Kollet", "огненной стрелой", 40, 40);
        archer.attack();

        System.out.println("======================");

        GameCharacter[] game = new GameCharacter[3];
        game[0] = warrior;
        game[1] = mage;
        game[2] = archer;

        for (int i = 0; i < game.length; i++){
            game[i].attack();
        }

    }
}
