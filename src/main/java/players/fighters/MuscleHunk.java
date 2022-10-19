package players.fighters;

public class MuscleHunk extends Fighter{

    private int hotnessLevel;

    public MuscleHunk(String name, int healthPoints, String martialDiscipline, String armour, int attackPower, int hotnessLevel) {
        super(name, healthPoints, martialDiscipline, armour, attackPower);
        this.hotnessLevel = hotnessLevel;
    }

    public int getHotnessLevel() {
        return hotnessLevel;
    }

    public void superHunkFlex(){
        this.increaseAttackPower(this.hotnessLevel);
        this.attack();
    }
}
