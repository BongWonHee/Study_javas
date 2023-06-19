package vehicles;

public class MountainBike extends Bicycle {

    // Bicycle클래스의 상속을 받아 가격, 컬러에 높이 추가할것.
    // 기존에 있는 Bicycle클래스의 method을 상속받음 (클래스 Bicycle은 최상위자 클래스 Object를 상속받고있음)
    int seatHeight;


    public MountainBike() {

    }


    public MountainBike(int price, String color, int seatHeight) {
        this.seatHeight = seatHeight;
        super.price = price;
        super.color = color;

    }
    public String toString(){
        String str = "Height : "+this.seatHeight+", price :"+ super.price + ", color :"+ super.color;
        return str;

    } 

}
