package enemies;

public class Bigfoot extends Enemy{

    private String peltColour;
    private int numberOfTeeth;

    public Bigfoot(String name, String race, int healthPoints, String peltColour, int numberOfTeeth) {
        super(name, race, healthPoints);
        this.peltColour = peltColour;
        this.numberOfTeeth = numberOfTeeth;
    }

    public String getPeltColour() {
        return peltColour;
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void eatPineNutsForHealth(int pineNuts){
        this.increaseHealth(pineNuts);
    }
}
