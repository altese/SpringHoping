package com.springlec.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.regcampDto;
import com.springlec.base.service.ClientMainDaoService;

@Controller
public class ClientMainController {
	
	@Autowired
	ClientMainDaoService service;
	
	//Client 메인 화면 출력
	@RequestMapping("/main")
	public String mainView(Model model) throws Exception {
		List<regcampDto> listRegCampview = service.listRegCampview();
		model.addAttribute("RegCamp",listRegCampview);
		return "Home";
	}
	
	//Client 메인 검색
	@RequestMapping("/searchCamp")
	public String searchCampView(Model model,HttpServletRequest request) throws Exception {
		List<regcampDto> searchRegCamp = service.searchRegCamp(request);
		model.addAttribute("RegCamp",searchRegCamp);
		return "Home";
	}
	//Client Detail View
	@RequestMapping("/detailView")
	public String detailView(Model model,HttpServletRequest request) throws Exception {
		regcampDto detailView = service.detailView(request);
		model.addAttribute("DetailView",detailView);
		
		return "DetailView";
	}
}//END
