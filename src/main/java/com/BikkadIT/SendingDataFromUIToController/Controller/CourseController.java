package com.BikkadIT.SendingDataFromUIToController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	
	@GetMapping("/course")
	public ModelAndView getCourseDetailes(@RequestParam String cname,@RequestParam String tname) {
		
		String msg= cname + "  new Batch is starting from 1 feb 2023 by " +tname;
		
		ModelAndView mav= new ModelAndView();
		mav.addObject("COURSE", msg);
		mav.setViewName("course");
		
		
		return mav;
		
	}
	

}
