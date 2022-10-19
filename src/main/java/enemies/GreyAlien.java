package enemies;

public class GreyAlien extends Enemy{

    private String homeDimension;
    private int sponginess;

    public GreyAlien(String name, String race, int healthPoints, String homeDimension, int sponginess) {
        super(name, race, healthPoints);
        this.homeDimension = homeDimension;
        this.sponginess = sponginess;
    }

    public String getHomeDimension() {
        return homeDimension;
    }

    public int getSponginess() {
        return sponginess;
    }

    public void increaseSponginess(int sponginess){
        this.increaseHealth(30);
    }
}
