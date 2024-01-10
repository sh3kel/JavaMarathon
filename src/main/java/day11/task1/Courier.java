package day11.task1;

public class Courier implements Worker {
    //Зарплата
    private int salary;
    //Выплачен ли бонус
    private boolean isPayed;
    //Склад к которому привязан сотрудник
    private Warehouse ware;

    public Courier(Warehouse ware) {
        salary = 0;
        isPayed = false;
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
        salary += 100;
        //При каждом вызове метода значение CountDeliveredOrders для склада, к которому
        //привязан сотрудник увеличивается на 1.
        ware.setCountDeliveredOrders(ware.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if(isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else if(ware.getCountDeliveredOrders() >= 10000) {
            //Выплатить бонус
            salary += 50000;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
