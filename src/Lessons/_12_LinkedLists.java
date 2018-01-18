/*
package Lessons;
import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;

*/
/**
 * Created by auk on 10.05.17.
 *//*

public class _12_LinkedLists {

    public static void main(String[] args) {

        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();

        names.add("Ahmed Bennani");
        names.add("Ali Syed");

        names.addLast("Nathen Martin");
        names.addFirst("Joshua Smith");
        names.add(0, "Noah Peeters");
        names.set(2, "Paul Newman"); //Replace
        names.remove(4);
        names.remove("Joshua Smith");

        System.out.println("\nFirst Index: " + names.getFirst());
        System.out.println("\nSome Index: " + names.get(1));
        System.out.println("\nLast Index: " + names.getLast());

        LinkedList<String> nameCopy = new LinkedList<String>(names);
        System.out.println("\nnameCopy: " + nameCopy);

        if(names.contains("Noah Peeters")){
            System.out.println("\nNoah's here");
        }

        System.out.println("\nAli index at: " + names.indexOf("Ali Syed"));
        System.out.println("\nList Empty: " + names.isEmpty());
        System.out.println("\nHow many: " + names.size());

        System.out.println("\nLook without error: " + names.peek());

        System.out.println("\nRemove first element: " + nameCopy.poll());
        System.out.println("\nRemove last element: " + nameCopy.pollLast());




        for(String name : names){
            System.out.println(name);
        }

        //Sets into first index
        nameCopy.push("Noah Peeters");
        //Removes first index
        nameCopy.pop();

        System.out.println();
        for(String name : nameCopy){
            System.out.println(name);
        }


        Object[] nameArray = new Object[4];
        nameArray = names.toArray();

        System.out.println(Arrays.toString(nameArray));

        //Delete everything. Works both on LinkedLists and arrayLists
        names.clear();

    }
}
*/
