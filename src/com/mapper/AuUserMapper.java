package com.mapper;

import java.util.List;
import java.util.Map;

import com.model.AuUser;

public interface AuUserMapper {
	public List<AuUser> selectall();
	public int login(Map<String, String> map);
}
