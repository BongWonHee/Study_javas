package animals;

public class HumanAnimalImpl implements InterfaceAnimal {
int first = 0;
int second = 0;
String third = "";
    @Override
    public int setLegs(int foots) {
        this.first = foots;
        return this.first;
    }

    @Override
    public int setArms(int hands) {
        this.second = hands;
        return this.second;
    }

    @Override
    public String setEnableSpeech(String possible) {
        this.third= possible;
    return this.third;
    }
    
    // toString은 문장으로 나오니깐 return 값은 string
    public String toString (int foots, int hands, String possible)
    { String answer = "Legs : " + this.first + ", Arms : "+this.second+", Speech : "+ this.third;
    return answer;

    } 
}
