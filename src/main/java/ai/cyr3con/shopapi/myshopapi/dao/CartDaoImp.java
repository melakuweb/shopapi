package ai.cyr3con.shopapi.myshopapi.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ai.cyr3con.shopapi.myshopapi.model.Cart;

@Repository
public class CartDaoImp implements CartDao {

	Map<Long, Cart> map = new HashMap<>();

	@Override
	public Cart findBy(Long idCart) {
		
		return map.get(idCart);

	}

	@Override
	public Long save(Cart cart) {
		 map.put(cart.getIdCart(), cart);
		 return cart.getIdCart();
	}

	@Override
	public void update(Cart cart) {
		Cart oldCart = map.get(cart.getIdCart());
		oldCart.setCustomer(cart.getCustomer());	
		oldCart.setLinesItems(cart.getLinesItems());
		oldCart.setSubtotal(cart.getSubtotal());		
	}
}
