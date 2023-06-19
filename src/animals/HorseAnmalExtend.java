package animals;

public class HorseAnmalExtend extends HoresAnimallmpl {
    int speed = 15;

    public HorseAnmalExtend(){

    }

    public HorseAnmalExtend(int setLegs, int setArms, String setEnbleSpeech, int speed){
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
