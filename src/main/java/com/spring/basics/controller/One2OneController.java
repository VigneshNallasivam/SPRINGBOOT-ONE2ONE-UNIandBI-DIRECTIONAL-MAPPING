package com.spring.basics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring.basics.model.ShopKeeperOne2One;
import com.spring.basics.repository.One2OneRepository;

@RestController
@RequestMapping("/home")
public class One2OneController 
{
	@Autowired
	private One2OneRepository repo;

	@PostMapping("/shop-post")
	public ShopKeeperOne2One insertShop(@RequestBody ShopKeeperOne2One shopkeeper)
	{
		return repo.save(shopkeeper);		
	}
	
	@GetMapping("/shop-biGet/{shopNo}")
	public String getValue(@PathVariable int shopNo)
	{
		return "Bi-directional Value of Shopkeeper Obtained From Customer "+repo.findById(shopNo).get().getCustomer().toString();
	}
	
}
