package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.User4DAO;
import kr.co.ch05.vo.UserVO;

@Service
public class User4Service {
	
	@Autowired
	private User4DAO dao;
	
	public UserVO selectUser4(String seq) {
		return  dao.selectUser4(seq);
	}
	
	public List<UserVO> selectUser4s() {
		return dao.selectUser4s();
	}
	public void insertUser4(UserVO vo) {
		dao.insertUser4(vo);
	}
	public void updateUser4(UserVO vo) {
		dao.updateUser4(vo);
	}
	public void deleteUser4(String seq) {
		dao.deleteUser4(seq);
	}

}
