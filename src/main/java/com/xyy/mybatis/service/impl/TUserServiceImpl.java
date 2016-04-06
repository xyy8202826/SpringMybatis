package com.xyy.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyy.mybatis.mapper.TUserMapper;
import com.xyy.mybatis.model.TUser;
import com.xyy.mybatis.model.TUserExample;
import com.xyy.mybatis.service.TUserService;

@Service
public class TUserServiceImpl implements TUserService {
	@Autowired
	private TUserMapper mapper;
	@Override
	@Transactional(readOnly=true)//readOnly=true可以被外面事务重写 {@link App#getUser}
	public TUser getUserById(Integer id) {
		TUser user=mapper.selectByPrimaryKey(id);
		user.setAge(user.getAge()+1);
		mapper.updateByPrimaryKey(user);
		return user;
	}
	@Override
	@Transactional
	public List<TUser> getUserByName(String name) {
		TUserExample example=new TUserExample();
		example.createCriteria().andNameLike("%"+name+"%");
		return mapper.selectByExampleWithBLOBs(example);
	}

}
