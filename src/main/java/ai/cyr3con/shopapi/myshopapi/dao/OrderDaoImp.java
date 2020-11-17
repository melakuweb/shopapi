package ai.cyr3con.shopapi.myshopapi.dao;



import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Repository;

import ai.cyr3con.shopapi.myshopapi.model.Order;
import ai.cyr3con.shopapi.myshopapi.model.Product;


@Repository
public class OrderDaoImp implements OrderDao {
	
	Map<Long, Order> map = new HashMap<>();
	

	@Override
	public Long save(Order order) {
		map.put(order.getIdorder(),order);	
		return order.getIdorder();
	}


	@Override
	public List<Order> findAll() {
		List<Order> oList = new LinkedList<Order>();
		for (Map.Entry<Long, Order> entry: map.entrySet()) {
			oList.add(entry.getValue());
		}
		return oList;		
	}

}
