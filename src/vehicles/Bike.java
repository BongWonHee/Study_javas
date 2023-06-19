package vehicles;

public class Bike implements Vehicle{
int speed = 0;
int increment = 5;

    @Override
    public int SpeedUp(int val) {
        // TODO Auto-generated method stub
        this.speed = this.speed + this.increment;
    return this.speed;
    }

    @Override
    public int SpeedDown(int val) {
        // TODO Auto-generated method stub
        this.speed = this.speed - this.increment;
    return this.speed;
    }
    
}
