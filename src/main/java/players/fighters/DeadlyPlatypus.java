package players.fighters;

import enemies.IEnemyAttack;

public class DeadlyPlatypus extends Fighter{

    private int talonLength;

    public DeadlyPlatypus(String name, int healthPoints, String martialDiscipline, String armour, int attackPower, int inspiration, int talonLength) {
        super(name, healthPoints, martialDiscipline, armour, attackPower, inspiration);
        this.talonLength = talonLength;
    }

    public int getTalonLength() {
        return this.talonLength;
    }

    public void deathSlash(IEnemyAttack enemy){
        if(this.getInspiration() >= 1){
            this.increaseAttackPower(this.talonLength);
            this.attack(enemy);
            this.setAttackPower(this.getAttackPower()-this.talonLength);
            this.setInspiration(this.getInspiration() -1);}
        else {
            System.out.println("Not enough inspiration");
        }
    }


//    public void deathSlash(IEnemyAttack enemy){
//        this.increaseAttackPower(this.talonLength);
//        this.attack(enemy);
//        this.setAttackPower(this.getAttackPower()-this.talonLength);
//    }


}
