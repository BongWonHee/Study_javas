public class Arrays {
    public String[] intialArrays(){
        String[] carsType = { "Volvo", "BMW", "Ford", "Mazda", "KIA" };
        return carsType;
    }
    public static void main(String[] args) {
        Arrays arrays =  new Arrays();
        String[] cars = arrays.intialArrays();
        
        System.out.println(cars.length);
        for (int num = 0; num < cars.length; num = num + 1) {
            System.out.print(cars[num] + ", ");

            // String[][] numbers = {
            //         { "10", "20", "30", "40" },
            //         { "50", "60", "70" }
            // };
            // for(int num = 0; num < numbers.length; num = num + 1){
            // for(int num1 = 0 ; num1 < numbers[0].length; num1 = num1 + 1 ){
            // // System.out.print(numbers[0].length);
            // for(int num2 = 0; num2 < numbers[num1].length; num2 = num2 + 1 ){
            // System.out.println(numbers[num1][num2] + ", ");

            // }
            // System.out.println();

            // }
            // // System.out.print(numbers[]);
            // }

            // System.out.println();

            // return 0;
        }

    }
}