package com.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.biz.entity.Option;
import com.biz.entity.Order;

@Controller
public class OrderController {

	@GetMapping("/menu")
	public String orderMain() {
		return "Order/Menu";
	}
	
	@GetMapping("/menuChoice")
	public String menuChoice(String menu_name, Model model) {
		System.out.println("=========================menuChoice Method Call ");
		System.out.println(menu_name);
		model.addAttribute("menu_name", menu_name);
		
		return "Order/Option";
	}
	
	@GetMapping("/order")
	public String order(Option option, String menu_name) {
		System.out.println("=========================option Method Call ");
		System.out.println(option.toString());
		System.out.println(menu_name);
		
		return "";
	}
	
}
