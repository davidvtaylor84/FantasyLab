package enemies;

import players.ITakeDamage;
import players.fighters.IAttack;

public class MothMan extends Enemy{

    public String musicalInstrument;
    public String prophecy;
    ITakeDamage player;


    public MothMan(String name, String race, int healthPoints, int attackPower, String musicalInstrument, String prophecy) {
        super(name, race, healthPoints, attackPower);
        this.musicalInstrument = musicalInstrument;
        this.prophecy = prophecy;
    }

    public String getMusicalInstrument() {
        return musicalInstrument;
    }

    public String getProphecy() {
        return prophecy;
    }

    public void makeProphecy(ITakeDamage player){
        System.out.println(this.prophecy);
        this.increaseHealth(20);
        player.takeDamage(50);
    }

}
