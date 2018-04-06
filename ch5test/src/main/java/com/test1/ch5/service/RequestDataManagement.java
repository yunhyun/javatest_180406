package com.test1.ch5.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.test1.ch5.bean.RequestData;

@Service
public class RequestDataManagement {
	private ModelAndView mav;
	
	public ModelAndView execute(int cmd, RequestData rd) {
		switch(cmd){
		case 1:
			getRequestData(rd); break;
		}
		return mav;
	}
	
	private void getRequestData(RequestData rd) {
		mav = new ModelAndView();
		int i =0;
		mav.addObject("request_data", rd);
		
		//rd 에 담긴 내용을 request_data 라는 속성명에 담음.(타입은 Object)
		
		mav.setViewName("requestTest1");
	}
	
}
