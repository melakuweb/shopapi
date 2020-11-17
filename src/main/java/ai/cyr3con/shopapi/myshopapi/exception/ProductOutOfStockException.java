package ai.cyr3con.shopapi.myshopapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Product Out Of StockException")
public class ProductOutOfStockException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProductOutOfStockException() {
		super();
	}

	public ProductOutOfStockException(String message) {
		super(message);
	}

}
