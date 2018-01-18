package Lessons;

/**
 * Created by auk on 10.05.17.
 */
public abstract class _15_Crashable {

    boolean carDrivable = true;

    public void youCrashed(){
        this.carDrivable = false;
    }

    public abstract void setCarStrength(int carStrenght);

    public abstract int getCarStrength();

}
