package com.bionime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bionime.pojo.User;
import com.bionime.service.UserService;
import com.bionime.utils.SystemResult;



/**
 * 
 * <p>Title: UserController</p>
 * <p>Description: </p>
 * <p>Company: www.bionime.com</p> 
 * @author	Ethan.Shao
 * @date	2019年7月11日下午3:30:55
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public void insert(@RequestBody User user) {
		userService.insert(user);
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public SystemResult login(@RequestBody User user) {
		SystemResult result = userService.login(user);
		return result;
	}
}
