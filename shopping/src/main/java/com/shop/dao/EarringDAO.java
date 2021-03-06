package com.shop.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.shop.common.MybatisAbstractDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.EarringVO;

@Repository
public class EarringDAO extends MybatisAbstractDAO{		
	
	public List<EarringVO> selectEarringList(EarringVO vo){
		return selectList("selectEarringList", vo);
	}
	
	public EarringVO selectEarringInfo(EarringVO vo){
		return (EarringVO) selectOne("selectEarringInfo", vo);		
	}	
	
}
