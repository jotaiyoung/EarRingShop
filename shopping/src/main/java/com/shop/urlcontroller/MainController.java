package com.shop.urlcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	/**
     * 공통 컨텐츠 (/depth)
     */
    @RequestMapping(value = {"/{depth1}"})
    public String commContents1(HttpServletRequest request, HttpServletResponse response
    		,@PathVariable(value="depth1") String depth1
    		,ModelMap model) throws Exception {
    	return "/" + depth1;
    }
    @RequestMapping(value = {"/{depth1}/{depth2}"})
    public String commContents2(HttpServletRequest request, HttpServletResponse response
    		,@PathVariable(value="depth1") String depth1
    		,@PathVariable(value="depth2") String depth2
    		,ModelMap model) throws Exception {
    	return "/" + depth1 + "/" + depth2;
    }
    @RequestMapping(value = {"/{depth1}/{depth2}/{depth3}"})
    public String commContents3(HttpServletRequest request, HttpServletResponse response
    		,@PathVariable(value="depth1") String depth1
    		,@PathVariable(value="depth2") String depth2
    		,@PathVariable(value="depth3") String depth3
    		,ModelMap model) throws Exception {
    	return "/" + depth1 + "/" + depth2 + "/" + depth3;
    }
	
	@RequestMapping(value = "/index")
	public String index(HttpServletRequest request, HttpServletResponse response
			,ModelMap model) throws Exception {
		
		return "/index";
	}
	
	
}