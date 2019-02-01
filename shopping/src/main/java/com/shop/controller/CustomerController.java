package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.service.CustomerService;
import com.shop.vo.CustomerVO;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;

	@RequestMapping(value="/list")
	public String list(CustomerVO custVO, Model model ){
		
		List<CustomerVO> customer = service.selectCustomerList(custVO);
		model.addAttribute("customerList", customer);
		
		return "/customer/list";
		
	}
}
