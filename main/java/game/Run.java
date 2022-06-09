package game;

import  org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Heroes heroes = context.getBean("HumanBean", Heroes.class);
        System.out.println(heroes.startGame());
    }

}
