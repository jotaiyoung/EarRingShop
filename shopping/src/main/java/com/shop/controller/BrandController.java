package com.shop.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.service.EarringService;
import com.shop.vo.EarringVO;

@Controller
@RequestMapping(value="/brand")
public class BrandController {

	
	@RequestMapping(value ="/brand")	
	public String Brand(){		
		
		
		return "/brand/brand";
		
	}
}
