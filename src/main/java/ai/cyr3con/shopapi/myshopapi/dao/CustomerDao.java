package ai.cyr3con.shopapi.myshopapi.dao;

import java.util.List;

import ai.cyr3con.shopapi.myshopapi.model.Customer;


public interface CustomerDao {

	Customer findBy( Long id);
	Long save(Customer customer);
	List<Customer> findAll();
	
}
