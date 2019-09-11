package com.nobinwebapp.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("home")
	public ModelAndView home(Alien al) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", al);
		mv.setViewName("home");
		return mv;
	}
}
