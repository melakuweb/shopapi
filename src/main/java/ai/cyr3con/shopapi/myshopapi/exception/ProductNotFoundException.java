package ai.cyr3con.shopapi.myshopapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Product not found")
public class ProductNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProductNotFoundException() {
		super();
	}

	public ProductNotFoundException(String message) {
		super(message);
	}

}
