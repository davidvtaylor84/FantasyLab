import org.junit.Before;
import org.junit.Test;
import players.fighters.DeadlyPlatypus;
import weapons.GunSword;

import static org.junit.Assert.assertEquals;

public class DeadlyPlatypusTest {

    DeadlyPlatypus deadlyPlatypus;
    GunSword gunSword;

    @Before
    public void before(){
        deadlyPlatypus = new DeadlyPlatypus("Bobby Newhart", 80, "karate", "Greek toga", 10, 8);
        gunSword = new GunSword("Colt with butcher knife", "Old witch in a well", 5, 50);
        deadlyPlatypus.addWeapon(gunSword);
    }

    @Test
    public void canUseDeathSlash(){
        deadlyPlatypus.deathSlash();
        assertEquals(23, deadlyPlatypus.getAttackPower());
    }

}
