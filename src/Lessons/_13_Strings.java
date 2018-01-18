package Lessons;

import java.util.Arrays;

/**
 * Created by auk on 10.05.17.
 */
public class _13_Strings {

    public static void main(String[] args) {

        String randomString = "I'm just a random sting";

        String gotToWuote = "He said , \"I'm here\"";

        //"You have to backslash the backslash, otherwise it would get confused"

        System.out.println(randomString + " " + gotToWuote);

        String uppercaseStr = "BIG";
        String lowercaseStr = "big";

        if(uppercaseStr.equals(lowercaseStr)){
            System.out.println("They are equal"); //will not print
        }
        if(uppercaseStr.equalsIgnoreCase(lowercaseStr)){
            System.out.println("They are equal"); //will print
        }

        String letters = "abcde";
        String moreLetters = "fasdagsg";

        System.out.println("2nd char: " + letters.charAt(1));

        //if equal then 0. compering with respect to alphabet:
        System.out.println(letters.compareTo(moreLetters));

        System.out.println(letters.contains("abc"));
        System.out.println(letters.endsWith("de")); // /startsWith / indexOf

        System.out.println("Lenght: " + letters.length());

        System.out.println(letters.replace("abc", "cdr"));

        String[] letterArray = letters.split(", "); //regex: how do you want to split?

        System.out.println(Arrays.toString(letterArray));

        char[]  charArray = letters.toCharArray();
        System.out.println(Arrays.toString(charArray));

        System.out.println(letters.substring(1,4));
        System.out.println(letters.toUpperCase()); // /toLowerCase

        //Delete whitespace at beginning and end:
        String randString = "            whitespacestring           ";
        System.out.println(randString.trim());

        //A string is a immutable. When you change it is not deleted but a new version
        //is created on every edit. One should therefore use a StringBuilder when
        //a lot of iterations can be predicted on the String

        //StringBuilder, in contrast, gets a block of memory and reuses it every time
        //there is an edit
        StringBuilder randSB = new StringBuilder("A random value");

        System.out.println(randSB.append(" again")); //This actually makes the change:
        System.out.println(randSB); //again will be part of this too

        System.out.println(randSB.delete(15,21)); //will delete "again"
        System.out.println(randSB.capacity()); //How much space is allocated in memory

        randSB.ensureCapacity(60); //Allocates a minimum capacity of memory

        System.out.println(randSB.length());
        randSB.trimToSize(); //trims capacity to actual size

        System.out.println(randSB.insert(1, "nother"));

        String oldSB = randSB.toString();

        //All work:
        //charAt()
        //indexOf()
        //lastIndexOf()
        //subString()




    }
}
