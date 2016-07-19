package com.spring.pn.tool.dao;

import java.util.List;
import javax.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class TaskDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private String selectSql;
	
	
	public String getTaskData() throws Exception{
		
		selectSql = "select * from TASK_Attribute_Map where TASK_ID = '1' ";
		
		System.out.println("Before excute() method calling");
		
		jdbcTemplate.execute(selectSql);
		
		System.out.println("After excute() method calling");
		
		return selectSql;
		
	}
	 
	public List<TaskAttributeTO> getTaskAttributeData() {
		
		selectSql = "select * from TASK_Attribute_Map";
		List<TaskAttributeTO> list = jdbcTemplate.query(selectSql, new TaskAttributeRowMapper());
		for(Object obj:list){
			System.out.println(obj);
		}
		return list;
	}

}
