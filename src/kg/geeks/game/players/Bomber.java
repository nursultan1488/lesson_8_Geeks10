package kg.geeks.game.players;

public class Bomber extends Hero {
    private int boom;

    public Bomber(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOM);
    }

    @Override
    protected Object getHealt() {
        return null;
    }

    public void setBoom (int boom) {
        this.boom = boom;
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {

                
            }    
                

            }
        }


