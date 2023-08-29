package com.fornula.domain.member.service;

import com.fornula.domain.item.dto.Category;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;

public interface MypageInfoService {
	Member mypageInfoService(String id);
	void modifyEmail(String id, String email );
	Category mypageCategoryOne(int categoryOne);
	Category mypageCategoryTwo(int categoryTwo);
	Category mypageCategoryThree(int categoryThree);
	
}
