package game;

public class Armor extends Item{

    public int armor;

    public Armor(String name, int hp, int price, int weight, int armor) {
        super(name, hp, price, weight);
        this.armor = armor;
    }

    public void info(){
        System.out.println( "Информация о броне "+name+": HP:"+ hp+" armor: "+ armor+" weight: "+ weight+" price"+price);
    }
}
