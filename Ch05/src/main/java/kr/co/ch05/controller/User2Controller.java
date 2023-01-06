package kr.co.ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.User2Service;
import kr.co.ch05.vo.UserVO;

@Controller
public class User2Controller {
	
	@Autowired
	private User2Service service;
	
	@GetMapping("/user2/list")
	public String list(Model model) {
		List<UserVO> users = service.selectUser2s();
		model.addAttribute("users", users);
		model.addAttribute("type", "user2");
		
		return "/user/list";
	}
	
	@GetMapping("/user2/register")
	public String register() {
		return "/user/register";
	}
	
	@PostMapping("/user2/register")
	public String register(UserVO vo) {
		service.insertUser2(vo);
		
		return "/user/register";
	}
	
	@GetMapping("/user2/modify")
	public String modify(String uid, Model model) {
		UserVO user = service.selectUser2(uid);
		model.addAttribute("user", user);
		
		return "/user2/modify";
	}
	@PostMapping("/user2/modify")
	public String modify(UserVO vo) {
		service.updateUser2(vo);
		return "redirect:/user2/list?type=user2";
	}
	@GetMapping("/user2/delete")
	public String modify(String uid) {
		service.deleteUser2(uid);
		return "redirect:/user2/list?type=user2";
	}
}