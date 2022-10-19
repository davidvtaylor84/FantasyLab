package enemies;

import players.ITakeDamage;

public abstract class Enemy implements IEnemyAttack{

    private String name;
    private String race;
    private int healthPoints;

    private int attackPower;
    ITakeDamage player;

    public Enemy(String name, String race, int healthPoints, int attackPower) {
        this.name = name;
        this.race = race;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
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

    public void enemyAttack(ITakeDamage player){
        player.takeDamage(this.attackPower);
    }

    public int getAttackPower() {
        return attackPower;
    }
}
