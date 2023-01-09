package kr.co.ch05.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.MemberService;
import kr.co.ch05.vo.MemberVO;

@Controller
public class MemberController {
	
	private MemberService service;
	
	// @Autowired (생성자 주입시 생략 가능)
	public MemberController(MemberService service) {
		this.service = service;
	}
	
	@GetMapping("/member/list")
	public void list(Model model) {   
		List<MemberVO> members = service.selectMembers(); // 전체 User를 조회하는 서비스
		model.addAttribute("members", members);
	}
	
	@GetMapping("/member/register")
	public void register() {}
	
	@PostMapping("/member/register")
	public void register(MemberVO vo) {
		service.insertMember(vo);
	}
	
	@GetMapping("/member/modify")
	public void modify(Model model, String uid) {
		model.addAttribute("member", service.selectMember(uid));
	}
	
	@PostMapping("/member/modify")
	public String modify(MemberVO vo) {
		service.updateMember(vo);
		return "redirect:/member/list";
	}
	
	@GetMapping("/member/delete")
	public String modify(String uid) {
		service.deleteMember(uid);
		return "redirect:/member/list";
	}
	
}