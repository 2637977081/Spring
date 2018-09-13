package com.spring.transaction.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class UserJdbcTemplate{

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	private PlatformTransactionManager ptm;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void setTransactionManager(PlatformTransactionManager ptm){
		this.ptm = ptm;
	}
	
	public void update(int id){
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = ptm.getTransaction(def);
		try {
			String sql = "insert into user(id,username,password) values("+id+",'lg','123456')";
			System.out.println("sql执行:"+sql);
			jdbcTemplate.update(sql);
			
			sql = "insert into user(id,username,password) values("+(id-1)+",'zdj','123456')";
			System.out.println("sql执行:"+sql);
			jdbcTemplate.update(sql);
			
			sql = "update user set username='zh' where id = 2";
			System.out.println("sql执行:"+sql);
			jdbcTemplate.update(sql);
			
			ptm.commit(status);
		} catch (DataAccessException e) {
			System.out.println("回滚");
			ptm.rollback(status);
			e.printStackTrace();
		}
	}
	
	public List<UserPO> queryAll(){
		String sql = "select * from user";
		List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);
		List<UserPO> list = new ArrayList();
		for (int i = 0; i < mapList.size(); i++) {
			UserPO user = new UserPO();
			user.setId((Integer)mapList.get(i).get("id"));
			user.setUsername(mapList.get(i).get("username").toString());
			user.setPassword(mapList.get(i).get("password").toString());
			list.add(user);
		}
		return list;
	}
}
