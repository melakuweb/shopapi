package ai.cyr3con.shopapi.myshopapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.cyr3con.shopapi.myshopapi.dao.ProductDao;
import ai.cyr3con.shopapi.myshopapi.exception.ProductNotFoundException;
import ai.cyr3con.shopapi.myshopapi.model.Product;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductDao productDao;

	@Override
	public Product findBy(Long idProduct) throws ProductNotFoundException {
		Product product = productDao.findBy(idProduct);
		if (product != null)
			return product;
		else
			throw new ProductNotFoundException();
	}

	@Override
	public List<Product> findAll() throws ProductNotFoundException {
		List<Product> products = productDao.findAll();
		if (products.isEmpty() || products == null)
			throw new ProductNotFoundException();
		
	    return products;
	}

}
