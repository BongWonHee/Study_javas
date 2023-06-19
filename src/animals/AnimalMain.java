package animals;

public class AnimalMain {
    public static void main(String[] args) {
        try {
            HoresAnimallmpl horesAnimallmpl = new HoresAnimallmpl();
            HumanAnimallmpl humanAnimallmpl = new HumanAnimallmpl();
            HorseAnmalExtend horseAnmalExtend = new HorseAnmalExtend();
            HumanAnimalExtend humanAnimalExtend = new HumanAnimalExtend();

            System.out.println(horesAnimallmpl.toString()); // horse 의 arms, legs, speech 출력
            System.out.println(humanAnimallmpl.toString()); // human 의 arms, legs, speech 출력
            System.out.println(horseAnmalExtend.getSpeed()); // horse 의 arms, legs, speech , 속도 출력
            System.out.println(humanAnimalExtend.getSpeed()); // human 의 arms, legs, speech 출력
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
