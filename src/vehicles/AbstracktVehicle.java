package vehicles;

abstract class AbstracktVehicle {
    int speed = 0;
    int increment = 5;

    public int speedUp(int val);

    public int speedDown(int val) {
        this.speed = this.speed - this.increment;
        return this.speed;
    }
}
