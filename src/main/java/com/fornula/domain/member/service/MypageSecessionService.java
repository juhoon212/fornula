package com.fornula.domain.member.service;

import com.fornula.domain.exception.custom.MypageIdExcepion;
import com.fornula.domain.member.dto.Member;

public interface MypageSecessionService{
  Member mypageSecession(String id) throws MypageIdExcepion;
}
