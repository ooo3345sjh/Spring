package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.UserVO;

@Repository
public class User2DAO {
	
	@Autowired
	private SqlSessionTemplate myBatis;
	
	public void insertUser2(UserVO vo) {
		myBatis.insert("user2.insertUser2", vo);
	}
	
	public UserVO selectUser2(String uid) {
		return myBatis.selectOne("user2.selectUser2", uid);
	}
	
	public List<UserVO> selectUser2s() {
		return myBatis.selectList("user2.selectUser2s");
	}
	
	public void updateUser2(UserVO vo) {
		myBatis.update("user2.updateUser2", vo);
	}
	
	public void deleteUser2(String uid) {
		myBatis.delete("user2.deleteUser2", uid);
	}

}
