package day11.task1;

public class Picker implements Worker {
    //Зарплата
    private int salary;
    //Выплачен ли бонус
    private boolean isPayed;
    //Склад, к которому привязан сотрудник
    private Warehouse ware;

    public Picker(Warehouse ware) {
        this.ware = ware;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Зарплата: " + salary + ". Выплачен бонус: " + isPayed;
    }

    @Override
    public void doWork() {
        //Увеличиваем зарплату сотрудника
        salary += 80;
        //При каждом вызове метода значение CountPickedOrders для склада, к которому
        //привязан сотрудник увеличивается на 1.
        ware.incrementCountPickedOrders();
    }

    @Override
    public void bonus() {
        if(isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else if(ware.getCountPickedOrders() >= 10000) {
            //Выплатить бонус
            salary += 70000;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
