package vehicles;


public class Scooter extends AbstractVehicle {
    @Override
    public int SpeedUP(int val){
     this.speed = this.speed + this.increment;
        return this.speed;
    }

}
