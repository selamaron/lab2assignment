package prog2B;

public class Order {
    private int orderNum;
    private OrderLine orderLine;
    public Order(int orderNum){
        this.orderNum = orderNum;
        orderLine = new OrderLine();
    }
    public int getOrderNum(){
        return orderNum;
    }
    public void setOrderNum(int orderNum){
        this.orderNum = orderNum;
    }
    public OrderLine getOrderLine() {
        return orderLine;
    }
    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
    public String toString(){
        return "Order Number: " + getOrderNum();
    }
}
