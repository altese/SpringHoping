package com.springlec.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.springlec.base.model.regcampDto;

public interface ClientMainDaoService {
	
	public List<regcampDto> listRegCampview() throws Exception;
	public List<regcampDto> searchRegCamp(HttpServletRequest request) throws Exception;
	public regcampDto detailView(HttpServletRequest request) throws Exception;
	
	public List<regcampDto> dateCheck(HttpServletRequest request) throws Exception;


}
