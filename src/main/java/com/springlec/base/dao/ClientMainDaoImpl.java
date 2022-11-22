package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.regcampDto;

public class ClientMainDaoImpl implements ClientMainDao {
	
	SqlSession sqlSession;
	
	public static String nameSpace = "com.springlec.base.dao.ClientMainDao";
	@Override
	public List<regcampDto> listRegCampview() throws Exception {
		return sqlSession.selectList(nameSpace + ".listRegCampview");
	}

	@Override
	public List<regcampDto> searchRegCamp(String query, String content) throws Exception {
		return sqlSession.selectList(nameSpace + ".searchRegCamp");
	}

	@Override
	public List<regcampDto> dateCheck(String startdate, String stopdate) throws Exception {
		return sqlSession.selectList(nameSpace + ".dateCheck");
	}

	@Override
	public regcampDto detailView(String regSeq) throws Exception {
		return sqlSession.selectOne(nameSpace + ".detailView");
	}

}
