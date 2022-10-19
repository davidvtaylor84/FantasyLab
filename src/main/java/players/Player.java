package players;

public abstract class Player implements ITakeDamage {

    private String name;
    private int healthPoints;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }


    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }
}
