package enemies;

import players.ITakeDamage;

public interface IEnemyAttack {

    void enemyAttack(ITakeDamage player);
    void takeDamage(int damage);

}
