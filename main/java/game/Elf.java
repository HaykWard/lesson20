package game;

public class Elf extends Human{
    public Elf(String name, int hp, int attack, int armor, int power, int weight, boolean flag, int money) {
        super(name, hp, attack, armor, power, weight, flag, money);
    }

    public void hill(Heroes target, int howMany){
        if(flag){
            if (target.flag){
                target.hp+=howMany;
                System.out.println(name+" пополнил здоровье "+target.name+" на "+howMany+"!");
            }else {
                System.out.println("Перонаж "+target.name+" не находится на поле боя!");
            }
        } else {
            System.out.println("Перонаж "+name+" не находится на поле боя!");
        }
    }

}
