package Lessons;

/**
 * Created by auk on 10.05.17.
 */
public class _14_Animals {

    private String name = "Animal";
    public String favFood = "Food";

    protected final void changeName(String newName){
        this.name = newName;
    }

    protected final String getName(){
        return this.name;
    }

    public void eatStuff(){
        System.out.println("Yum " + favFood);
    }

    public void walkAround(){
        System.out.println(this.name + " walks around");
    }

    public _14_Animals(String name, String favFood){
        this.changeName(name);
        this.favFood = favFood;
    }

    public _14_Animals() {
    }
}
