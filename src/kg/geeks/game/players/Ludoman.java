package kg.geeks.game.players;

import java.util.Random;

public abstract class Ludoman extends Hero {
    private int dice;

    public Ludoman (String name, int health, int damage) {
        super(name, health, damage, SuperAbility.DICE);
        int num = new Random().nextInt(0,12);
        for (int i = 0; dice < 0  ; i++) {
        if ( dice < 0 - getHealth()-10 );
        }
        Random random = new Random();
        System.out.println("Ludoman" + this.getName() + "ludoman threw the dice" + this.dice);
    }
}
