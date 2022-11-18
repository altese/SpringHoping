package com.springlec.base.service;

import javax.servlet.http.HttpServletRequest;

public interface HostLogInDaoService {
	
	public int logInCheck(HttpServletRequest request) throws Exception;

}
