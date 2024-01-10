package day11.task2;

public abstract class Hero {
    protected int health;
    protected double physDef;
    protected double magicDef;
    protected int physAtt;
    protected int magicAtt;


    @Override
    public String toString() {
        String className = getClass().getSimpleName();
        return className + "{health="+health+"}";
    }
}
