package mario.theawesomeguy.learnjava;

public class Enemy {

    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage){
        int remainingHitPoints = this.hitPoints - damage;
        System.out.print(this.getName()+" took "+ damage + " damage!");
        if(remainingHitPoints>0){
            setHitPoints(remainingHitPoints);
            System.out.println("He still has "+this.hitPoints+" left");
        }else{
            this.lives = this.lives-1;
            if(lives >0){
                this.lives = this.lives-1;
                System.out.println(" I have lost a live");
            }else{
//                System.out.println();
                System.out.println("\n"+this.getName()+" is Dead!!");

            }

        }
    }
    public void showInfo(){
        System.out.println("Name: "+ this.name+", HitPoints: "+this.hitPoints+", Lives: "+this.lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
