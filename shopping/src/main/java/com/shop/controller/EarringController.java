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
@RequestMapping(value="/earring")
public class EarringController {

	@Autowired
	private EarringService service;
	
	@RequestMapping(value ="/list")	
	public String list(EarringVO vo, Model model) throws Exception{
		
		List<EarringVO> result = service.selectEarringList(vo);
		model.addAttribute("resultList", result);
		
		
		return "/earring/list";
		
	}
}
