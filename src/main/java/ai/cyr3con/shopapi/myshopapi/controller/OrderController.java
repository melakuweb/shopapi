package ai.cyr3con.shopapi.myshopapi.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ai.cyr3con.shopapi.myshopapi.model.Order;
import ai.cyr3con.shopapi.myshopapi.service.CartService;


public class OrderController {
	@Autowired
	CartService cartService;
	
	@RequestMapping(value = "/orders{idCart}", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<Void> order(@PathVariable("idCart") Long idCart, HttpServletRequest request) throws URISyntaxException {
		Long id = cartService.order(idCart);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(new URI(request.getRequestURL() + "/" + id.toString()));
		return new ResponseEntity<Void>(header, HttpStatus.CREATED);
	}
	
	// order summary 
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Order>> orderSummary(HttpServletRequest request) throws URISyntaxException {
		List<Order> orders = cartService.findAll();
		HttpHeaders header = new HttpHeaders();
		header.setLocation(new URI(request.getRequestURL() + "/" ));
		return new ResponseEntity<List<Order> >(orders,header,HttpStatus.CREATED);
	}

}
