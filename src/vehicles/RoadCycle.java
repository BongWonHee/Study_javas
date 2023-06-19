package vehicles;

public class RoadCycle extends Bicycle{
    String name ;
    
    public RoadCycle(){

    }
    public RoadCycle(int price, String color, String name){
        super.price = price;
        super.color = color;
        this. name = name ; //제품명 변수
    }
    public String toString(){
        String srt = " price : "+ super.price +", color : " +super.color + ", 제품명 : " + this.name;
        return srt ;
    }
}
