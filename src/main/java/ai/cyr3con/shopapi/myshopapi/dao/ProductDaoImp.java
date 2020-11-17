package ai.cyr3con.shopapi.myshopapi.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Repository;

import ai.cyr3con.shopapi.myshopapi.model.Cart;
import ai.cyr3con.shopapi.myshopapi.model.Category;
import ai.cyr3con.shopapi.myshopapi.model.Product;

@Repository
public class ProductDaoImp implements ProductDao {

	Map<Long, Product> map = new HashMap<>();

	
	public ProductDaoImp() {
		
		Product product1 = new Product(1L,"Cell phones",  "iPhone X", new BigDecimal(234),  10);		
		map.put(1L, product1);	
		
		Product product2 = new Product(2L,"Computers ",  "Dell Latilutde", new BigDecimal(456),  20);		
		map.put(2L, product2);
	}    

	@Override
	public Product findBy(Long idProduct) {
		return map.get(idProduct);
	}

	@Override
	public Product findBy(String description) {	
	                  
		for (Map.Entry<Long, Product> entry: map.entrySet()) {
			if(entry.getValue().getDescription().equals(description))
				return entry.getValue();
		}
		return null;
	}	


	@Override
	public List<Product> findAll() {
		
		List<Product> pList = new LinkedList<Product>();
		for (Map.Entry<Long, Product> entry: map.entrySet()) {
			pList.add(entry.getValue());
		}
		return pList;
	}

	@Override
	public void update(Product product) {		
		map.put(product.getIdProduct(), product);		
	}



}
