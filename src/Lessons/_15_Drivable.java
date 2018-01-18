package Lessons;

/**
 * Created by auk on 10.05.17.
 */
public interface _15_Drivable {

    double PI = 3.14;

    //public abstract is the default, so
    //public abstract int getWheel();
    //is the same as:
    int getWheel();

    void setWheels(int numWheels);

    double getSpeed();

    void setSpeed(double speed);

}
