import enemies.Bigfoot;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Boxer;
import weapons.BareFists;

import static org.junit.Assert.assertEquals;

public class BigfootTest {

    Bigfoot bigfoot;
    Boxer boxer;
    BareFists bareFists;

    @Before
    public void before(){
        bigfoot = new Bigfoot("Mick", "Lesser Spotted Bigfoot", 80, 20,"Neon green spots", 800);
        boxer = new Boxer("Haymaker Sally", 160, "Queensberry Rules", "Baby lotion", 40, 5, "Lego", "Yeezys");
        bareFists = new BareFists("left and right", "Cut them off a dead man", 9, 3);
        boxer.addWeapon(bareFists);
    }

    @Test
    public void canIncreaseHealth(){
        bigfoot.eatPineNutsForHealth(5);
        assertEquals(85, bigfoot.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        boxer.attack(bigfoot);
        assertEquals(31, bigfoot.getHealthPoints());
    }

    @Test
    public void canGetNumberOfTeeth(){
        assertEquals(800, bigfoot.getNumberOfTeeth());
    }

    @Test
    public void canAttackPlayer(){
        bigfoot.enemyAttack(boxer);
        assertEquals(140, boxer.getHealthPoints());
    }



}
