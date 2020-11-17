package ai.cyr3con.shopapi.myshopapi.dao;

import ai.cyr3con.shopapi.myshopapi.model.Cart;

public interface CartDao {

	Cart findBy(Long idCart);
	Long save(Cart cart);
	void update(Cart cart);
	
}
