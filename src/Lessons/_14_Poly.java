package Lessons;

/**
 * Created by auk on 10.05.17.
 */
public class _14_Poly {
    //Polymorphism and inheritance

    public static void main(String[] args) {

        _14_Animals genereicAnimal = new _14_Animals();

        System.out.println(genereicAnimal.getName());
        System.out.println(genereicAnimal.favFood);

        _14_Cats morris = new _14_Cats("Morris", "Tuna", "Rubber Mouse");

        System.out.println(morris.getName());

        _14_Animals tabby = new _14_Cats("Tabby", "Salmon", "Ball");

        acceptAnimal(tabby);



    }

    public static void acceptAnimal(_14_Animals randAnimal){
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);

        //Polymorphism decides if an object is first an animal and then a cat
        //Then if a method in a subclass overwrites a superclass method
        //Java knows to pick the one from the sub class
        randAnimal.walkAround();


        //However it cannot on its own locate a field or a method that is
        //only defined in the sub class
        //System.out.println(randAnimal.favToy); - throws an error

        //You can however cast it into a temporary holding variable:
        _14_Cats tempCat = (_14_Cats) randAnimal;
        System.out.println(tempCat.favToy);

        System.out.println(((_14_Cats) randAnimal).favToy);

        if(randAnimal instanceof _14_Cats){
            System.out.println(randAnimal.getName() + " is a Cat");
        }
    }

}
