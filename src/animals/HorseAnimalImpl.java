package animals;

public class HorseAnimalImpl implements InterfaceAnimal {
int first = 0;
int second = 0;
String third = "";

    @Override
    public int setLegs(int leg) {
        this.first=leg;
        return this.first;
    }

    @Override
    public int setArms(int arm) {
        this.second = arm;
        return this.second;
    }

    @Override
    public String setEnableSpeech(String speech) {
        this.third = speech;
        return this.third;
    }
    public String toString ()
    { String answer = "legs : " + this.first + ", arms : "+this.second+", speech : "+ this.third;
    return answer;

    } 
}
