package kr.co.ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.User3Service;
import kr.co.ch05.vo.UserVO;

@Controller
public class User3Controller {
	
	@Autowired
	private User3Service service;
	
	@GetMapping("/user3/list")
	public String list(Model model) {
		List<UserVO> users = service.selectUser3s();
		model.addAttribute("users", users);
		model.addAttribute("type", "user3");
		
		return "/user/list"; 
	}
	
	@GetMapping("/user3/register")
	public String register() {
		return "/user/register";
	}
	
	@PostMapping("/user3/register")
	public String register(UserVO vo) {
		service.insertUser3(vo);
		return "/user/register";
	}
	
	@GetMapping("/user3/modify")
	public String modify(String uid, Model model) {
		UserVO user = service.selectUser3(uid);
		model.addAttribute("user", user);
		return "/user/modify";
	}
	@PostMapping("/user3/modify")
	public String modify(UserVO vo) {
		service.updateUser3(vo);
		return "redirect:/user3/list?type=user3";
	}
	@GetMapping("/user3/delete")
	public String modify(String uid) {
		service.deleteUser3(uid);
		return "redirect:/user3/list?type=user3";
	}
}