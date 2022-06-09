package game;

public abstract class Item {

    public String name;
    public int hp;
    public int price;
    public int weight;

    public Item(String name, int hp, int price, int weight){

        this.name = name;
        this.hp = hp;
        this.price = price;
        this.weight = weight;
    }

    public abstract void info();

}
