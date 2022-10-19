package weapons;

public class BareFists extends Weapon{

    private int fragilityLevel;

    public BareFists(String weaponType, String provenance, int damageValue, int fragilityLevel) {
        super(weaponType, provenance, damageValue);
        this.fragilityLevel = fragilityLevel;
    }

    public int getFragilityLevel() {
        return fragilityLevel;
    }
}
