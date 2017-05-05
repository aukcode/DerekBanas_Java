package Lessons;

/**
 * Created by auk on 03.05.17.
 */
public class JavaLessonThree {

    public static void main(String[] args){

        int randomNumber = (int) (Math.random() * 50); //0-->49

        if(randomNumber < 25){
            System.out.println("The random number is less than 25");
        }else if(randomNumber > 40){
            System.out.println("The random number is greater than 40");
        }

        System.out.println("The random number is : " + randomNumber);

        int valueOne = 1;
        int valueTwo = 2;

        //if condition is true, assign first, if not assign second
        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
        System.out.println(biggestValue);

        char theGrade = 'b';

        switch (theGrade){
            case 'A':
                System.out.println("Great job");
                break; //Stop checking switch and jump out to under the switch
            case 'b': //This is how to catch multiples
            case 'B':
                System.out.println("Good job");
                break;
            case 'C':
                System.out.println("OK");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Default triggered");
        }
    }

}
