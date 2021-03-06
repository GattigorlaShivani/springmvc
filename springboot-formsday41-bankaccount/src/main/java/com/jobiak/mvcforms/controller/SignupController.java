package com.jobiak.mvcforms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvcforms.model.User;
import com.jobiak.mvcforms.repository.UserRepository;


@Controller
public class SignupController {
	@Autowired
	UserRepository repo;

	public SignupController()
	{
	}	
	public SignupController(UserRepository repo)
	{
		this.repo = repo;
	}
	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String redirect()
	{
		return "bank";
	}
	@RequestMapping(path="/bank",method=RequestMethod.POST)
	public String doSignUp(@ModelAttribute("user") User user)
	{
		//System.out.println(user.getUserId()+user.getFirstName()+user.getEmail()+user.getEmail());
		repo.save(user);
		return "success";
	}
}
