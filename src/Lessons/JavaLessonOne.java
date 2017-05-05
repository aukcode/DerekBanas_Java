package Lessons;

/**
 * Created by auk on 29.04.17.
 */
public class JavaLessonOne {

    static String randomString = "String to print";

    //Common practise: constants (final) should be all upper case
    static final double PINUM = 3.141429;

    public static void main(String[] args){

        System.out.println(PINUM);

        int integerOne = 22;

        //Java does not care about whitespace:
        int
                integerTwo
          =
                integerOne
                        +
           1
                ;

        //Primitive types:
        //They differ from each other by virtue of what values they can hold
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 210000000; //2.1 trillion ...
        long bigLong = 9220000000000000000L; //16 zeroes
        float bigFloat = 3.14F;
        double bigDouble = 3.1488234523458234584582; //Same as float, but more precise

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true; //or false

        char randomChar = 65; //This becomes 'A'
        int someNum = 'A'; //This becomes '65'
        char anotherChar = 'A';


        char escapeChars = '\\';

        String randomString = "I am a random string";
        String anotherString = "Stuff";

        String andanotherString = randomString + ' ' + anotherString;

        //Primitive to String: toString
        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String intString = Integer.toString(bigInt);
        String longString = Long.toString(bigLong);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOrFalse);

        System.out.println(byteString + shortString + intString + longString +
                        floatString + doubleString + booleanString);

        //Casting between primitives: cast
        double aDoubleValue = 3.14245234623;
        int doubleToInt = (int) aDoubleValue; //Information can be lost

        //String to primitive: parse
        int stringToInt = Integer.parseInt(intString);

    }



}
