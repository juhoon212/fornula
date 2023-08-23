package com.fornula.domain.member.repository;

import com.fornula.domain.member.dto.mypage.InfoCategory;

public interface MypageInfoRepository {
	int updateMypageInfo(InfoCategory category);
}
