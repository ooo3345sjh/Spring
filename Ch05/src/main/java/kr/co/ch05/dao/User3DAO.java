package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.UserVO;

@Repository
public class User3DAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public UserVO selectUser3(String uid) {
		return  mybatis.selectOne("user3.selectUser3", uid);
	}
	
	public List<UserVO> selectUser3s() {
		return mybatis.selectList("user3.selectUser3s");
	}
	public void insertUser3(UserVO vo) {
		mybatis.insert("user3.insertUser3", vo);
	}
	public void updateUser3(UserVO vo) {
		mybatis.update("user3.updateUser3", vo);
	}
	public void deleteUser3(String uid) {
		mybatis.delete("user3.deleteUser3", uid);
	}

}
