package com.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Controller
public class AdminController {

	@Autowired
	public UserService userService;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView showUser(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("admin");
		// Read Users from SQL & pass list of users to view
		List<User> users = userService.getUsers();
		mav.addObject("users", users);

		return mav;
	}

	@RequestMapping(value = "/delete/{username}", method = RequestMethod.GET)
	public ModelAndView deleteUser(@PathVariable String username, HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("user") User user) {

		ModelAndView mav = new ModelAndView("delete");

		boolean deletedUser = userService.deleteUser(username);
		String msg = "User Deletion Failed!";
		if (deletedUser) {
			msg = "User Deleted Successfully!";
		}
		mav.addObject("msg", msg);

		return mav;
	}

	@RequestMapping(value = "/edit/{username}", method = RequestMethod.GET)
	public ModelAndView editUser(@PathVariable("username") String username, HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("user") User user) {

		System.out.println("In first edit ");
		ModelAndView mav = new ModelAndView("edit");

		return mav;
	}

	@RequestMapping(value = "/edit/edit/edit-user", method = RequestMethod.POST)
	public @ResponseBody ModelAndView saveUser(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("user") User user) {
		userService.editUser(user);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/admin");
	}

}
