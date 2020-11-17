package ai.cyr3con.shopapi.myshopapi.dao;

import java.util.List;


import ai.cyr3con.shopapi.myshopapi.model.Product;

public interface ProductDao {

	Product findBy(Long idProduct);
	Product findBy(String description);
	List<Product> findAll();
	void update(Product product);
	
}
