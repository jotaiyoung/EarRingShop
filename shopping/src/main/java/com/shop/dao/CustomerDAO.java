package com.shop.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.shop.common.MybatisAbstractDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.EarringVO;

@Repository
public class CustomerDAO extends MybatisAbstractDAO{
	
	public List<CustomerVO> selectAll(CustomerVO custVO){
		return selectList("selectAll",custVO);
		
	}
}
