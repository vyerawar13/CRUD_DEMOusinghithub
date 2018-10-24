package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Login;
import com.model.User;
import com.serviceinterface.serviceinterface;

@Controller
public class homeController
{
	@Autowired
	serviceinterface service;
	@RequestMapping("/")
	public String loginpage()
	{
		System.out.println("login page");
		return "login";
	}

	@RequestMapping("/register")
	public String registerpage()
	{
		System.out.println("register page");
		return "register";
	}

	@RequestMapping("/save")
	public String savedata(@ModelAttribute Login l, @ModelAttribute User u, Model model)
	{
		
		System.out.println("save controller");
		l.setUser(u);
		u.setLogin(l);
		Login l1=service.savedata(l);
		if(l1!=null)
		{
			model.addAttribute("msg", "data register successfully");
		return "login";
		}
		else
		{
		return "register";
		}
	}
	@RequestMapping("/log")
	public String Logindata(@ModelAttribute Login l, Model model)
	{
		System.out.println("login cntroller");
		List<Login> l1=service.login(l);
		System.out.println(l1);
		if(l1!=null)
		{
			model.addAttribute("data", l1);
		    return "succeess";
		}
		else
		{
			model.addAttribute("msg", "Login Unsuccessfully");
		return "login";
		}
	}
	@RequestMapping("/del")
	public String deletedata(@ModelAttribute Login l, @ModelAttribute User u, Model model)
	{
		List<Login> l1=service.delete(l.getLid());
		model.addAttribute("data", l1);
		return "succeess";
	}
	
	@RequestMapping("/edit")
	public String editData(@ModelAttribute Login l, @ModelAttribute User u, Model model) 
	{
		Login l1=service.edit(l.getLid());
		model.addAttribute("udata", l1);
		return "edit";
	}
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Login l, @ModelAttribute User u, Model model) 
	{
		l.setUser(u);
		List<Login> l1=service.update(l);
		System.out.println(l1);
		model.addAttribute("data", l1);
		return "succeess";
		
	}
	
}
