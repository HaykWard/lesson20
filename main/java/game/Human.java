package game;

public class Human extends Heroes {

    public int money;

    public Human(String name, int hp, int attack, int armor, int power, int weight, boolean flag, int money) {
        super(name, hp, attack, armor, power, weight, flag);
        this.money = money;
    }

    public void buy(Weapon item) {
        if (flag) {
            if (money >= item.price) {
                if(weight>= item.weight){
                    power += item.power;
                    money -= item.price;
                    weight-=item.weight;
                    System.out.println("Персонаж " + name + " купил " + item.name + "! Мощность увеличена на " + item.power + "!");
                }else {
                    System.out.println(" Нет места для нового редмета!");
                }
            }else {
                System.out.println("Не хватает монет! ");
            }
        } else {
            System.out.println("Персонажа нет на поле боя!");
        }
    }

    public void buy(Armor item) {
        if (flag) {
            if (money >= item.price) {
                armor += item.armor;
                money -= item.price;
                System.out.println("Персонаж " + name + " купил " + item.name + "! Броня увеличена на " + item.armor + "!");
            }else {
                System.out.println("Не хватает монет! ");
            }
        } else {
            System.out.println("Персонажа нет на поле боя!");
        }
    }

    public String startGame() {
        flag = true;
        String res =(name + " на поле боя!");
        return res;

    }

    public void endGame() {
        flag = false;
        System.out.println(name + " покинул поле боя!");

    }


    public void attack(Heroes target) {
        if (flag) {
            if (target.flag) {
                if (power >= target.armor) {
                    target.hp -= attack;
                    money += attack / 2;
                    System.out.println(name + " атакует " + target.name + " с уроном " + attack + "!");
                    if (target.hp <= 0) {
                        System.out.println(target.name + " умер!");
                        target.flag = false;
                    } else {
                        System.out.println("У " + target.name + " осталось " + target.hp + " здоровья!");
                    }
                } else {
                    System.out.println("У " + name + " не хватает мощи, чтобы нанести урон " + target.name);
                }
            } else {
                System.out.println(target.name + " не находится в бою!");
            }
        } else {
            System.out.println("Персонажа " + name + " нет на поле боя!");
        }
    }


    public void loot(Heroes target) {
        if (target.hp <= 0 | (target.hp >= 0 && !target.flag)) {
            if (target.power > 0) {
                power += target.power;
                System.out.println(name + " залутал " + target.name + ". Броня увеличилась на " + target.power + "!");
            } else {
                System.out.println("Нечего лутать у " + target.name);
            }
        } else {
            System.out.println("Успокой свой пыл! Ты не можешь лутать живого противника!");
        }

    }

    public void info() {
        System.out.println("Информация о персонаже " + name + ": HP:" + hp + " attack: " + attack + " armor: " + armor + " power: " + power + " flag: " + flag + " weight: " + weight + " money:" + money);
    }

    public static void main(String[] args) {

    }
}
