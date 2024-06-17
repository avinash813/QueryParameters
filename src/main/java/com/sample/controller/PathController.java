package com.sample.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathController 
{

	//localhost:8486/myapp/getmessage?name=Bob&course=SpringBoot
		@GetMapping("/getmessage")
		public String displayMessage(@RequestParam("name")String name, 
				@RequestParam("course")String course, Map<String, Object> model)
		{
			String msg="Hello! "+name +" I hope you're enjoying the course "+ course ;
			model.put("msg", msg);
			return "index";
}
		
		
		//localhost:8486/myapp/getmessage?name=Bob&course=SpringBoot
//		@GetMapping("/getmessage")
//		public ModelAndView displayMessage(@RequestParam("name")String name, 
//				@RequestParam("course")String course, ModelAndView mv)
//		{
//			
//			String msg="Hello! "+name +" I hope you're enjoying the course "+ course ;
//			mv.addObject("msg", msg);
//			mv.setViewName("index");
//			return mv;
//}
}
