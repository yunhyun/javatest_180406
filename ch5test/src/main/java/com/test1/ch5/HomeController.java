package com.test1.ch5;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test1.ch5.bean.RequestData;
import com.test1.ch5.service.RequestDataManagement;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private RequestDataManagement rdm; //서비스 클래스 
	
	private ModelAndView mav; 
	
	//requestTest1_Form.jsp 의 폼태그 action 값은 requestTest1으로 되어 있음. method는 post
	//
	@RequestMapping(value = "/requestTest1", method = RequestMethod.POST)
	public ModelAndView requestTest1(RequestData rd) {
		//RequestData는 bean 클래스 
		System.out.println(rd.getName());
		mav = new ModelAndView();
		mav = rdm.execute(1, rd); //request_data에 rd를 담아서 리턴 값으로 넘김. 
		//리턴 결과를 mav에 담음. 
		return mav;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "requestTest1_Form";
	}
	
}
