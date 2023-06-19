import java.util.HashMap;
import java.util.Map;

import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.Bike;
import vehicles.MountainBike;
import vehicles.RoadCycle;
import vehicles.Scooter;
import vehicles.Vehicle;
import vehicles.Car;
import java.util.HashMap;
import java.util.Map;

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
            // MountainBike mountainBike = new MountainBike(6200,"yellow",5);
            // System.out.println();

            // RoadCycle roadCycle = new RoadCycle(6200, "red","삼천리자전거" );
            // System.out.println(roadCycle.toString());
            // 구현호출
            // Car car = new Car();

            // int speed = car.speedUp(1);
            // speed = car.speedDown(2);
            // Vehicle bike = new Bike();
            // Vehicle car_second = new Car();

            //Abstract확인
            Scooter scooter = new Scooter();

            System.out.println();

            Map<String, String> hashmap = new HashMap();
            // 명령어instanceof 해당 변수가 어떤것의 class의 인스턴스 값인지 확인해줄때 사용
        } catch (Exception e) {
            System.out.println(e.getMessage());
           
        }
        System.out.println();
    }
}
