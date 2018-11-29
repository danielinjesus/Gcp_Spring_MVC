package com.bob.please.member.dao;

import java.util.List;

import com.bob.please.member.dto.MemberDto;
/*
 *  MemberDaoImpl 클래스가 구현할 인터페이스 미리 정의하기 
 */
public interface MemberDao {
	public void insert(MemberDto dto);
	public void update(MemberDto dto);
	public void delete(int num);
	public MemberDto getData(int num);
	public List<MemberDto> getList();
}
















