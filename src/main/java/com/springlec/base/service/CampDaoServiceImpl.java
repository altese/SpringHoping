package com.springlec.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.CampDao;
import com.springlec.base.model.BookJoinDto;
import com.springlec.base.model.campDto;
import com.springlec.base.model.roomDto;
@Service
public class CampDaoServiceImpl implements CampDaoService {

	@Autowired
	CampDao dao;
		
	@Override
	public List<campDto> listCamp(HttpServletRequest request) throws Exception {
		
		String regSeq = request.getParameter("regSeq");
		return dao.listCamp(regSeq);
	}

	@Override
	public List<campDto> dateCheck(HttpServletRequest request) throws Exception {
		//String regSeq = request.getParameter("regSeq");
		HttpSession session = request.getSession();
		int regSeq = (int)session.getAttribute("REGSEQ");
		
		String startdate = request.getParameter("startdate");
		String stopdate = request.getParameter("stopdate");
//		startdate = "'"+startdate+"'";
//		stopdate = "'"+stopdate+"'";				
		return dao.dateCheck(regSeq, startdate, stopdate);
	}

	@Override
	public int readMaxSeq(HttpServletRequest request) throws Exception {
		return dao.readMaxSeq();
	}

	@Override
	public int diffDate(HttpServletRequest request) throws Exception {
		String startdate = request.getParameter("startdate");
		String stopdate = request.getParameter("stopdate");
		return dao.diffDate(startdate,stopdate);
	}

	@Override
	public String Nextday(HttpServletRequest request) throws Exception {
		String startdate = request.getParameter("startdate");		
		return dao.Nextday(startdate);
	}

	@Override
	public int insertPay(HttpServletRequest request) throws Exception {
		String strRd = request.getParameter("strRd");	
		int room_roSeq = Integer.parseInt(request.getParameter("room_roSeq"));	
		int room_regcamp_regSeq = Integer.parseInt(request.getParameter("room_regcamp_regSeq"));	
		int room_regcamp_host_hseq = Integer.parseInt(request.getParameter("room_regcamp_host_hseq"));	
		String client_cId = request.getParameter("client_cId");	
		
		return dao.insertPay(strRd, room_roSeq, room_regcamp_regSeq, room_regcamp_host_hseq, client_cId);
	}

	@Override
	public int insertBook(HttpServletRequest request) throws Exception {
		int boPrice = Integer.parseInt(request.getParameter("boPrice"));	
		String boCheckindate = request.getParameter("boCheckindate");	
		int boGroup = Integer.parseInt(request.getParameter("boGroup"));	
		int boCount = Integer.parseInt(request.getParameter("boCount"));	
		String cId = request.getParameter("cId");	
		int roseq = Integer.parseInt(request.getParameter("roseq"));
		String client_cId = request.getParameter("client_cId");	
		int regSeq = Integer.parseInt(request.getParameter("regSeq"));	
		int host_hSeq = Integer.parseInt(request.getParameter("host_hSeq"));		
		
		return dao.insertBook(boPrice,boCheckindate,boGroup,boCount, cId, roseq, client_cId, regSeq, host_hSeq);
	}

	@Override
	public void updateBook(HttpServletRequest request) throws Exception {
		int boGroup = Integer.parseInt(request.getParameter("boGroup"));	
		dao.updateBook(boGroup);

	}

	@Override
	public int readRoomPrice(HttpServletRequest request) throws Exception {
		String regcamp_regSeq = request.getParameter("regcamp_regSeq");
		String roNum = request.getParameter("roNum");
		return dao.readRoomPrice(regcamp_regSeq, roNum);
	}

	@Override
	public roomDto readRoom(HttpServletRequest request) throws Exception {
		String strregcamp_regSeq = request.getParameter("strregcamp_regSeq");
		String strroNum = request.getParameter("strroNum");		
		return dao.readRoom(strregcamp_regSeq, strroNum);
	}

	@Override
	public List<BookJoinDto> ViewBooking(HttpServletRequest request) throws Exception {
		String cId = request.getParameter("cId");
		return dao.ViewBooking(cId);
	}

}
