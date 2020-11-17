package ai.cyr3con.shopapi.myshopapi.model;



import java.math.BigDecimal;




public class LineItem  {

	private Long idlinesItem;	
	private Product product;	
	private Integer quantity;
	private BigDecimal price;

	public LineItem() {
	}

	public LineItem( Product product, Integer quantity, BigDecimal price) {
		
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}


	public Long getIdlinesItem() {
		return this.idlinesItem;
	}

	public void setIdlinesItem(Long idlinesItem) {
		this.idlinesItem = idlinesItem;
	}
	
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
