/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rithwikvarma
 */

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int count = 0;
    private int orderNumber;
    private List<OrderItem> orderItemList = new ArrayList<>();

    public Order() { orderNumber = ++count; }
    public OrderItem addOrderItem(Product p, int q, int price) {
        OrderItem oi = new OrderItem();
        oi.setProduct(p); oi.setQuantity(q); oi.setSalesPrice(price);
        orderItemList.add(oi);
        return oi;
    }
    public List<OrderItem> getOrderItemList() { return orderItemList; }
    public int getOrderNumber() { return orderNumber; }
    public int getTotalOrderValue() {
        int sum = 0; for (OrderItem i : orderItemList) sum += i.getTotalPrice(); return sum;
    }
    @Override public String toString() { return "Order #" + orderNumber; }
}