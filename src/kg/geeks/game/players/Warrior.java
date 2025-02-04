package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Warrior extends Hero {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    protected Object getHealt() {
        return null;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficient = RPG_Game.random.nextInt(6) + 2;
        boss.setHealth(boss.getHealth() - coefficient * this.getDamage());
        System.out.println("Warrior " + this.getName()
                + " hits critically: " + coefficient * this.getDamage());
    }
}
