package com.springlec.base.dao;

import org.apache.ibatis.session.SqlSession;

public class HostLogInDaoImpl implements HostLogInDao {
	
	SqlSession sqlSession;
	
	public static String nameSpace = "com.springlec.base.dao.HostLogInDao";

	@Override
	public int logInCheck(String cId, String cPw) throws Exception {
		return sqlSession.selectOne(nameSpace + ".logInCheck");
	}

}
