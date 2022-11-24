package com.human.cafe;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	
		
//		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	
//	@RequestMapping(value = "/test1", method = RequestMethod.GET)
//	public String test1(Locale locale, Model model, HttpServletRequest r) {
//		String name=r.getParameter("nnn");
//		System.out.println(name);
//		
//		model.addAttribute("ssss", "hi" );
//		
//		return "ttt";
//	}
//	@RequestMapping(value = "/test2", method = RequestMethod.GET)
//	public String test1(Locale locale, Model model, @RequestParam("nnn") String name ) {
//		
//		System.out.println("어노테이션으로 받는법: "+name);
//		
//		model.addAttribute("ssss", "hi" );
//		
//		return "ttt";
//	}
}
