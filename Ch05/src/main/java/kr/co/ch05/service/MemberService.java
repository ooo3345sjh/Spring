package kr.co.ch05.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kr.co.ch05.dao.MemberDAO;
import kr.co.ch05.vo.MemberVO;

@Service
public class MemberService {
	
	private MemberDAO dao;
	
	// @Autowired (생성자 주입시 생략 가능)
	public MemberService(MemberDAO dao){
		this.dao = dao;
	}
	
	public MemberVO selectMember(String uid) {
		MemberVO vo = dao.selectMember(uid);
		vo = convertDep(vo);
		return vo;
	}
	
	public List<MemberVO> selectMembers() {
		List<MemberVO> member = dao.selectMembers();
		
		// converDep 메서드를 통해 depStr필드 값을 저장한뒤 List<MemberVo>를 반환하는 로직
		member = member.stream()
		.map(vo -> convertDep(vo)).collect(Collectors.toList());
		
		return member;
	}
	
	public void insertMember(MemberVO vo) {
		dao.insertMember(vo);
	}
	
	public void updateMember(MemberVO vo) {
		dao.updateMember(vo);
	}
	
	public void deleteMember(String uid) {
		dao.deleteMember(uid);
	}

	
	// int dep의 값을 통해 한글로 변환시켜서 depStr필드에 저장하는 메서드
	private MemberVO convertDep(MemberVO vo) {
		int dep = vo.getDep();
		
		switch (dep) {
			case 101: vo.setDepStr("인사부"); break;
			case 102: vo.setDepStr("영업부"); break;
			case 103: vo.setDepStr("영업지원부"); break;
			case 104: vo.setDepStr("기획부"); break;
			case 105: vo.setDepStr("재정부"); break;
		}
		
		return vo;
	}
}
