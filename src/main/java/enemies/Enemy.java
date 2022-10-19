package enemies;

public abstract class Enemy {

    private String name;
    private String race;
    private int healthPoints;

    public Enemy(String name, String race, int healthPoints) {
        this.name = name;
        this.race = race;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damagePoints){
        healthPoints -= damagePoints;
    }

    public void increaseHealth(int increase){
        healthPoints+= increase;
    }

}
