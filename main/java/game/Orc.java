package game;

public class Orc extends Human{

    public Orc(String name, int hp, int attack, int armor, int power, int weight, boolean flag, int money) {
        super(name, hp, attack, armor, power,  weight, flag, money);
    }

    public void boom(Heroes target) {
        target.hp = 0;
        System.out.println(name + " взорвался и убил " + target.name + "!");
        target.endGame();
    }

}
