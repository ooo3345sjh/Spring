package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.MemberVO;

@Repository
public class MemberDAO {
	
	private SqlSessionTemplate mybatis;
	
	// @Autowired (생성자 주입시 생략 가능)
	public MemberDAO(SqlSessionTemplate mybatis){
		this.mybatis = mybatis;
	}
	
	public MemberVO selectMember(String uid) {
		return  mybatis.selectOne("member.selectMember", uid);
	}
	
	public List<MemberVO> selectMembers() {
		return mybatis.selectList("member.selectMembers");
	}
	public void insertMember(MemberVO vo) {
		mybatis.insert("member.insertMember", vo);
	}
	
	public void updateMember(MemberVO vo) {
		mybatis.update("member.updateMember", vo);
	}
	public void deleteMember(String uid) {
		mybatis.delete("member.deleteMember", uid);
	}

}
