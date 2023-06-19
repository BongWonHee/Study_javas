package animals;

public class HumanAnimalExtend extends HumanAnimalImpl {
    int forth = 0;

    public HumanAnimalExtend() {
    }

    public int HumanAnimalExtend(int speed) {

        this.forth = speed;
        return this.forth;
    }

    public String getSpeed() {
        String gather = "Legs : " + super.first + ", Arms : " + super.second + ", Speech : " + super.third
                + ", Speed : "
                + this.forth + "Km";
        return gather;
    }

}
