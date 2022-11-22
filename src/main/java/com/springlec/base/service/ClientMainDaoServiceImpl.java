package com.springlec.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.ClientMainDao;
import com.springlec.base.model.regcampDto;

@Service
public class ClientMainDaoServiceImpl implements ClientMainDaoService {

	@Autowired
	ClientMainDao dao;
	
	@Override
	public List<regcampDto> listRegCampview() throws Exception {
		return dao.listRegCampview();
	}

	@Override
	public List<regcampDto> searchRegCamp(HttpServletRequest request) throws Exception {
		// Test Code 임시로 CID를 입력함
		HttpSession session = request.getSession();
		session.setAttribute("CID", "sanghyuk");		
		
		String query = request.getParameter("query");
		String content = request.getParameter("content");
		content = "%"+content+"%";
		return dao.searchRegCamp(query, content);
	}

	@Override
	public List<regcampDto> dateCheck(HttpServletRequest request) throws Exception {
		
		String startdate = request.getParameter("startdate");
		String stopdate = request.getParameter("stopdate");
		return dao.dateCheck(startdate, stopdate);
	}

	@Override
	public regcampDto detailView(HttpServletRequest request) throws Exception {
		String regSeq = request.getParameter("regSeq");
		HttpSession session = request.getSession();
		session.setAttribute("REGSEQ", regSeq);	
		
		return dao.detailView(regSeq);
	}

}