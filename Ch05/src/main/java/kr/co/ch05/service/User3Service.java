package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.User3DAO;
import kr.co.ch05.vo.UserVO;

@Service
public class User3Service {
	
	@Autowired
	private User3DAO dao;
	
	public UserVO selectUser3(String uid) {
		return  dao.selectUser3(uid);
	}
	
	public List<UserVO> selectUser3s() {
		return dao.selectUser3s();
	}
	public void insertUser3(UserVO vo) {
		dao.insertUser3(vo);
	}
	public void updateUser3(UserVO vo) {
		dao.updateUser3(vo);
	}
	public void deleteUser3(String uid) {
		dao.deleteUser3(uid);
	}

}
