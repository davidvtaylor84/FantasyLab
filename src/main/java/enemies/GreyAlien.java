package enemies;

import players.ITakeDamage;

public class GreyAlien extends Enemy{

    private String homeDimension;
    private int sponginess;
    ITakeDamage player;

    public GreyAlien(String name, String race, int healthPoints, int attackPower, String homeDimension, int sponginess) {
        super(name, race, healthPoints, attackPower);
        this.homeDimension = homeDimension;
        this.sponginess = sponginess;
    }

    public String getHomeDimension() {
        return homeDimension;
    }

    public int getSponginess() {
        return sponginess;
    }

    public void increaseSponginess(int sponginess){
        this.increaseHealth(30);
    }


}
