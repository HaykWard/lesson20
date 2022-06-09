package game;

public class Weapon extends Item{

    public int power;
    public int attack;

    public Weapon(String name, int hp, int price, int weight, int power, int attack) {
        super(name, hp, price, weight);
        this.power = power;
        this.attack = attack;
    }

    public void info(){
        System.out.println( "Информация об оружии "+name+": HP:"+ hp+" attack: "+ attack+" power: "+ power+" weight: "+ weight+" price"+price);
    }
}
