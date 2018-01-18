package Lessons;

/**
 * Created by auk on 10.05.17.
 */
public class _15_Interfaces {
    //Interfaces and abstract classes

    public static void main(String[] args) {

        _15_Vehicle car = new _15_Vehicle(4,100.00);

        System.out.println("Cars Max Speed " + car.getSpeed());
        System.out.println("Num of Wheels " + car.getWheel());

        car.setCarStrength(10);
        System.out.println("Strength: " + car.getCarStrength());

    }

}
