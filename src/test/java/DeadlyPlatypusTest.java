import enemies.Bigfoot;
import org.junit.Before;
import org.junit.Test;
import players.fighters.DeadlyPlatypus;
import weapons.BareFists;
import weapons.GunSword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class DeadlyPlatypusTest {

    DeadlyPlatypus deadlyPlatypus;
    GunSword gunSword;
    BareFists bareFists;
    Bigfoot bigfoot;

    @Before
    public void before(){
        deadlyPlatypus = new DeadlyPlatypus("Bobby Newhart", 80, "karate", "Greek toga", 10, 8);
        gunSword = new GunSword("Colt with butcher knife", "Old witch in a well", 5, 50);
        bareFists = new BareFists("left and right", "Cut them off a dead man", 9, 3);
        bigfoot = new Bigfoot("Mick", "Lesser Spotted Bigfoot", 80, 20,"Neon green spots", 800);
        deadlyPlatypus.addWeapon(gunSword);
        deadlyPlatypus.addWeapon(bareFists);
    }

    @Test
    public void canUseDeathSlash(){
        deadlyPlatypus.deathSlash(bigfoot);
        assertEquals(23, deadlyPlatypus.getAttackPower());
    }

    @Test
    public void canSwapWeapon(){
        deadlyPlatypus.chooseWeapon(1);
        assertEquals(9, deadlyPlatypus.retrieveWeapon(0).damage() );
    }

}
