package com.nobinwebapp.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	@RequestMapping("home")
	public String home(/* HttpServletRequest req */String name, HttpSession session) {
		
		//HttpSession session = req.getSession();
		//String name = req.getParameter("name");
		System.out.println("Hi " + name);
		session.setAttribute("name", name);
		return "home";
	}
}
