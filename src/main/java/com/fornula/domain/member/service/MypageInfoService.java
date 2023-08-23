package com.fornula.domain.member.service;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;

public interface MypageInfoService {
	Member mypageInfoService(String id);
	void modifyPassword(int One,int Two,int Three,String id );
	
}
