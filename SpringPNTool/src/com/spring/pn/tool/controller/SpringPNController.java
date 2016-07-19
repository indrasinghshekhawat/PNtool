package com.spring.pn.tool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.pn.tool.dao.TaskDao;

import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class SpringPNController{
	
	@Autowired
	TaskDao taskDao;
 
   @RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) throws Exception{
      String str = taskDao.getTaskData();
      model.addAttribute("message", "Hello Database Connection");
      taskDao.getTaskAttributeData();
      return "hello";
   }
   
}
