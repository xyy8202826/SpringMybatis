package com.xyy.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyy.mybatis.mapper.TUserMapper;
import com.xyy.mybatis.model.TUser;
import com.xyy.mybatis.service.TUserService;

@Service
public class TUserServiceImpl implements TUserService {
	@Autowired
	private TUserMapper mapper;
	@Override
	@Transactional
	public TUser getUserById(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

}
