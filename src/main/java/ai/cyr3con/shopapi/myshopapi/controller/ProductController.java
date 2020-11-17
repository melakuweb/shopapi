package ai.cyr3con.shopapi.myshopapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ai.cyr3con.shopapi.myshopapi.exception.ProductNotFoundException;
import ai.cyr3con.shopapi.myshopapi.model.Product;
import ai.cyr3con.shopapi.myshopapi.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	// to show all available products
	@RequestMapping(value = "/products", method = RequestMethod.GET)	
	public @ResponseBody ResponseEntity<List<Product>> getProducts() throws ProductNotFoundException {
		List<Product> products = productService.findAll();
		return new ResponseEntity<List<Product>> (products, HttpStatus.FOUND);
	}
	
	// to show a specific available product
	@RequestMapping(value = "/products/{idProduct}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Product> getBy(@PathVariable("idProduct") Long idProduct) throws ProductNotFoundException  {
		Product product = productService.findBy(idProduct);
		return new ResponseEntity<Product> (product, HttpStatus.OK);
	}
}
