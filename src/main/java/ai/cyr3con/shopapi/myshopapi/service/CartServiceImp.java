package ai.cyr3con.shopapi.myshopapi.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.cyr3con.shopapi.myshopapi.dao.CartDao;
import ai.cyr3con.shopapi.myshopapi.dao.OrderDao;
import ai.cyr3con.shopapi.myshopapi.dao.ProductDao;
import ai.cyr3con.shopapi.myshopapi.exception.ProductOutOfStockException;
import ai.cyr3con.shopapi.myshopapi.model.Cart;
import ai.cyr3con.shopapi.myshopapi.model.LineItem;
import ai.cyr3con.shopapi.myshopapi.model.Order;
import ai.cyr3con.shopapi.myshopapi.model.Order.BuilderOrder;
import ai.cyr3con.shopapi.myshopapi.model.Product;
import ai.cyr3con.shopapi.myshopapi.util.OrderStatus;

@Service
public class CartServiceImp implements CartService {

	@Autowired
	CartDao cartDao;

	@Autowired
	ProductDao productDao;
	
	@Autowired
	OrderDao orderDao;

	@Override
	public Long save(Cart cart) {
		return cartDao.save(cart);
	}

	@Override
	public void add(Long idCart, Long idProduct, Integer quantity) throws ProductOutOfStockException {
		Cart cart = cartDao.findBy(idCart);
		Product product = productDao.findBy(idProduct);	
		if(product.getUnits() - quantity<0) {
			throw new ProductOutOfStockException();
		}
		product.setUnits(product.getUnits()- quantity);
		productDao.update(product);
		cart.getLinesItems().add(new LineItem( product, quantity, product.getPrice()));
		cartDao.update(cart);
	}

	@Override
	public Long order(Long idCart) {
		Cart cart = cartDao.findBy(idCart);
		Order order = new BuilderOrder()
				.setCustomer(cart.getCustomer())
				.setOrdered(new Date())
				.setStatus(OrderStatus.NEW.toString())
				.setTotal(cart.calculateTotal())
				.setLinesItems(cart.getLinesItems())
				.build();
		return orderDao.save(order);
	}

	@Override
	public List<Order> findAll() {
		
		return orderDao.findAll();
	}

}
