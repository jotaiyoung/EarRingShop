package com.shop.service;



import java.util.List;

import com.shop.vo.CustomerVO;

public interface CustomerService  {

	public List<CustomerVO> selectCustomerList(CustomerVO custVO);
	
	public int insertCustomer(CustomerVO custVO);  
	
	
	
}
