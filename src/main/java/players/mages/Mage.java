package players.mages;

import players.Player;

import java.util.HashMap;

public abstract class Mage extends Player {

    private String schoolOfMagic;
    private String castingImplement;
    private int manaLevel;
//    HashMap<String, ISpell> spells;
//    HashMap<String IDefend> familiars;

    public Mage(String name, int healthPoints, String schoolOfMagic, String castingImplement, int manaLevel) {
        super(name, healthPoints);
        this.schoolOfMagic = schoolOfMagic;
        this.castingImplement = castingImplement;
        this.manaLevel = manaLevel;
//        this.spells = new HashMap<>();
//        this.familiars = new HashMap<>();
    }

    public String getSchoolOfMagic() {
        return schoolOfMagic;
    }

    public String getCastingImplement() {
        return castingImplement;
    }

    public int getManaLevel() {
        return manaLevel;
    }
}
