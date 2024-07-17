package assignment4week_정답아님.secondDay;

import java.util.List;
import java.util.Optional;

public class Order {
    private int id;
    private Customer customer;
    private String orderDate;
    private OrderStatus status;
    private List<OrderItem> orderItems;


    public Order(int id, Customer customer, String orderDate, String status, List<OrderItem> orderItems) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.status = OrderStatus.valueOfTerm(status);
        this.orderItems = orderItems;
    }

//    public String getOrderStatus() {
//        if (status.equals("PAID")) {
//            return "주문 완료";
//        } else if (status.equals("SHIPPED")) {
//            return "배송 완료";
//        } else if (status.equals("DELIVERED")) {
//            return "배송 완료";
//        } else if (status.equals("NOT PAID")) {
//            return "미결제";
//        } else {
//            return "주문 처리 중";
//        }
//    }

    public String getOrderStatus() {
        if (status == OrderStatus.PAID) {
            return "주문 완료";
        } else if (status == OrderStatus.SHIPPED) {
            return "배송 완료";
        } else if (status == OrderStatus.DELIVERED) {
            return "배송 완료";
        } else if (status == OrderStatus.NOTPAID) {
            return "미결제";
        } else {
            return "주문 처리 중";
        }
    }

//    public List<OrderItem> getOrderItems() {
//        List<OrderItem> optionalOrders = Optional.ofNullable(orderItems)
//                .orElseThrow(() -> new RuntimeException("주문이 없습니다."));
//        return optionalOrders;
//    }

    public List<OrderItem> getOrderItems() {
        return Optional.ofNullable(orderItems)
                .orElseThrow(() -> new RuntimeException("주문 내역이 없습니다."));
    }

    public Customer getCustomer() {return customer;}
}
