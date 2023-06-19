import java.util.HashMap;
import java.util.Map;

import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.Bike;
import vehicles.Car;
import vehicles.MountainBike;
import vehicles.RoadCycle;
import vehicles.Scooter;
import vehicles.Vehicle;

public class Inheritances {
    public static void main(String[] args) {
        try {
            // ObjectInheritances objectInheritances = new ObjectInheritances();
            // System.out.println();
            // // 상속 확인 중_class확인: 항상 Objec클랙스에 상속받아져있음
            // 상속 할 Class 생성_class Bicycle
            // Bicycle bicycle = new Bicycle(5500,"blue");
            // System.out.println(bicycle.toString());

            // 상속해서 활용_class MountainBike
            // MountainBike mountainBike = new MountainBike();
            MountainBike mountainBike = new MountainBike(6200,"yellow",5);
            // System.out.println();

            RoadCycle roadCycle = new RoadCycle(6200, "red","삼천리자전거" );
            System.out.println(roadCycle.toString());
            // interface Vehicle를 Car클래스로 구체화 시키고 호출하기
            // Car car = new Car();
            // int speed = car.SpeedUp(10);
            // speed = car.SpeedDown(20);
            // System.out.println();

            // Bike
            // Vehicle bike = new Bike();
            // vehicle에 구현되지 않는 interface method 있음.
            // 이 method에 대한 부분을 Bike class를 통해서 구체화함.
            // Vehicle bike 이 bike는 결국 Bike에서 온것.
            // Vehicle car_second = new Car();
            // Map<String, String> hashMap = new HashMap<>();

            //Abstraction 확인_Scooter
            Scooter scooter = new Scooter();
            
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
        System.out.println();
    }
}
