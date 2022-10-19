package players.fighters;

public class DeadlyPlatypus extends Fighter{

    private int talonLength;

    public DeadlyPlatypus(String name, int healthPoints, String martialDiscipline, String armour, int attackPower, int talonLength) {
        super(name, healthPoints, martialDiscipline, armour, attackPower);
        this.talonLength = talonLength;
    }

    public int getTalonLength() {
        return this.talonLength;
    }

    public void deathSlash(){
        this.increaseAttackPower(this.talonLength);
        this.attack();
    }


}
