package com.fornula.domain.member.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Category;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.member.repository.MypageInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MypageInfoServiceImpl implements MypageInfoService{
	
   private final MypageInfoRepository mypageInfoRepository;


@Override
public Member mypageInfoService(String id) {
	
	Member mypageInfoService = mypageInfoRepository.selectMypagePassword(id);
	
	return mypageInfoService;
}


@Override
public Category mypageCategoryOne(int categoryOne) {
	
	Category mypageCategoryOne = mypageInfoRepository.selectMypageCategoryOne(categoryOne);
	
	return mypageCategoryOne;
}


@Override
public Category mypageCategoryTwo(int categoryTwo) {
	
	Category mypageCategoryTwo = mypageInfoRepository.selectMypageCategoryTwo(categoryTwo);
	
	return mypageCategoryTwo;
}


@Override
public Category mypageCategoryThree(int categoryThree) {
	
	Category mypageCategoryThree = mypageInfoRepository.selectMypageCategoryThree(categoryThree);
	
	return mypageCategoryThree;
}




@Override
public void modifyEmail(String id, String email) {
	
	mypageInfoRepository.updateMypageInfo(id, email);
	
}


   
}
