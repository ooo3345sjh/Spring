package kr.co.ch05.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.ch05.service.UserService;
import static kr.co.ch05.utlis.TableTag.*;
import kr.co.ch05.vo.UserVO;

@Controller
public class UserController {
	
	private UserService service;
	
	// @Autowired (생성자 주입시 생략 가능)
	public UserController(UserService service) {
		this.service = service;
	}
	
	@GetMapping("/user/list")
	public void list(Model model, String type) {        // type : 테이블명 
		List<UserVO> users = service.selectUsers(type); // 전체 User를 조회하는 서비스
		
		List<String> columnKList = getThTag(type);      // 해당 테이블의 컬럼의 한글을 가져오는 메서드 
		List<String> columnList = getTdTag(type);       // 해당 테이블의 컬럼 값을 가져오는 메서드
		
		List<List<Object>> rowList = getRowList(users, columnList); // row들의 list
		
		model.addAttribute("columnKList", columnKList);
		model.addAttribute("rowList", rowList);
		model.addAttribute("type", type);
	}
	
	@RequestMapping("/user/register")
	public void register(Model model, UserVO vo, String type) {
		
		if(vo.getName() != null) { // name가 없다면 user 등록 X
			service.insertUser(vo, type);
		}
		
		List<String> columnKList = getThTag(type);      // 해당 테이블의 컬럼의 한글을 가져오는 메서드 
		List<String> columnList = getTdTag(type);       // 해당 테이블의 컬럼 값을 가져오는 메서드
		
		model.addAttribute("type", type);
		model.addAttribute("columnKList", columnKList);
		model.addAttribute("columnList", columnList);
	}
	
	@GetMapping("/user/modify")
	public void modify(Model model, String uidOrSeq, String type) {
		List<UserVO> user = service.selectUser(uidOrSeq, type);
		
		List<String> columnKList = getThTag(type);      // 해당 테이블의 컬럼의 한글을 가져오는 메서드 
		List<String> columnList = getTdTag(type);       // 해당 테이블의 컬럼 값을 가져오는 메서드
		
		List<List<Object>> rowList = getRowList(user, columnList); // User 객체를 list로 변환
		
		model.addAttribute("columnKList", columnKList);
		model.addAttribute("columnList", columnList);
		model.addAttribute("rowList", rowList);
		model.addAttribute("type", type);
	}
	
	@PostMapping("/user/modify")
	public String modify(UserVO vo, String type) {
		service.updateUser(vo, type);
		return "redirect:/user/list?type=" + type;
	}
	
	
	@GetMapping("/user/delete")
	public String modify(String uidOrSeq, String type) {
		service.deleteUser(uidOrSeq, type);
		return "redirect:/user/list?type=" + type;
	}
	
	
	private List<List<Object>> getRowList(List<UserVO> users, List<String> columnList) { // users : 전체 유저 정보, colmnList : 테이블의 컬럼 값을 담고 있는 list
		List<List<Object>> rowList = new ArrayList<>(); // 전체 행의 정보를 담고 있는 List
		
		// 전체 user의 정보를 하나씩 가져온다. 
		for(UserVO vo : users) {
			
			List<Object> row = new ArrayList<>(); // 행의 정보를 담을 List  
			ObjectMapper om = new ObjectMapper(); // 객체 -> Map, Map -> 객체로 변환시켜주는 라이브러리
	
			@SuppressWarnings("unchecked")
			Map<String, Object> map = om.convertValue(vo, Map.class); // UserVO 객체를 Map으로 변환
			
			// map에서 column을 키값으로 해서 value를 가져와서 row에 저장한다.
			for(String column : columnList) {
				Object val = map.get(column);
				
				// 컬럼 값이 gender라면 숫자를 한글로 변환
				if("gender".equals(column)) {
					val = convertGender(val);
				}
				
				row.add(val);
			}
			
			rowList.add(row); // 행 추가
		}
		
		return rowList;
	}
	
	
	private Object convertGender(Object val) {
		
		if(val instanceof Integer) {
			Integer num = (Integer)val;
			if(num == 1) {val = "남";}
			else {val = "여";}
		}
		
		return val;
	}
}