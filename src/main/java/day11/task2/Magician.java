package day11.task2;

public class Magician extends Hero implements MagicAttack{

    private int magicAtt;

    public Magician() {
        physDef = 0.0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAtt * (1 - hero.magicDef);
        if (hero.health - attack < 0) {
            hero.health = 0;
        } else {
            hero.health -= attack;
        }
    }
}
