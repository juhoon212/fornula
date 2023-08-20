package com.fornula.domain.member.mapper.java;

import com.fornula.domain.member.dto.Member;

public interface MypageSecessionMapper {
   int updateMypageSecession(String id);
   Member selectMypageSecession(String id);
}
