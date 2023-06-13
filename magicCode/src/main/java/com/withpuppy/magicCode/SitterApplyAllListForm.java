package com.withpuppy.magicCode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.withpuppy.magicCode.common.Command;

public class SitterApplyAllListForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 마이 펫 돌보미 전체 신청 현황 폼 호출
		return "member/sitterApplyAllList";
	}

}
