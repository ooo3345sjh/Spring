package kr.co.ch05.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.ch05.dao.UserDAO;
import kr.co.ch05.vo.UserVO;

@Service
public class UserService {
	
	private UserDAO dao;
	
	// @Autowired (생성자 주입시 생략 가능)
	public UserService(UserDAO dao){
		this.dao = dao;
	}
	
	public List<UserVO> selectUser(String uidOrSeq, String type) {
		return  dao.selectUser(uidOrSeq, type);
	}
	
	public List<UserVO> selectUsers(String type) {
		return dao.selectUsers(type);
	}
	public void insertUser(UserVO vo, String type) {
		dao.insertUser(vo, type);
	}
	public void updateUser(UserVO vo, String type) {
		dao.updateUser(vo, type);
	}
	public void deleteUser(String uidOrSeq, String type) {
		dao.deleteUser(uidOrSeq, type);
	}

}
