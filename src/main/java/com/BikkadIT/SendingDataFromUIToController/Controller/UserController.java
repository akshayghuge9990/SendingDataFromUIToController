package com.BikkadIT.SendingDataFromUIToController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BikkadIT.SendingDataFromUIToController.model.User;

@Controller
public class UserController {
	
	@GetMapping("/loadForm")
	public String loadForm() {
		
		
		return "UserReg";
		
	}
	
	@GetMapping("/saveUser")
	public String saveUser(User user, Model model) {
		
		System.out.println();
		model.addAttribute("USER", user);
		
		return "userSuccess";
		
		
	}
	
	

}
