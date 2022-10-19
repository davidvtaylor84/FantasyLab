package players.fighters;

import players.Player;
import weapons.IDamage;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IAttack{

    private String martialDiscipline;
    private String armour;
    ArrayList<IDamage> weaponCache;
    private int attackPower;

    public Fighter(String name, int healthPoints, String martialDiscipline, String armour, int attackPower) {
        super(name, healthPoints);
        this.martialDiscipline = martialDiscipline;
        this.armour = armour;
        this.attackPower = attackPower;
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

    public int attack(){
        if (!weaponCache.isEmpty()) {
            int weaponDamage = this.weaponCache.get(0).damage();
            this.attackPower += weaponDamage;
        }
        return attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void increaseAttackPower(int increase){
        attackPower += increase;
    }

    public int getNumberOfWeapons(){
        return weaponCache.size();
    }

    public void chooseWeapon(int weaponIndex){
        IDamage temp = weaponCache.get(weaponIndex);
        for(int i = weaponIndex; i>0; i--){
            weaponCache.set(i, weaponCache.get(i - 1));
        }
        weaponCache.set(0, temp);
    }

    public IDamage retrieveWeapon(int index){
        return weaponCache.get(index);
    }

}
