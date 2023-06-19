package animals;

public class HorseAnimalExtend extends HorseAnimalImpl{
    int forth = 0;

    public HorseAnimalExtend() {
    }

    public int HorseAnimalExtend(int speed) {

        this.forth = speed;
        return this.forth;
    }

    public String getSpeed() {
        String gather = "legs : " + this.first + ", arms : "+this.second+", speech : "+ this.third +", speed : "
                + this.forth + "km";
        return gather;
    }

    
}
