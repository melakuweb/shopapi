package ai.cyr3con.shopapi.myshopapi.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import ai.cyr3con.shopapi.myshopapi.exception.ProductNotFoundException;
import ai.cyr3con.shopapi.myshopapi.model.Customer;
import ai.cyr3con.shopapi.myshopapi.model.Product;
import ai.cyr3con.shopapi.myshopapi.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	
	public @ResponseBody ResponseEntity<List<Customer>> getProducts() throws ProductNotFoundException {
		List<Customer> products = customerService.findAll();
		return new ResponseEntity<List<Customer>> (products, HttpStatus.FOUND);
	}
	
	@RequestMapping(value = "/customers/{idCustomer}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Customer> getBy(@PathVariable("idCustomer") Long idCustomer) throws ProductNotFoundException  {
		Customer customer = customerService.findBy(idCustomer);
		return new ResponseEntity<Customer> (customer, HttpStatus.OK);
	}

}
