package Lessons;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;


/**
 * Created by auk on 10.05.17.
 */
public class _11_ArrayLists {

    public static void main(String[] args) {

        ArrayList arrayListOne;

        arrayListOne = new ArrayList(); //Default size is ten

        ArrayList arrayListTwo = new ArrayList();

        ArrayList<String> names = new ArrayList<String>(); //Only accepts strings

        names.add("John smith");
        names.add("Mohamad Ali");
        names.add("Oliver Miller");

        names.add(2, "Jack Ryan");

        names.set(0, "John Adams");

        for(int i = 0; i <  names.size(); i++){
            System.out.println(names.get(i));
        }

        names.remove(3);

        System.out.println(names); //prints list within brackets

        for(String i : names) {
            System.out.println(i);
        }

        //Iterator. This is how it was done in the past
        Iterator indivItems = names.iterator();
        System.out.println(indivItems);
        while(indivItems.hasNext()){
            System.out.println(indivItems.next());
        }

        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);

        String paulYoung = "Paul Young";

        names.add(paulYoung);

        if(names.contains(paulYoung)){
            System.out.println("paul is here");
        }


        if(names.containsAll(nameCopy)){
            System.out.println("Everything in nameCopy is in names");
        }
        //Copied names to nameCopy
        //Added to names. Names has an extra value so it only works this way

        names.clear();

        if(names.isEmpty()){
            System.out.println("ArrayLlist is Empty");
        }


        //Turn array into arrayList
        Object[] moreNames = new Object[4];
        moreNames = nameCopy.toArray();

        System.out.println(Arrays.toString(moreNames));

    }
}
