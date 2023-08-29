package com.fornula.domain.member.repository;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.item.dto.Category;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;

public interface MypageInfoRepository {
	int updateMypageInfo(@Param("id") String id ,@Param("email") String email);
	Member selectMypagePassword(String id);
	Category selectMypageCategoryOne(int categoryOne);
	Category selectMypageCategoryTwo(int categoryTwo);
	Category selectMypageCategoryThree(int categoryThree);
}
