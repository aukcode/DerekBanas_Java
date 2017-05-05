package Lessons;

import java.util.Scanner;

/**
 * Created by auk on 03.05.17.
 */
public class JavaLessonFive {

    static double myPI = 3.14159; //Class variable

    static Scanner userInput = new Scanner(System.in);
    private static int randomNumber;

    public static void main(String[] args) {

        addThem(1,2);

        System.out.println(myPI);

    }

    public static int addThem(int a, int b){

        double smallPI = 3.140; //Local variable

        double myPI = 3.0;

        //myPI = myPI + 3; //This one will change the global one

        System.out.println("Global " + myPI);

        return 1;
    }

    public static int getRandomNum(){

        randomNumber = (int) (Math.random() * 51);
        return randomNumber;
    }

}
