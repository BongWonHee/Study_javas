package animals;

public class HumanAnimallmpl implements InterfaceAnimal {
    int setLegs = 2;
    int setArms = 2;
    String setEnbleSpeech = "Yes" ;
    
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