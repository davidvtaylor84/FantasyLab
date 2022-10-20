package players.fighters;


import enemies.IEnemyAttack;

public class MuscleHunk extends Fighter{

    private int hotnessLevel;
    IEnemyAttack enemy;

    public MuscleHunk(String name, int healthPoints, String martialDiscipline, String armour, int attackPower, int inspiration, int hotnessLevel) {
        super(name, healthPoints, martialDiscipline, armour, attackPower, inspiration);
        this.hotnessLevel = hotnessLevel;
    }

    public int getHotnessLevel() {
        return hotnessLevel;
    }

    public void superHunkFlex(IEnemyAttack enemy){
        if(this.getInspiration() >=1) {
            this.increaseAttackPower(this.hotnessLevel);
            this.attack(enemy);
            this.setAttackPower(this.getAttackPower() - hotnessLevel);
            this.setInspiration(this.getInspiration() - 1);
        }else{
            System.out.println("Not enough inspiration");
        }
    }



}
