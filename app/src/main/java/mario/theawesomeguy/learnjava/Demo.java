package mario.theawesomeguy.learnjava;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        Player tim = new Player();
        Loot loot;
        tim.setLives(1);
        tim.setNameAndLevel("Mario",5);
        System.out.println(tim.getHandleName());
        System.out.println("Level: "+tim.getLevel());
        System.out.println("Lives: "+tim.getLives());
//        tim.getWeapon().getname();


        Weapon axe = new Weapon("Goldshine Axe",20,10);
        tim.setWeapon(axe);

        loot = new Loot("Heal Potion", LootType.RING,1);
        tim.pickUpLoot(loot);

        ArrayList<Loot> allItems = tim.getInventory();
        System.out.println("Inventory Items: ");
        for(Loot item : allItems){
            System.out.print("- "+item.getName());
        }
        System.out.println("\n");
        System.out.println(tim.getWeapon().getname());

    }
}
