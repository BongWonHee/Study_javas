package animals;


public class HumanAnimalExtend extends HumanAnimallmpl{
    int speed = 3;

    public HumanAnimalExtend(){

    }

    public HumanAnimalExtend(int setLegs, int setArms, String setEnbleSpeech, int speed){
        this.setLegs = setLegs;
        this.setArms = setArms;
        this.setEnbleSpeech = setEnbleSpeech;
        this.speed = speed;

    }

    public String getSpeed() {
        String str = "legs : " + this.setLegs + ", arms : " + this.setArms + ", speech : " + this.setEnbleSpeech
                + ", speed : "
                + this.speed + "km";
        return str;
    }
    }
    // public class HumanAnimalExtend extends HumanAnimalImpl {
    // int forth = 0;

    // public HumanAnimalExtend() {
    // }

    // public int HumanAnimalExtend(int speed) {

    //     this.forth = speed;
    //     return this.forth;
    // }

    // public String getSpeed() {
    //     String gather = "Legs : " + super.first + ", Arms : " + super.second + ", Speech : " + super.third
    //             + ", Speed : "
    //             + this.forth + "Km";
    //     return gather;
    // }

