package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    public Warrior() {
        health = 100;
        physDef = 0.8;
        magicDef = 0.0;
        physAtt = 30;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health -= physAtt * (1 - hero.physDef);
        if (hero.health < 0) {
            hero.health = 0;
        }
    }
}
