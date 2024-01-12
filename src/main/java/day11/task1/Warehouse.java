package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;


    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    @Override
    public String toString() {
        return "Кол-во собранных заказов: " + countPickedOrders + ". Количество доставленных заказов: " + countDeliveredOrders;
    }

    public void incrementCountDeliveredOrders() {
        countDeliveredOrders += 1;
    }

    public void incrementCountPickedOrders() {
        countPickedOrders += 1;
    }
}
