package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.ClientDto;
import com.springlec.base.service.ClientToHostDaoService;

@Controller
public class ClientToHostController {
	
	@Autowired
	ClientToHostDaoService service;
	
	//호스트 가입여부 체크
	@RequestMapping("/hostCheck")
	public String hostCheck(HttpServletRequest request) throws Exception {
		
		int hCheck = service.hostCheckDao(request.getParameter("cId"));
		
		
		if(hCheck == 0) {
			return "HostTerms";
		}else {
			return "HostMain";
		}
	}
	
	//호스트 가입에 따른 페이지 이동
	@RequestMapping("/termsAD")
	public String termsAd(HttpServletRequest request) throws Exception {
		
		String agree = request.getParameter("agree");

		if(agree.equals("agree")){
			return "TermsAgree";
		}else {
			return "redirect:cHomeList";
		}
		
	}
	
	//호스트 가입 위해 클라이언트 정보 가져오기
	@RequestMapping("/showC")
	public String cShowDao(HttpServletRequest request, Model model) throws Exception {
		
		
		ClientDto clientShow = service.cShowDao(request.getParameter("cId"));
		model.addAttribute("mypage", clientShow);
		System.out.println("호스트로가입위한 클라이언트 정보 불러오기 : " + clientShow);
		
		
		return "hostJoin";
		
	}
	
	//호스트 가입 insert
	@RequestMapping("/hJoin")
	public String hJoin(HttpServletRequest request) throws Exception{
		service.hInsertDao(request);
		System.out.println("호스트가입 확인");
		return "uploadImage";
	}
	
//	//호스트 이미지 넣기
//	@RequestMapping("/hImage")
//	public String hImage(HttpServletRequest request, Model model) throws Exception{
//		service.hImageDao(request.getParameter("hImage"), request.getParameter("hId"));
//		return "fileShow";
//	}

}
