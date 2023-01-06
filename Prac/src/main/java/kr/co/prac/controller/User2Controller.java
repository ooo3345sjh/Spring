package kr.co.prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.prac.service.User2Service;
import kr.co.prac.vo.User2VO;

@Controller
public class User2Controller {
	
	@Autowired
	private User2Service service;
	
	@GetMapping("/user2/list")
	public void list(Model model) {
		model.addAttribute("users", service.selectUser2s());
	}
	
	@GetMapping("/user2/register")
	public void register() {}
	
	@PostMapping("/user2/register")
	public void register(Model model, User2VO vo) {
		service.insertUser2(vo);
	}
	
	@GetMapping("/user2/modify")
	public void modify(Model model, String uid) {
		model.addAttribute(service.selectUser2(uid));
	}
	
	@PostMapping("/user2/modify")
	public String modify(User2VO vo) {
		service.updateUser2(vo);
		return "redirect:/user2/list";
	}
	
	@GetMapping("/user2/delete")
	public String delete(String uid) {
		service.deleteUser2(uid);
		return "redirect:/user2/list";
	}

}
