package com.springlec.base.dao;

import com.springlec.base.model.ClientDto;

public interface ClientToHostDao {
	
	public int hostCheckDao(String cId) throws Exception;
	public ClientDto cShowDao(String cId) throws Exception;
	public void hInsertDao(String hId, String hSummary) throws Exception;
	public void hImageDao(String hImage, String hId) throws Exception;
}
