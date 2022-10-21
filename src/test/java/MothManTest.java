import enemies.MothMan;
import org.junit.Before;
import org.junit.Test;
import players.fighters.MuscleHunk;

import static org.junit.Assert.assertEquals;

public class MothManTest {

    MothMan mothman;
    MuscleHunk muscleHunk;

    @Before
    public void before(){
        mothman = new MothMan("Indrid Cold", "Lesser Spotted Mothman", 90, 20, "Banjo", "Watch out for the bridge. One of you may die");
        muscleHunk = new MuscleHunk("The Great Oiled One", 150, "Bodyflexing", "Goose fat", 40, 5,12);
    }

    @Test
    public void canAttackWithProphecy(){
        mothman.enemyAttack(muscleHunk);
        assertEquals(130, muscleHunk.getHealthPoints());
    }

}
