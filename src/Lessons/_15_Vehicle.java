package Lessons;

/**
 * Created by auk on 10.05.17.
 */
public class _15_Vehicle extends _15_Crashable implements _15_Drivable, Cloneable{

    int numOfWheels = 2;
    double theSpeed = 0;

    int carStrength = 0;


    //Following is from _15_Drivable (interface)
    @Override
    public int getWheel() {
        return this.numOfWheels;
    }

    @Override
    public void setWheels(int numWheels) {
        this.numOfWheels = numWheels;
    }

    @Override
    public double getSpeed() {
        return this.theSpeed;
    }

    @Override
    public void setSpeed(double speed) {
        this.theSpeed = speed;
    }

    public _15_Vehicle(int wheels, double speed){
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

    public _15_Vehicle(){

    }


    //Following is from _15_Crashable (abstract class)
    @Override
    public void setCarStrength(int carStrength) {
        this.carStrength = carStrength;
    }

    @Override
    public int getCarStrength() {
        return this.carStrength;
    }

    public String toString(){
        return "Num of Wheels: " + numOfWheels;
    }

    //Have to catch the "clone not supported exception"
    public Object clone(){
        _15_Vehicle car;

        try{
            car = (_15_Vehicle) super.clone();
        }catch(CloneNotSupportedException e){
            return null;
        }
        return car;
    }
}
