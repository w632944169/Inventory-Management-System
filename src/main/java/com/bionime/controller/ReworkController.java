package com.bionime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bionime.pojo.Rework;
import com.bionime.service.ReworkService;



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
@RequestMapping("/rework")
public class ReworkController {
	
	@Autowired
	private ReworkService reworkService;
	
	/**
	 * rework添加
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * @param rework
	 */
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public void insert(@RequestBody Rework rework) {
		reworkService.insert(rework);
	}
}
