package com.shop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.CustomerDAO;
import com.shop.service.CustomerService;
import com.shop.vo.CustomerVO;

@Service
public class CutomerImpl implements CustomerService {

	@Autowired
	private CustomerDAO custDAO;

	@Override
	public List<CustomerVO> selectCustomerList(CustomerVO custVO) {
		// TODO Auto-generated method stub
		return custDAO.selectAll(custVO);
	}

	@Override
	public int insertCustomer(CustomerVO custVO) {
		// TODO Auto-generated method stub
		return (Integer) custDAO.insert("insertCustomer", custVO);
	}	
	
}
