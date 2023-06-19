package vehicles;

public class Car implements Vehicle {

    int speed = 0;
    int increment = 20;

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
// int speed = 0 ; 
//     // instance값이 0으로 초기화됨. 
//     int increment = 20;
//     // implements 할 때, 자동으로 나오는 
//     //TODO blabal, throw new blabla
//     // 이 두개의 문장을 삭제하고 실제로 구체화 시켜준다. 
//     // 여기선 speed가 20씩 증가, 20씩 감소

//     @Override
//     public int SpeedUp(int val) {
//     // TODO Auto-generated method stub
//     // throw new UnsupportedOperationException("Unimplemented method 'SpeedUp'");
//      this.speed = this.speed + this.increment;
//     return this.speed;
// };

//     @Override
//     public int SpeedDown(int x) {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'SpeedDown'");
//     this.speed = this.speed - this.increment;
//     return this.speed;
//     }
//     // interface(대략, rough)를 구체화 시키고자 함.
//     // 상속이 아니라서 implements를 써야함.
//     // 각각 구현시켜줘야함.
