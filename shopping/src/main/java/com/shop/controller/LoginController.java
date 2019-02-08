package com.shop.controller;

import javax.servlet.http.Cookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.vo.CustomerVO;

@Controller
@RequestMapping(value="/login")
public class LoginController {

	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	    public ModelAndView loginForm(CustomerVO custVO,@CookieValue(value="REMEMBER", required=false) Cookie rememberCookie) throws Exception{
	        
	        if(rememberCookie!=null) {
	        	custVO.setId(rememberCookie.getValue());
	        	custVO.setRememberId(true);
	        }
	        
	        ModelAndView mv = new ModelAndView("login/loginForm");
	        return mv;
	    }
}
