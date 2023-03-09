package com.BikkadIT.SendingDataFromUIToController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WecomeController {
	
	@GetMapping("/welcomeMsg")
	public String welcomeMsg(@RequestParam String name, Model model) {
		
		String msg= "Hii "+name+" Welcome to BikkadIT";
		System.out.println(msg);
		
		model.addAttribute("MSG", msg);
		return "welcome";
	}

}
