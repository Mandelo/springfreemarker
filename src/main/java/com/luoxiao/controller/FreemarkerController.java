package com.luoxiao.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luoxiao.entity.User;

@Controller
public class FreemarkerController {
	@RequestMapping("/freemarker")
	public ModelAndView Add(HttpServletRequest request, HttpServletResponse response){
		User user = new User();
		user.setUsername("luoxiao");
		user.setPassword("123");
		List<User> users = new ArrayList<User>();
		users.add(user);
		return new ModelAndView("index","users",users);
	}
}
