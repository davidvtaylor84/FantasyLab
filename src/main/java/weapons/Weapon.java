package weapons;

public abstract class Weapon implements IDamage{

    private String weaponType;
    private String provenance;
    private int damageValue;

    public Weapon(String weaponType, String provenance, int damageValue) {
        this.weaponType = weaponType;
        this.provenance = provenance;
        this.damageValue = damageValue;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getProvenance() {
        return provenance;
    }

    public int damage() {
        return damageValue;
    }



}
