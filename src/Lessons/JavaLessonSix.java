package Lessons;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

/**
 * Created by auk on 04.05.17.
 */

//Exceptions
// - ArithmeticException
// - ClassNotFoundException
// - IllegalArgumentException
// - IndexOutOfBoundsException
// - InputMismatchException
// - IOException

public class JavaLessonSix {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        //divideByZero(2);

        //System.out.print("How old are you?");
        //int age = checkValidAge();
        //if(age != 0){
        //    System.out.println("You are " + age + " years old");
        //}

        getAFile("./somestuff.txt");

    }

    public static void getAFile(String fileName){

        try{
            FileInputStream file = new FileInputStream(fileName);
        }
        //Most specific first
        catch(FileNotFoundException e){
            System.out.println("Sorry cant find taht file");
        }
        //Less specific in order by falling specificity
        catch(IOException e){
            System.out.println("Unknown IO Error");
        }
        //Catch all last
        catch(Exception e){
            System.out.println("Some error occurred");
        }
        //finally is always called. It is for clean up duty like closing files and
        //shutting down database connections
        finally{
            System.out.println("");
        }
    }

    public static int checkValidAge(){
        try{
            return userInput.nextInt();
        }catch(InputMismatchException e){
            userInput.next();
            System.out.println("That isn't a whole number");
            return 0;
        }
    }

    private static void divideByZero(int i) {

        try{
            System.out.println(i/0);
        }catch(ArithmeticException e){
            System.out.println("You can't do that");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace(); //The red message that is normally shown without catch
        }
    }


}
