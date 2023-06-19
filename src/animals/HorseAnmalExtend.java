package animals;

public class HorseAnmalExtend implements InterfaceAnimal{
     int setLegs = 4;
    int setArms = 0;
    String setEnbleSpeech = "No";
    int speed = 12;

    @Override
    public int setLegs(int val) {
        this.setLegs = this.setLegs;
        return setLegs;
    }

    @Override
    public int setArms(int val) {
        this.setArms = this.setArms;
        return setArms;

    }

    @Override
    public String setEnbleSpeech(String val) {
        this.setEnbleSpeech = this.setEnbleSpeech;
        return setEnbleSpeech;

    }

    @Override
    public int speed(int val) {
        this.speed = this.speed;
        return speed;

    }


    public String getSpeed(){
        String inter = " arms : " + setArms + " Legs : " + setLegs + " speech : " + setEnbleSpeech + " Speed : " + speed + "Km";
        return inter;
    }
}
