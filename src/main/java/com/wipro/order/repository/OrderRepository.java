package com.wipro.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.order.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
