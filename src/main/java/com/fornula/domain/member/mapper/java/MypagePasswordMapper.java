package com.fornula.domain.member.mapper.java;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.member.dto.Member;

public interface MypagePasswordMapper {
  int updateMypagePassword(@Param("id") String id , @Param("password") String password);
  Member selectMypagePassword(String id);
}
