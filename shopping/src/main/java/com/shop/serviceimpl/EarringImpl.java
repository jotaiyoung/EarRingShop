package com.shop.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.EarringDAO;
import com.shop.service.EarringService;
import com.shop.vo.EarringVO;

@Service
public class EarringImpl implements EarringService {

	@Autowired
	private EarringDAO earDAO;

	@Override
	public List<EarringVO> selectEarringList(EarringVO vo) {
		// TODO Auto-generated method stub
		return earDAO.selectEarringList(vo);
	}

	
}
