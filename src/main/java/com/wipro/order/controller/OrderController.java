package com.wipro.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wipro.order.model.Order;
import com.wipro.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@GetMapping("/orders")
    private List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
 
    @GetMapping("/orders/{id}")
    private Order getOrder(@PathVariable("id") int id) {
        return orderService.getOrderById(id);
    }
    
//    @GetMapping("/orders/customers/{id}")
//    public Order getOrderByCustId(@PathVariable("id") int id) {
//    	Order order = new Order();
//    	order.setCustID(id);
//    	String uri = "";
//    	String name = restTemplate.getForObject(uri, String.class);
//    	return orderService.getOrderById(id);
//    }
    
    @GetMapping("/orders/test")
    public String getProductById() {
    	System.out.println("Inside the method1");
    	RestTemplate rest = new RestTemplate();
    	String uri = "http://localhost:8090/products/test/{id}";
    	String name = rest.getForObject(uri, String.class, 2);    	
    	return name;
    }
    
    @GetMapping("/test")
    public String testAPI() {
    	return "ITS working !!!";
    }
    
    @DeleteMapping("/orders/{id}")
    private void deleteOrder(@PathVariable("id") int id) {
        orderService.deleteOrder(id);
    }
 
    @PostMapping("/orders")
    private Order saveOrder(@RequestBody Order order) {
    	orderService.saveOrUpdateOrder(order);
    	return order;
    }
	
    @PutMapping("/orders/{id}")
    private Order editOrder(@RequestBody Order order) {
        orderService.saveOrUpdateOrder(order);
        return order;
    }
    
}
