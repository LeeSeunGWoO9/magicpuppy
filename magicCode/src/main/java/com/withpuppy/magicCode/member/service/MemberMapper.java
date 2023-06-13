package com.withpuppy.magicCode.member.service;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> memberSelectList();
	MemberVO memberLogin(MemberVO vo);// 로그인
}
