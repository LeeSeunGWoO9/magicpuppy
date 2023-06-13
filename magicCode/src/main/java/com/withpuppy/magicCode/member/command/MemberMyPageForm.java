package com.withpuppy.magicCode.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.withpuppy.magicCode.common.Command;

public class MemberMyPageForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 마이페이지 폼 호출
		return "member/memberMyPage";
	}

}
