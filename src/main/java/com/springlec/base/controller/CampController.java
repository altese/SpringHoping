package com.springlec.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.campDto;
import com.springlec.base.model.regcampDto;
import com.springlec.base.service.CampDaoService;

@Controller
public class CampController {

	@Autowired
	CampDaoService service;
	
	//Camp 예약 관련
	@RequestMapping("/booking")
	public String listCamp(Model model,HttpServletRequest request) throws Exception {
		List<campDto> listCamp = service.listCamp(request);
		model.addAttribute("Camp",listCamp);
		return "Calendar2";
	}
	
	//Camp 예약관련 날짜 확인
	@RequestMapping("/bookingdatecheck")
	public String bookingdatecheck(Model model,HttpServletRequest request) throws Exception {
		List<campDto> dateCheck = service.dateCheck(request);
		model.addAttribute("Camp",dateCheck);
		return "Calendar3";
	}
/*	
	//Camp 예약관련 날짜 확인
	@RequestMapping("/pay")
	public String readMaxSeq(Model model,HttpServletRequest request) throws Exception {
		List<campDto> dateCheck = service.readMaxSeq(request);
		model.addAttribute("RegCamp",readMaxSeq);
		return "Calendar2";
	}
	//Camp 예약관련 날짜 확인
	@RequestMapping("/bookingView")
	public String diffDate(Model model,HttpServletRequest request) throws Exception {
		List<campDto> diffDate = service.diffDate();
		model.addAttribute("RegCamp",diffDate);
		return "Calendar2";
	}
	
			case ("/confirmation.do"):
			command = new BCBookingConfirmationCommand();
			command.execute(request, response);
			command = new BCCalcDateCommand();
			command.execute(request, response);
			viewPage = "Booking.jsp";
			break;
	
*/
}
