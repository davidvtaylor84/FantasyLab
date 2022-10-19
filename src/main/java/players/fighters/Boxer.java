package players.fighters;

public class Boxer extends Fighter{

    private String gloveBrand;
    private String championshipTitle;

    public Boxer(String name, int healthPoints, String martialDiscipline, String armour, int attackPower, String gloveBrand, String championshipBrand) {
        super(name, healthPoints, martialDiscipline, armour, attackPower);
        this.gloveBrand = gloveBrand;
        this.championshipTitle = championshipTitle;
    }

    public String getGloveBrand() {
        return gloveBrand;
    }

    public String getChampionshipTitle() {
        return championshipTitle;
    }

    public void fistsOfFury(){
        this.takeDamage(5);
        this.increaseAttackPower(30);
        this.attack();
    }
}
