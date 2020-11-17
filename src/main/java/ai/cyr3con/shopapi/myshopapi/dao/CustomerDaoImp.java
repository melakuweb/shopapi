package ai.cyr3con.shopapi.myshopapi.dao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ai.cyr3con.shopapi.myshopapi.model.Customer;
import ai.cyr3con.shopapi.myshopapi.model.Product;

@Repository
public class CustomerDaoImp implements CustomerDao {

	Map<Long, Customer> map = new HashMap<>();
	
	
	
	public CustomerDaoImp() {
		map.put(1L, new Customer(1L,"Abitew","amelaku") );
		map.put(2L, new Customer(2L,"Adane","amamuna") );
	}

	@Override
	public Customer findBy(Long id) {	
		
		return map.get(id);
	}

	@Override
	public Long save(Customer customer) {
		map.put(customer.getIdcustomer(), customer)	;
		return customer.getIdcustomer();
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> cList = new LinkedList<Customer>();
		for (Map.Entry<Long, Customer> entry: map.entrySet()) {
			cList.add(entry.getValue());
		}
		return cList;
	}

}
