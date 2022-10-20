package players.fighters;

import enemies.IEnemyAttack;
import players.Player;
import weapons.IDamage;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IAttack{

    private String martialDiscipline;
    private String armour;
    ArrayList<IDamage> weaponCache;
    private int attackPower;
    private int inspiration;
    IEnemyAttack enemy;

    public Fighter(String name, int healthPoints, String martialDiscipline, String armour, int attackPower, int inspiration) {
        super(name, healthPoints);
        this.martialDiscipline = martialDiscipline;
        this.armour = armour;
        this.attackPower = attackPower;
        this.inspiration = inspiration;
        this.weaponCache = new ArrayList<>();
    }

    public String getMartialDiscipline() {
        return martialDiscipline;
    }

    public String getArmour() {
        return armour;
    }

    public void addWeapon(IDamage weapon){
        this.weaponCache.add(weapon);
    }

    public void attack(IEnemyAttack enemy){
        if (!weaponCache.isEmpty()) {
            int weaponDamage = this.weaponCache.get(0).damage();
            int totalDamage = this.attackPower + weaponDamage;
            enemy.takeDamage(totalDamage);
        } else { enemy.takeDamage(this.getAttackPower());}
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void increaseAttackPower(int increase){
        attackPower += increase;
    }

    public int getNumberOfWeapons(){
        return weaponCache.size();
    }

    public void chooseWeapon(int weaponIndex){
        int chosenWeapon = weaponIndex -1;
        IDamage temp = weaponCache.get(chosenWeapon);
        for(int i = chosenWeapon; i>0; i--){
            weaponCache.set(i, weaponCache.get(i - 1));
        }
        weaponCache.set(0, temp);
    }



    public IDamage retrieveWeapon(int index){
        return weaponCache.get(index);
    }

    public int getInspiration() {
        return inspiration;
    }

    public void setInspiration(int inspiration) {
        this.inspiration = inspiration;
    }
}
