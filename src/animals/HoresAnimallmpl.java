package animals;

public class HoresAnimallmpl implements InterfaceAnimal {
    int setLegs = 4;
    int setArms = 0;
    String setEnbleSpeech = "NO" ;
    

    @Override
    public int setLegs(int val) {
        this.setLegs = setLegs;
        return this.setLegs;
    }

    @Override
    public int setArms(int val) {
        this.setArms = setArms;
        return this.setArms;

    }

    @Override
    public String setEnbleSpeech(String val) {
        this.setEnbleSpeech = setEnbleSpeech;
        return this.setEnbleSpeech;

    }

   
    

    public String toString() {
        String str = " arms : " + this.setArms + " Legs : " + this.setLegs + " speech : " + this.setEnbleSpeech;
        return str;
    }

   
}
