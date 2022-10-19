import enemies.Bigfoot;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Boxer;
import weapons.BareFists;

import static org.junit.Assert.assertEquals;

public class BoxerTest {

    Boxer boxer;
    BareFists bareFists;
    Bigfoot bigfoot;

    @Before
    public void before(){
        boxer = new Boxer("Haymaker Sally", 160, "Queensberry Rules", "Baby lotion", 40, "Lego", "Yeezys");
        bareFists = new BareFists("left and right", "Cut them off a dead man", 9, 3);
        bigfoot = new Bigfoot("Mick", "Lesser Spotted Bigfoot", 80, 20,"Neon green spots", 800);

    }

    @Test
    public void canGetName(){
        assertEquals("Haymaker Sally", boxer.getName());
    }

    @Test
    public void canTakeDamageWhenUsingFistsOfFury(){
        boxer.addWeapon(bareFists);
        boxer.fistsOfFury(bigfoot);
        assertEquals(155, boxer.getHealthPoints());
    }

}
