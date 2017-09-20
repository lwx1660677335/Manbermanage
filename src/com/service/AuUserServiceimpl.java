package com.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.AuUserMapper;
import com.model.AuUser;

@Service
@Transactional
public class AuUserServiceimpl implements AuUserService {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<AuUser> selectall() {
		// TODO Auto-generated method stub
		List<AuUser> list=sqlSessionTemplate.selectList("selectall");
		return list;
	}

	@Override
	public int login(Map<String, String> map) {
		// TODO Auto-generated method stub
		int number=sqlSessionTemplate.selectOne("login", map);
		return number;
	}

	


}
