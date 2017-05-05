package Lessons;

/**
 * Created by auk on 03.05.17.
 */

import java.util.Scanner;

public class JavaLessonFour {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        int i = 1;

        while(i <= 20){
            if(i == 3){
                i+=2;
                continue; //Jumps out and starts from top again
            }
            System.out.println(i);
            i++;

            if((i % 2) == 0){
                i++;
            }

            if(i > 10){
                break;
            }
        }


        double myPi = 4.0;

        double j = 3.0;

        //4 - 4/3 - 4/5 - 4/7 - ... - 4/n

        while(j < 8001){
            myPi = myPi - (4/j) + (4/(j+2));
            j += 4;
            System.out.println(myPi);
        }

        System.out.println("Value of PI : " + Math.PI);


        String contYorN = "Y";

        int h = 1;

        while(contYorN.equalsIgnoreCase("y")){
            System.out.println(h);
            System.out.print("Continue y or n? ");
            contYorN = userInput.nextLine();
            h++;
        }


        int k = 10;

        //do while excutes at least once
        do{
            System.out.println(k);
            k++;
        }while(k < 10);

        for(int l = 10; l >= 1; l--){
            System.out.println(l);
        }
    }
}
