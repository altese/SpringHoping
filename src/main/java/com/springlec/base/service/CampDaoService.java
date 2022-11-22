package com.springlec.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.springlec.base.model.BookJoinDto;
import com.springlec.base.model.campDto;
import com.springlec.base.model.roomDto;

public interface CampDaoService {
	public List<campDto> listCamp(HttpServletRequest request) throws Exception;
	public List<campDto> dateCheck(HttpServletRequest request) throws Exception;
	public int readMaxSeq(HttpServletRequest request) throws Exception;
	public int diffDate(HttpServletRequest request) throws Exception;
	public String Nextday(HttpServletRequest request) throws Exception;
	public int insertPay(HttpServletRequest request) throws Exception;
	public int insertBook(HttpServletRequest request) throws Exception;
	public void updateBook(HttpServletRequest request)throws Exception;
	public int readRoomPrice(HttpServletRequest request)throws Exception;
	public roomDto readRoom(HttpServletRequest request)throws Exception;
	public List<BookJoinDto> ViewBooking(HttpServletRequest request) throws Exception;
}
