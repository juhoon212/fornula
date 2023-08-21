package com.fornula.domain.member.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.dto.Member;

@Repository
public interface MypagePasswordRepository {
 
  Member selectMypagePassword(String password);
}
