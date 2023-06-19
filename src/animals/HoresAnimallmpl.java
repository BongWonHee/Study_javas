package animals;

public class HoresAnimallmpl implements InterfaceAnimal {
    int setLegs = 4;
    int setArms = 0;
    String setEnbleSpeech = "NO" ;
    

    @Override
    public int setLegs(int val) {
        // this.setLegs = setLegs;
        return setLegs;
    }

    @Override
    public int setArms(int val) {
        // this.setArms = setArms;
        return setArms;

    }

    @Override
    public String setEnbleSpeech(String val) {
        // this.setEnbleSpeech = setEnbleSpeech;
        return setEnbleSpeech;

    }

   
    

    public String toString() {
        String str = " arms : " + setArms + " Legs : " + setLegs + " speech : " + setEnbleSpeech;
        return str;
    }

   
}
