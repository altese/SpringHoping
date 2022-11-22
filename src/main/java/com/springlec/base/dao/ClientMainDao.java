package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.regcampDto;

public interface ClientMainDao {
	
	public List<regcampDto> listRegCampview() throws Exception;
	public List<regcampDto> searchRegCamp(String query, String content) throws Exception;
	
	public regcampDto detailView(String regSeq) throws Exception;
	public List<regcampDto> dateCheck(String startdate, String stopdate) throws Exception;
	
}
