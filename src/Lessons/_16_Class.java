package Lessons;

/**
 * Created by auk on 10.05.17.
 */
public class _16_Class {
    //Objects and classes
    //And cloning


    public static void main(String[] args) {

        //All objects of all classes inherits from an object class
        //"The superest of superclasses"

        Object superCar = new _15_Vehicle();
        Object suid = new Object();


        _15_Vehicle tempCar = (_15_Vehicle) superCar;
        //System.out.println(tempCar.getSpeed());
        System.out.println(((_15_Vehicle)superCar).getSpeed());

        _15_Vehicle superTruck = new _15_Vehicle();

        System.out.println(superCar.equals(superTruck));

        //Every object has a hashcode. This can be retrieved:
        System.out.println(superCar.hashCode());
        //And is not the same as just the object reference:
        System.out.println(superCar);

        //We can print the class of any object
        System.out.println(superCar.getClass());

        //Prints class name
        System.out.println(superCar.getClass().getName());

        //The class for superCar and superTruck are the same:
        if(superCar.getClass() == superTruck.getClass()){
            System.out.println("The same");
        }

        //We can get the superclass
        System.out.println(superCar.getClass().getSuperclass());


        System.out.println(superCar.toString());

        int randNum = 100;
        System.out.println(Integer.toString(randNum));



        //The clone method

        superTruck.setWheels(6);

        _15_Vehicle superTruck2 = (_15_Vehicle)superTruck.clone();

        System.out.println(superTruck.getWheel());
        System.out.println(superTruck2.getWheel());

        //To prove that they are different, we call hashcode on them:
        System.out.println(superTruck.hashCode());
        System.out.println(superTruck2.hashCode());

        //Clone does not copy "sub objects":
        // Object A
        //   sub object B


    }

}
