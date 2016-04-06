package com.xyy.mybatis.service;

import java.util.List;

import com.xyy.mybatis.model.TUser;

public interface TUserService {
	
	public TUser getUserById(Integer id);
	
	public List<TUser> getUserByName(String name);

}
