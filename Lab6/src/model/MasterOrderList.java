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


public class MasterOrderList {
    private List<Order> orderList = new ArrayList<>();
    public Order newOrder() { Order o = new Order(); orderList.add(o); return o; }
    public List<Order> getOrderList() { return orderList; }
}

