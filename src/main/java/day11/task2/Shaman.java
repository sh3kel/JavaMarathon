package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack{

    private final int SELF_HEAL = 50;
    private final int TEAMMATE_HEAL = 30;

    private int magicAtt;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if(health + SELF_HEAL > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += SELF_HEAL;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + TEAMMATE_HEAL > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += TEAMMATE_HEAL;
        }
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
