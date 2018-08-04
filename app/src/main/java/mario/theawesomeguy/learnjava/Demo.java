package mario.theawesomeguy.learnjava;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        Enemy enemy = new Enemy("Test Enemy",10,3);


        Troll uglyTroll = new Troll("Ugly Troll");

        System.out.println("Enemy: "+uglyTroll.getName());
        uglyTroll.takeDamage(30);


        Vampyre vlad = new Vampyre("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();



    }
}
