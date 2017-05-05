package Lessons;

/**
 * Created by auk on 03.05.17.
 */

import java.util.Scanner;

public class JavaLessonTwo {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Your favorite number: ");

        if(userInput.hasNextInt()){ //Will also work with other primitives

            int numberEntered = userInput.nextInt(); //nexLine for String

            System.out.println("You entered " + numberEntered);
            int numEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);

            int numEnteredMinus2 = numberEntered - 2;

            System.out.println(numberEntered + " - 2 " + " = " + numEnteredMinus2);

            int numEnteredTimesSelf = numberEntered * numberEntered;

            System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);

            double numEnteredDivide2 = (double)numberEntered / 2;
            System.out.println(numberEntered + " / 2 " + " = " + numEnteredDivide2);

            int numEnteredRemainder = numberEntered % 2;
            System.out.println(numberEntered + " % 2 " + " = " + numEnteredRemainder);

            int numberABS = Math.abs(numberEntered); //Absolute value
            int whitchIsIsBigger = Math.max(5,7); // 7
            int whitchIsIsSmaller = Math.min(5,7); // 5

            double numSqrt = Math.sqrt(5.23); //Only works with double

            int numCeiling = (int) Math.ceil(5.23); //Rounds up 6
            int numFloor = (int) Math.floor(5.23); //Rounds down to 5
            int numRound = (int) Math.round(5.23); //Rounds by rounding rule --> 5

            //Only Math.random goes from 0 to 0.99999
            int randomNumber = (int) (Math.random() *11); //From 0 to 10
            System.out.println("Random number : " + randomNumber);



        }else{
            System.out.println("You have to enter an integer");
        }

    }

}
