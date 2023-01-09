package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.UserVO;

@Repository
public class UserDAO {
	
	private SqlSessionTemplate mybatis;
	
	// @Autowired (생성자 주입시 생략 가능)
	public UserDAO(SqlSessionTemplate mybatis){
		this.mybatis = mybatis;
	}
	
	public List<UserVO> selectUser(String uidOrSeq, String type) {
		return  mybatis.selectList(type + ".selectUser", uidOrSeq);
	}
	
	public List<UserVO> selectUsers(String type) {
		return mybatis.selectList(type + ".selectUsers");
	}
	public void insertUser(UserVO vo, String type) {
		mybatis.insert(type + ".insertUser", vo);
	}
	public void updateUser(UserVO vo, String type) {
		mybatis.update(type + ".updateUser", vo);
	}
	public void deleteUser(String uidOrSeq, String type) {
		mybatis.delete(type + ".deleteUser", uidOrSeq);
	}

}
