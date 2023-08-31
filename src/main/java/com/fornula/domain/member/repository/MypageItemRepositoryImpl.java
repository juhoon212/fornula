package com.fornula.domain.member.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.member.dto.mypage.ItemExpert;
import com.fornula.domain.member.mapper.java.MypageItemMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MypageItemRepositoryImpl implements MypageItemRepository{

	private final SqlSession sqlSession;
	
	@Override
	public Purchase selectPurchaseMypage(int memberIdx) {
		
		return sqlSession.getMapper(MypageItemMapper.class).selectPurchaseMypage(memberIdx);
	}
	/*
	@Override
	public ItemExpert selectItemMypage(int memberIdx) {
		
		return sqlSession.getMapper(MypageItemMapper.class).selectItemMypage(memberIdx);
	}
	*/

}