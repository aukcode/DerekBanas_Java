package Lessons;

/**
 * Created by auk on 10.05.17.
 */
public class _14_Cats extends _14_Animals {

    public String favToy = "Yarn";

    public void playWith(){
        System.out.println("Yeah " + favToy);
    }

    @Override
    public void walkAround(){
        System.out.println(this.getName() + " stalks around");
    }

    public String getFavToy() {
        return favToy;
    }



    public _14_Cats(String name, String favFood, String favToy) {
        super(name, favFood);
        this.favToy = favToy;
    }


    public _14_Cats(){

    }
}
