package ai.cyr3con.shopapi.myshopapi.dao;

import java.util.List;

import ai.cyr3con.shopapi.myshopapi.model.Order;


public interface OrderDao {

	Long save(Order order);
	List<Order> findAll();

}
