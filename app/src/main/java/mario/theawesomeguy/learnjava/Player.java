package mario.theawesomeguy.learnjava;

public class Player {

    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;

    public Player() {
        this("Unkown Player");

    }
    public Player(String handleName){
        this(handleName,1);

    }
    public Player(String handleName, int level){
        setHandleName(handleName);
        setLives(3);
        setLevel(level);
        setScore(0);
        setDefaultWeapon(); //creates weapon

    }


    private void setDefaultWeapon(){
        this.weapon = new Weapon("Mace",10,10);
    }

    public void setNameAndLevel(String name, int level){
        setHandleName(name);
        setLevel(level);
    }

    public String getHandleName() {
        return this.handleName;
    }

    public void setHandleName(String handleName) {
        boolean isNameCorrect = (handleName.length() < 4);
        if (isNameCorrect)
        {
            System.out.println("The name " + handleName +" must be more than 4 characters");
            return;
        }
        this.handleName = handleName;

    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
