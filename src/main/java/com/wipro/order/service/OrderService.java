package com.wipro.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.order.model.Order;
import com.wipro.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	public List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<Order>();
        orderRepository.findAll().forEach(order -> orders.add(order));
        return orders;
    }
 
    public Order getOrderById(int id) {
        return orderRepository.findById(id).get();
    }
 
    public void saveOrUpdateOrder(Order order) {
    	orderRepository.save(order);
    }
 
    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }

}
