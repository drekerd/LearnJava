package mario.theawesomeguy.learnjava;

public class Demo {

    public static void main(String[] args) {
        Player tim = new Player();

        tim.setLives(1);
        tim.setNameAndLevel("Mo",5);
        System.out.println(tim.getHandleName());
        System.out.println("Level: "+tim.getLevel());
        System.out.println("Lives: "+tim.getLives());
        tim.getWeapon().getname();


        Weapon axe = new Weapon("Gold Axe",20,10);
        tim.setWeapon(axe);

        System.out.println(tim.getWeapon().getname());

    }
}
