package weapons;

public class GunSword extends Weapon{

    private int numberOfBullets;

    public GunSword(String weaponType, String provenance, int damageValue, int numberOfBullets) {
        super(weaponType, provenance, damageValue);
        this.numberOfBullets = numberOfBullets;
    }

    public int getNumberOfBullets() {
        return numberOfBullets;
    }
}
