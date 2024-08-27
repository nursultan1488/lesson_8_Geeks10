package kg.geeks.game.players;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    protected Object getHealt() {
        return null;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {



        }
    }

