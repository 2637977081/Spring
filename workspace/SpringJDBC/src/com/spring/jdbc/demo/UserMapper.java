package com.spring.jdbc.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<UserPO>{

	@Override
	public UserPO mapRow(ResultSet rs, int rownum) throws SQLException {
		UserPO user = new UserPO();
		user.setId(rs.getInt("id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		return user;
	}
	
}
