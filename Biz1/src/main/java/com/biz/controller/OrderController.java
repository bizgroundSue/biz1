package com.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.biz.entity.Order;

@Controller
public class OrderController {

	@GetMapping("/orderMain")
	public String orderMain() {
		return "OrderMain";
	}
	
	@PostMapping("/order")
	public String order(Order order) {
		System.out.println("=========================order Method Call ");
		System.out.println(order.toString());
		
		return "";
	}
	
}
