import org.junit.Before;
import org.junit.Test;
import players.fighters.MuscleHunk;
import weapons.BareFists;
import weapons.CarTire;

import static org.junit.Assert.assertEquals;

public class MuscleHunkTest {

    MuscleHunk muscleHunk;
    CarTire carTire;

    @Before
    public void before(){
        muscleHunk = new MuscleHunk("The Great Oiled One", 150, "Bodyflexing", "Goose fat", 40, 12);
        carTire = new CarTire("Range Rover tire", "Stolen from a LandRover", 9, "Michelin", 225.00);
    }

    @Test
    public void canAddWeapon(){
        muscleHunk.addWeapon(carTire);
        assertEquals(1, muscleHunk.getNumberOfWeapons());
    }

    @Test
    public void canSuperHunkFlex(){
        muscleHunk.superHunkFlex();
        assertEquals(52, muscleHunk.getAttackPower());
    }


}
