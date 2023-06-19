import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.MountainBike;
import vehicles.RoadCycle;

public class Inheritance {
    public static void main(String[] args) {
        try {

            // Object 확인
            // ObjectInheritances objecInheritances = new ObjectInheritances();

            // 상속할 class 생성
            // Bicycle bicycle = new Bicycle(5500, "blue");
            // System.out.println(bicycle.toString());

            // 상속을 활용
            // // MountainBike mountainBike = new MountainBike();
            // MountainBike mountainBike = new MountainBike(6200, "yellow", 5);
            // System.out.println();

            RoadCycle roadCycle = new RoadCycle(6200, "red","삼천리자전거" );
            System.out.println(roadCycle.toString());

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

}
