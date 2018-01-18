package Monster;

/**
 * Created by auk on 04.05.17.
 */
public class _07_Monster {

    public final String TOMBSTONE = "Here lies a dead monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;

    public String name = "Big _07_Monster";

    public int getAttack(){
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int decreasehealth) {
        health = health - decreasehealth;
        if(health <= 0){
            alive = false;
        }
    }

    //"Double loading" - two setters, one for int and one for double
    public void setHealth(double decreasehealth) {
        int intDecreaseHealth = (int) decreasehealth;
        health = health - intDecreaseHealth;
        if(health <= 0){
            alive = false;
        }
    }

    public _07_Monster(int newHealth, int newAttack, int newMovement){
        health = newHealth;
        attack = newAttack;
        movement = newMovement;
    }

    //Default constructor, exists anyway
    public _07_Monster(){

    }

    public _07_Monster(int newHealth){
        health = newHealth;
    }

    public _07_Monster(int newhealth, int newAttack){
        this(newhealth); //This calls the constructor up above(^!^)
        attack = newAttack;
    }


}
