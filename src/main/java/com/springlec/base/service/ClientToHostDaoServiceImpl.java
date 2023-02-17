package com.springlec.base.service;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.ClientToHostDao;
import com.springlec.base.model.ClientDto;

@Service
public class ClientToHostDaoServiceImpl implements ClientToHostDaoService {

	@Autowired
	ClientToHostDao dao;

	@Override
	public int hostCheckDao(String cId) throws Exception {
		
		
		return dao.hostCheckDao(cId);
	}

	@Override
	public ClientDto cShowDao(String cId) throws Exception {
		
		
		
		return dao.cShowDao(cId);
	}

	@Override
	public void hInsertDao(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		String hId = request.getParameter("hId");
		String hSummary = request.getParameter("hSummary");
		
		dao.hInsertDao(hId, hSummary);
		
	}

	@Override
	public void hImageDao(String hImage, String hId) throws Exception {
		// TODO Auto-generated method stub
		dao.hImageDao(hImage, hId);
	}
	
	


}
