package kr.co.ch05.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.User2DAO;
import kr.co.ch05.vo.UserVO;

@Service
public class User2Service {
	
	@Autowired
	private User2DAO dao;
	
	public void insertUser2(UserVO vo) {
		dao.insertUser2(vo);
	}
	
	public UserVO selectUser2(String uid) {
		return dao.selectUser2(uid);
	}
	
	public List<UserVO> selectUser2s() {
		return dao.selectUser2s();
	}
	
	public void updateUser2(UserVO vo) {
		dao.updateUser2(vo);
	}
	
	public void deleteUser2(String uid) {
		dao.deleteUser2(uid);
	}


}
