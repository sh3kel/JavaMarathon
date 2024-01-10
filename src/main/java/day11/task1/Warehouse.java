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

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }
}
