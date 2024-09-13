package com.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

	@GetMapping("/orderMain")
	public String orderMain() {
		return "OrderMain";
	}
}
