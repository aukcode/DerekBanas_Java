package Lessons;
import java.util.Arrays;
/**
 * Created by auk on 08.05.17.
 */
public class _09_Arrays {

    public static void main(String[] args) {

        //An array has a fixed size, once declared it cannot change
        //Arrays are objects

        int[] randomArray;

        int[] numberArray = new int[10]; //How to initiate an array

        randomArray = new int[20];
        randomArray[1] = 2;

        String[] stringArray = {"just", "random", "words"}; //Says there will forever be three items in this array

        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = i;
        }


        int k = 1;
        while(k <= 41){
            System.out.print('-');
            k++;
        }
        System.out.println();
        for (int j = 0; j < numberArray.length; j++) {
            System.out.print("| " + j + " ");
        }
        System.out.println("|");


        String[][] multiArray = new String[10][10];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = i + " " + j;
            }
        }


        k = 1;
        while(k <= 61){
            System.out.print('-');
            k++;
        }
        System.out.println();
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println("|");
        }
        k = 1;
        while(k <= 61){
            System.out.print('-');
            k++;
        }
        System.out.println("\n");

        //Copy of of another array:
        int[] numberCopy = Arrays.copyOf(numberArray, 6);
        int[] numberCopyRange = Arrays.copyOfRange(numberArray, 1, 6);

        System.out.println(Arrays.toString(numberCopy));

        int[] moreNumbers = new int[100];
        Arrays.fill(moreNumbers, 2);

        char[][] boardGame = new char[10][10];
        for(char[] row : boardGame){
            Arrays.fill(row,'*');
        }

        int[] numToSort = new int[10];


        //Array full of random numbers:
        for(int i = 0; i < 10; i++){
            numToSort[i] = (int) (Math.random() * 100);
        }

        //Sort arrays:
        Arrays.sort(numToSort);
        System.out.println(Arrays.toString(numToSort));

        //find a key:
        int whereIs50 = Arrays.binarySearch(numToSort, 50);
        System.out.println(whereIs50);

    }

}
