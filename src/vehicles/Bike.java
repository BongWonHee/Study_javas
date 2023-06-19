package vehicles;

public class Bike implements Vehicle {
    int speed = 0;
    int increment = 5;

    @Override
    public int speedUp(int val) {
        this.speed = this.speed + increment;
        return this.speed;
    }

    @Override
    public int speedDown(int val) {
        this.speed = this.speed - increment;
        return this.speed;
    }

}
