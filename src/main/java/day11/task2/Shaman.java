package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{
    public Shaman() {
        health = 100;
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        health += 50;
        if (health > 100) {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > 100) {
            hero.health = 100;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health -= magicAtt * (1 - hero.magicDef);
        if (hero.health < 0) {
            hero.health = 0;
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health -= physAtt * (1 - hero.physDef);
        if (hero.health < 0) {
            hero.health = 0;
        }
    }
}
