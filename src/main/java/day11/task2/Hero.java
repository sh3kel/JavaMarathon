package day11.task2;

public abstract class Hero {
    protected final int MAX_HEALTH = 100;
    protected int health = MAX_HEALTH;
    protected double physDef;
    protected double magicDef;
    protected int physAtt;

    public void physicalAttack(Hero hero) {
        double attack = physAtt * (1 - hero.physDef);
        if (hero.health - attack < 0) {
            hero.health = 0;
        } else {
            hero.health -= attack;
        }
    }


    @Override
    public String toString() {
        String className = getClass().getSimpleName();
        return className + "{health="+health+"}";
    }
}
