package com.fernandaviana.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernandaviana.entities.Order;
import com.fernandaviana.services.OrderService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping (value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	@ApiOperation(value = "Retorna uma lista de pedidos")
	public ResponseEntity<List<Order>> findAll(){
		
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value="/{id}")
	@ApiOperation(value = "Retorna um pedido único")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
