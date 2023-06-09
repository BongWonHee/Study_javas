//출처 https://www.w3schools.com/java/java_foreach_loop.asp

import java.util.ArrayList;
import java.util.HashMap;

public class LoopForEachs {
    public static void main(String[] args) {

        // for (type variableName : arrayName) {
        // // code block to be executed
        // }

        try {
            ArrayList<String> cars = new ArrayList<String>();

            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");

            for (String car : cars) {
            System.out.println(car);
            }
            // Car_Company, Car_Model, Year, Features
            ArrayList<HashMap> carList = new ArrayList<HashMap>();

            HashMap<String, String> carSpec = new HashMap<String, String>(); 
            carSpec.put("CarCompany", "BMW");
            carSpec.put("CarModel", "3Series");
            carSpec.put("Year", "2021");
            carList.add(carSpec);
            
            carSpec = new HashMap<String, String>(); //구분마다 추가 해줘야한다.
            carSpec.put("CarCompany", "Toyota");
            carSpec.put("CarModel", "Camry");
            carSpec.put("Year", "2022");
            carList.add(carSpec);
            
            carSpec = new HashMap<String, String>();
            carSpec.put("CarCompany", "Tesla");
            carSpec.put("CarModel", "ModelS");
            carSpec.put("Year", "2023");
            carList.add(carSpec);

            for(HashMap<String, String> car : carList){
                System.out.println( car.get("CarCompany") +  car.get("CarModel") + car.get("Year"));
                // car.get("CarModel");
                // car.get("Year");

            }

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // retrun 0 ;
    }

}
