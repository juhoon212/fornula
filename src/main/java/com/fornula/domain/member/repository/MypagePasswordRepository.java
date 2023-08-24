package com.fornula.domain.member.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.dto.Member;

public interface MypagePasswordRepository {
	 int updateMypagePassword(@Param("id") String id , @Param("password") String newPassword);
	  Member selectMypagePassword(String id);

}
