package ai.cyr3con.shopapi.myshopapi.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.cyr3con.shopapi.myshopapi.dao.CustomerDao;
import ai.cyr3con.shopapi.myshopapi.model.Customer;


@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	CustomerDao customerDao;	

	@Override
	public Long addCustomer(Customer customer) throws NoSuchAlgorithmException {
		
		return customerDao.save(customer);
	}

	@Override
	public Customer findBy(Long id) {		
		return customerDao.findBy(id);
	}

	@Override
	public List<Customer> findAll() {		
		return customerDao.findAll();
	}

}
