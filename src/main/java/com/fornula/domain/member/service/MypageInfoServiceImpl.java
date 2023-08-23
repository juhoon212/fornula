package com.fornula.domain.member.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.member.repository.MypageInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MypageInfoServiceImpl implements MypageInfoService{
	
   private final MypageInfoRepository mypageInfoRepository;


@Override
public Member mypageInfoService(InfoCategory category) {
    int update  =mypageInfoRepository.updateMypageInfo(category);
    
    
	return ;
}
   
}
