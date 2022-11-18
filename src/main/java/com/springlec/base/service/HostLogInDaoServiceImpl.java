package com.springlec.base.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.HostLogInDao;

@Service
public class HostLogInDaoServiceImpl implements HostLogInDaoService {
	
	@Autowired
	HostLogInDao dao;
	
	@Override
	public int logInCheck(HttpServletRequest request) throws Exception{
		
		String cId = request.getParameter("cId");
		String cPw = request.getParameter("cPw");
		return dao.logInCheck(cId, cPw);
		
	}

}//END
