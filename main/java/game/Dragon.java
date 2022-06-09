package game;

public class Dragon extends Heroes{

    public int flySpeed;
    public Dragon(String name, int hp, int attack, int armor, int power, int weight, boolean flag, int flySpeed) {
        super(name, hp, attack, armor, power, weight, flag);
        this.flySpeed = flySpeed;
    }

    public String startGame() {
        flag = true;
        String res =(name+" на поле боя!");
        return res;
    }

    public void endGame() {
        flag=false;
        System.out.println(name+" покинул поле боя!");

    }

    public void attack(Heroes target){
        if(flag){
            if (target.flag){
                if (power >= target.armor){
                    target.hp-=attack;
                    System.out.println(name+" атакует "+target.name+" с уроном "+attack+"!");
                    if (target.hp<=0){
                        System.out.println(target.name+" умер!");
                        target.flag=false;
                    }else {
                        System.out.println("У "+target.name+" осталось "+target.hp+" здоровья!");
                    }
                }else {
                    System.out.println("У "+name+" не хватает мощи, чтобы нанести урон "+target.name);
                }
            }else {
                System.out.println(target.name+" не находится в бою!");
            }
        }else {
            System.out.println("Персонажа "+name+" нет на поле боя!");
        }
    }

    public void loot(Heroes target) {
        if (target.hp<=0 | (target.hp >= 0 && !target.flag)){
            if (target.power>0){
                power+= target.power;
                System.out.println(name+" залутал "+target.name+". Броня увеличилась на " + target.power+"!");
            }else {
                System.out.println("Нечего лутать у "+target.name);
            }
        }else {
            System.out.println("Успокой свой пыл! Ты не можешь лутать живого противника!");
        }
    }

    public void info(){
        System.out.println("Информация по персонаже "+name+": HP:"+ hp+" attack: "+ attack+" armor: "+ armor+" power: "+ power+" flag: "+ flag+ " weight: "+ weight);
    }

}