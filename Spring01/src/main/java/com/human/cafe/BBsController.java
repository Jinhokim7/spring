package com.human.cafe;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.service.IF_bosrdService;
import com.human.service.IF_joinService;
import com.human.vo.BoardVO;
import com.human.vo.JoinVO;

@Controller
public class BBsController {
	@Inject
	private IF_bosrdService bsrv;
	@Inject
	private IF_joinService Jsrv;
	
	
	@RequestMapping(value = "/wrAction", method = RequestMethod.POST)
	public String wrAction(Locale locale, Model model, BoardVO bvo) throws Exception{
		
		//객체로 받을때는 파라미터 이름과 객체의 변수이름이 일치하고 getter, setter가 있어야한다.
		System.out.println(bvo.getName()+"디버깅용도");
		bsrv.insertOne(bvo);
		return "home";
	}
	
	@RequestMapping(value = "/wrForm", method = RequestMethod.GET)
	public String wrAction1(Locale locale, Model model, BoardVO bvo) {
		
		//객체로 받을때는 파라미터 이름과 객체의 변수이름이 일치하고 getter, setter가 있어야한다.
	
	
		return "wrForm";
	}
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm(Locale locale, Model model) throws Exception{
		
		//객체로 받을때는 파라미터 이름과 객체의 변수이름이 일치하고 getter, setter가 있어야한다.
	
		return "joinForm";
	}
	@RequestMapping(value = "/joinAction", method = RequestMethod.POST)
	public String joinAction(Locale locale, Model model, JoinVO jvo) throws Exception{
		
		//객체로 받을때는 파라미터 이름과 객체의 변수이름이 일치하고 getter, setter가 있어야한다.
		System.out.println(jvo.getName().length()+"디버깅용도-----------");
		System.out.println(jvo.getId().length()+"디버깅용도-----------");
		Jsrv.joinOne(jvo);	
		return "home";
	}
	
	

}
