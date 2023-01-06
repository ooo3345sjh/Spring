package kr.co.ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.User4Service;
import kr.co.ch05.vo.UserVO;

@Controller
public class User4Controller {
	
	@Autowired
	private User4Service service;
	
	@GetMapping("/user4/list")
	public String list(Model model) {
		List<UserVO> users = service.selectUser4s();
		model.addAttribute("users", users);
		model.addAttribute("type", "user4");
		return "/user/list";
	}
	
	@GetMapping("/user4/register")
	public String register() {
		return "/user/register";
	}
	
	@PostMapping("/user4/register")
	public String register(UserVO vo) {
		service.insertUser4(vo);
		return "/user/register";
	}
	
	@GetMapping("/user4/modify")
	public String modify(String seq, Model model) {
		UserVO user = service.selectUser4(seq);
		model.addAttribute("user", user);
		return "/user/modify";
	}
	@PostMapping("/user4/modify")
	public String modify(UserVO vo) {
		service.updateUser4(vo);
		return "redirect:/user/list?type=user4";
	}
	@GetMapping("/user4/delete")
	public String modify(String seq) {
		service.deleteUser4(seq);
		return "redirect:/user/list?type=user4";
	}
}