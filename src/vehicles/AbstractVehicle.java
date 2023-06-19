package vehicles;

abstract class AbstractVehicle {
    int speed = 0;
    int increment = 5;
    
    public int SpeedUP(int val);
//구체화 미완성
    public int SpeedDown(int val) {
        this.speed = this.speed - this.increment;
        return this.speed;
        //구체화 완성

    }
    // abstract 이 아니라 public으로 썼을때는 abstract interface의 기능이 이뤄지지 않기에 
    // SpeedUP의 구체화 미완성이 되었음을 이용하지 못함. 



}
