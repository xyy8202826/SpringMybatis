package com.xyy.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyy.mybatis.model.TUser;
import com.xyy.mybatis.service.TUserService;

@RestController
public class App {
	@Autowired
	private TUserService tUserService;
	@RequestMapping("/user/{id}")
	public TUser getUser(@PathVariable("id") Integer id) {
		return tUserService.getUserById(id);
	}
}
