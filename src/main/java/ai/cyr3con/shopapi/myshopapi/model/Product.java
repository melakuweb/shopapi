package ai.cyr3con.shopapi.myshopapi.model;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Product implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idProduct;
	
	
	private String productType;
	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	private String description;
	private BigDecimal price;
	private int units;

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public Product() {
	}

	public Product(Long idProduct, String description, BigDecimal price) {
		this.idProduct=idProduct;
		this.description = description;
		this.price = price;
	}

	public Product(Long idProduct, String productType, String description, BigDecimal price, int units ) {
		this.idProduct=idProduct; 
		this.productType = productType;
		this.description = description;
		this.price = price;
		this.units = units;
	}


	public Long getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
