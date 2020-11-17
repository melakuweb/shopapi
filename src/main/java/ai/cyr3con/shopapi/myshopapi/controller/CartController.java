package ai.cyr3con.shopapi.myshopapi.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ai.cyr3con.shopapi.myshopapi.exception.ProductOutOfStockException;
import ai.cyr3con.shopapi.myshopapi.model.Cart;
import ai.cyr3con.shopapi.myshopapi.model.Order;
import ai.cyr3con.shopapi.myshopapi.service.CartService;

@Controller
public class CartController {

	@Autowired
	CartService cartService;

	@RequestMapping(value = "/carts", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<Void> create(@RequestBody Cart cart, HttpServletRequest request) throws URISyntaxException {
		Long id = cartService.save(cart);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(new URI(request.getRequestURL() + "/" + id.toString()));
		return new ResponseEntity<Void>(header, HttpStatus.CREATED);
	}
	@RequestMapping(value = "/carts", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Void> retrieveCarts(@RequestBody Cart cart, HttpServletRequest request) throws URISyntaxException {
		Long id = cartService.save(cart);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(new URI(request.getRequestURL() + "/" + id.toString()));
		return new ResponseEntity<Void>(header, HttpStatus.CREATED);
	}
	@RequestMapping(value = "carts/{idCart}", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<Void> addProduct(@PathVariable("idCart") Long idCart, @RequestParam("idProduct") Long idProduct,
			@RequestParam("quantity") Integer quantity) throws ProductOutOfStockException {
		cartService.add(idCart, idProduct, quantity);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	


}
