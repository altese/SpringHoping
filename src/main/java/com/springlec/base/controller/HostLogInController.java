package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.service.HostLogInDaoService;

@Controller
public class HostLogInController {
	
	@Autowired
	HostLogInDaoService service;
	
	//로그인 화면 출력
	@RequestMapping("/logIn")
	public String logInView() {
		return "HostLogin";
	}
	
	//로그인 계정 체크
	@RequestMapping("host_check")
	public String logInCheck(HttpServletRequest request) throws Exception {
		int hSeq = service.logInCheck(request);
		String cId = request.getParameter("cId");
		String hId = null;
		if(hSeq != 0) {
			hId = cId;
			HttpSession session = request.getSession();
			session.setAttribute("HID", hId);
			session.setAttribute("HSEQ", hSeq);
			return "HostMain";
		} else {
			return "HostError";
		}
	}

}//END
