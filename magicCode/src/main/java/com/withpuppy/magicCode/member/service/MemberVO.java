package com.withpuppy.magicCode.member.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	private String memberId; 
	private String memberNick;
	private String memberPw;
	private String memberName;
	private String memberTel;
	private String memberAddr;
	private String memberAuth;
}