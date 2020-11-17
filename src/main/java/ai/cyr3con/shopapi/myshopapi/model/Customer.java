package ai.cyr3con.shopapi.myshopapi.model;

import java.util.ArrayList;
import java.util.List;

public class Customer  {

	private Long idCustomer;
	private String lastName;	
	private String username;

	private List<Order> orders = new ArrayList<Order>();
	private List<Cart> carts = new ArrayList<Cart>();

	public Customer() {
	}

	public Customer(Long idCustomer, String lastName, String username) {
		this.idCustomer = idCustomer;
		this.lastName = lastName;	
		this.username = username;
		
	}


	public Long getIdcustomer() {
		return this.idCustomer;
	}

	public void setIdcustomer(Long idcustomer) {
		this.idCustomer = idcustomer;
	}


	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	public List<Cart> getCarts() {
		return this.carts;
	}

	public void setCarts(List<Cart> cartses) {
		this.carts = cartses;
	}

}
