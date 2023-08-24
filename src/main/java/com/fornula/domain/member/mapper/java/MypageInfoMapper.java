package com.fornula.domain.member.mapper.java;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;

public interface MypageInfoMapper {
   int updateMypageInfo(@Param("One") int One,@Param("Two")int Two,@Param("Three")int Three,@Param("id")String id);
   Member selectMypagePassword(String id);
}
