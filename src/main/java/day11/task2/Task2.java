package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        //Создаем объекты
        Warrior war = new Warrior();
        Paladin pal = new Paladin();
        Shaman sham = new Shaman();
        Magician mag = new Magician();
        //Воин атакует паладина
        war.physicalAttack(pal);
        System.out.println(pal);
        //Паладин атакует мага
        pal.physicalAttack(mag);
        System.out.println(mag);
        //Шаман лечит мага
        sham.healTeammate(mag);
        System.out.println(mag);
        //Маг атакует паладина (М)
        mag.magicalAttack(pal);
        System.out.println(pal);
        //Шаман атакует воина (Ф)
        sham.physicalAttack(war);
        System.out.println(war);
        //Паладин лечит себя
        pal.healHimself();
        System.out.println(pal);
        //Воин атакует мага 5 раз
        war.physicalAttack(mag); //1
        System.out.println(mag);
        war.physicalAttack(mag); //2
        System.out.println(mag);
        war.physicalAttack(mag); //3
        System.out.println(mag);
        war.physicalAttack(mag); //4
        System.out.println(mag);
        war.physicalAttack(mag); //5
        System.out.println(mag);
    }
}
