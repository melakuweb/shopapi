package ai.cyr3con.shopapi.myshopapi.model;



import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;


public class Category  {

	private Integer idCategory;
	private String description;
	
	
	private List<Product> products = new ArrayList<Product>();

	public Category() {
	}

	public Category(String description) {
		this.description = description;
	}

	public Category(String description, List<Product> products) {
		this.description = description;
		this.products = products;
	}


	public Integer getIdcategory() {
		return this.idCategory;
	}

	public void setIdcategory(Integer idcategory) {
		this.idCategory = idcategory;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> productses) {
		this.products = productses;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}

}
