package ai.cyr3con.shopapi.myshopapi.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import ai.cyr3con.shopapi.myshopapi.model.Customer;

public interface CustomerService {
	// comments

	Long getCustomer(Customer customer) throws NoSuchAlgorithmException;
	Customer findBy( Long id);	
	List<Customer> findAll();
}
