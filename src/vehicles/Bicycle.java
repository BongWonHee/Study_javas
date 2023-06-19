package vehicles;

import java.util.HashMap;

public class Bicycle {
    int price;


    String color;

    HashMap<String, Object> spec;

    // 생성자
    public Bicycle() {
        System.out.println("Bicycle - param empty");
    }

    // 내부 함수를 가진 생성자
    public Bicycle(int price, String color) {

        this.price = price;
        this.color = color;
    }


    public String toString(){
        String str = "price :"+ this.price + ", color :"+ this.color;
        return str;
    } 
    // this 2개를 같이 출력하게끔. 

}
