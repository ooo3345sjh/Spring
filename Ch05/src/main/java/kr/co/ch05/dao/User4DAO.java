package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.UserVO;

@Repository
public class User4DAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public UserVO selectUser4(String seq) {
		return  mybatis.selectOne("user4.selectUser4", seq);
	}
	
	public List<UserVO> selectUser4s() {
		return mybatis.selectList("user4.selectUser4s");
	}
	public void insertUser4(UserVO vo) {
		mybatis.insert("user4.insertUser4", vo);
	}
	public void updateUser4(UserVO vo) {
		mybatis.update("user4.updateUser4", vo);
	}
	public void deleteUser4(String seq) {
		mybatis.delete("user4.deleteUser4", seq);
	}

}
