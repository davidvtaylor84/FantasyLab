package players.fighters;

import enemies.IEnemyAttack;

public class Boxer extends Fighter{

    private String gloveBrand;
    private String championshipTitle;

    public Boxer(String name, int healthPoints, String martialDiscipline, String armour, int attackPower, int inspiration, String gloveBrand, String championshipTitle) {
        super(name, healthPoints, martialDiscipline, armour, attackPower, inspiration);
        this.gloveBrand = gloveBrand;
        this.championshipTitle = championshipTitle;
    }

    public String getGloveBrand() {
        return gloveBrand;
    }

    public String getChampionshipTitle() {
        return championshipTitle;
    }

//    public void fistsOfFury(IEnemyAttack enemy){
//        this.takeDamage(5);
//        this.increaseAttackPower(30);
//        this.attack(enemy);
//        this.setAttackPower(getAttackPower()-30);
//    }

    public void fistsOfFury(IEnemyAttack enemy) {
        if (this.getInspiration() >= 1) {
            this.takeDamage(5);
            this.increaseAttackPower(30);
            this.attack(enemy);
            this.setAttackPower(getAttackPower() - 30);
            this.setInspiration(this.getInspiration() - 1);
        } else {
            System.out.println("Not enough inspiration");
        }
    }
}
