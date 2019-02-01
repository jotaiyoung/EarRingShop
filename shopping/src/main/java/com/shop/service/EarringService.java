package com.shop.service;

import java.util.List;

import com.shop.vo.EarringVO;

public interface EarringService  {

	public List<EarringVO> selectEarringList(EarringVO vo);
	
	public EarringVO selectEarringInfo(EarringVO vo); 
	
	
	
}
