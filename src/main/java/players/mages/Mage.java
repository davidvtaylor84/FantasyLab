package players.mages;

import players.Player;

public abstract class Mage extends Player {

    private String schoolOfMagic;
    private String castingImplement;
    private int manaLevel;

    public Mage(String name, int healthPoints, String schoolOfMagic, String castingImplement, int manaLevel) {
        super(name, healthPoints);
        this.schoolOfMagic = schoolOfMagic;
        this.castingImplement = castingImplement;
        this.manaLevel = manaLevel;
    }
}
