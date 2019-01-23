package com.shop.common;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MybatisAbstractDAO {
	private final Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	HttpSession session;
	
	public Object insert(String queryId, Object params) {
		return sqlSession.insert(queryId, params);
	}

	public Object update(String queryId, Object params) {
		return sqlSession.update(queryId, params);
	}

	public Object delete(String queryId, Object params) {
		return sqlSession.delete(queryId, params);
	}

	public Object selectOne(String queryId) {
		return sqlSession.selectOne(queryId);
	}

	public Object selectOne(String queryId, Object params) {
		return sqlSession.selectOne(queryId, params);
	}

	@SuppressWarnings("rawtypes")
	public List selectList(String queryId) {
		return sqlSession.selectList(queryId);
	}

	@SuppressWarnings("rawtypes")
	public List selectList(String queryId, Object params) {
		return sqlSession.selectList(queryId, params);
	}
	
}