package ai.cyr3con.shopapi.myshopapi.service;

import java.util.List;

import ai.cyr3con.shopapi.myshopapi.exception.ProductOutOfStockException;
import ai.cyr3con.shopapi.myshopapi.model.Cart;
import ai.cyr3con.shopapi.myshopapi.model.Order;
//here is the change by haymanot
public interface CartService {

	Long save(Cart cart);
	void add(Long idCart, Long idProduct, Integer quantity) throws ProductOutOfStockException;
	Long order(Long idCart);
	List<Order> findAll();

}
