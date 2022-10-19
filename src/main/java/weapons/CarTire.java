package weapons;

public class CarTire extends Weapon{

    private String brand;
    private double airPressure;

    public CarTire(String weaponType, String provenance, int damageValue, String brand, double airPressure) {
        super(weaponType, provenance, damageValue);
        this.brand = brand;
        this.airPressure = airPressure;
    }

    public String getBrand() {
        return brand;
    }

    public double getAirPressure() {
        return airPressure;
    }
}
