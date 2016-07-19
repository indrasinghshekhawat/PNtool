package com.spring.pn.tool.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TaskAttributeRowMapper implements RowMapper<TaskAttributeTO>{

	@Override
	public TaskAttributeTO mapRow(ResultSet arg0, int arg1) throws SQLException {
		
		return mapTaskAttribute(arg0);
	}
	
	private TaskAttributeTO mapTaskAttribute(ResultSet rs) throws SQLException {
		
		TaskAttributeTO taskAttributeTO = new TaskAttributeTO();
		taskAttributeTO.setTaskID(rs.getLong(1));
		taskAttributeTO.setWaID(rs.getLong(2));
		taskAttributeTO.setWpdID(rs.getLong(3));
	    
	    return taskAttributeTO;
	}
	

}
