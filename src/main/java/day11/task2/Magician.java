package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack{
    public Magician() {
        health = 100;
        physDef = 0.0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
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
