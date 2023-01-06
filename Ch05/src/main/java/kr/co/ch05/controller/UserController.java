package kr.co.ch05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.ch05.vo.UserVO;

@Controller
public class UserController {

	@GetMapping("/user/list")
	public String list(String type) {
		return "redirect:/" + type + "/list" ;
	}
	
	@GetMapping("/user/register")
	public String register(String type) {
		return "redirect:/" + type + "/register?type=" + type;
	}
	
	
	@PostMapping("/user/register")
	public String register(RedirectAttributes redi, UserVO vo, String type) {
	
		redi.addFlashAttribute("UserVO", vo);
		
		return "redirect:/" + type + "/register?type=" + type;
	}
}
