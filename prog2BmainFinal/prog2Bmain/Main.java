package prog2Bmain;
import prog2B.Order;
import prog2B.OrderLine;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(10);
        OrderLine ol = new OrderLine();
        order.setOrderLine(ol);
        Order order1 = new Order(100);
        OrderLine ol1 = new OrderLine();
        order1.setOrderLine(ol1);
        System.out.println(order);
        System.out.println(order1);
    }
}
