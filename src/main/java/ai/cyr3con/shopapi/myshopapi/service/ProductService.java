package ai.cyr3con.shopapi.myshopapi.service;

import java.util.List;

import ai.cyr3con.shopapi.myshopapi.exception.ProductNotFoundException;
import ai.cyr3con.shopapi.myshopapi.model.Product;

public interface ProductService {

	Product findBy(Long idProduct) throws ProductNotFoundException;
	List<Product> findAll() throws ProductNotFoundException;
	
}
