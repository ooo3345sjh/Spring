package kr.co.ch05.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.ch05.service.User1Service;
import kr.co.ch05.utlis.GetFlishMapData;
import kr.co.ch05.vo.UserVO;

@Controller
public class User1Controller {
	
	@Autowired
	private User1Service service;
	
	@GetMapping("/user1/list")
	public String list(Model model) {
		List<UserVO> users = service.selectUser1s();
		model.addAttribute("users", users);
		model.addAttribute("type", "user1");
		
		return "/user/list";
	}
	
	@RequestMapping("/user1/register")
	public String register(Model model, String type, HttpServletRequest req) {
		
		// redirect시에 저장된 값을 가져오는 API
		UserVO vo = GetFlishMapData.flishMapData(req);
		
		model.addAttribute("type", type);
		model.addAttribute(vo);
		
		return "/user/register";
	}

	
	
	
	@GetMapping("/user1/modify")
	public String modify(String uid, Model model) {
		UserVO user = service.selectUser1(uid);
		model.addAttribute("user", user);
		return "/user/modify";
	}
	
	@PostMapping("/user1/modify")
	public String modify(UserVO vo) {
		service.updateUser1(vo);
		return "redirect:/user/list?type=user1";
	}
	
	@GetMapping("/user1/delete")
	public String modify(String uid) {
		service.deleteUser1(uid);
		return "redirect:/user/list?type=user1";
	}
}