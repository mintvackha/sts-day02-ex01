package com.example.myweb.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	
	//멤버 목록 구현 static
	public static final List<MemberDto> memberList;
	static {
		memberList=new ArrayList<MemberDto>();
		memberList.add(new MemberDto("hong", "1234", "관리자", "Admin"));
		memberList.add(new MemberDto("user1", "5678", "홍길동", "User"));
		memberList.add(new MemberDto("user2", "9012", "김길동", "User"));
		memberList.add(new MemberDto("user3", "3456", "이길한", "User"));
		memberList.add(new MemberDto("user4", "7890", "강한별", "User"));
		
	}
	
	public static List<MemberDto> selectAll(){
		System.out.println("selectAll() 실행");
		
		return memberList;
		
	}
	
	//상세보기 저장 수정 삭제 기능구현
	public MemberDto findById(MemberDto dto) {
		int idx=memberList.indexOf(dto);
		
		MemberDto member=null;
		if(idx!=-1) {
			member=memberList.get(idx);
			
		}
		return member;
		
	}
	
	public void insert(MemberDto dto) {
		
	}
	public void update(MemberDto dto) {
		
	}
	public void delete(MemberDto dto) {
		
	}

}
