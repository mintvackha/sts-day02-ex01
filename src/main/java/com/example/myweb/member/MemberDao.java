package com.example.myweb.member;

import java.util.List;

public interface MemberDao {

	//멤버 목록 구현 static
	List<MemberDto> selectAll();

	//상세보기 저장 수정 삭제 기능구현
	MemberDto findById(MemberDto dto);

	void insert(MemberDto dto);

	void update(MemberDto dto);

	void delete(MemberDto dto);

}