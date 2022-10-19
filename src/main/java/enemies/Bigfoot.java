package enemies;

import players.ITakeDamage;

public class Bigfoot extends Enemy{

    private String peltColour;
    private int numberOfTeeth;
    ITakeDamage player;

    public Bigfoot(String name, String race, int healthPoints, int attackPower, String peltColour, int numberOfTeeth) {
        super(name, race, healthPoints, attackPower);
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
