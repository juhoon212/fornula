package com.fornula.domain.member.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.fornula.domain.member.dto.mypage.Itempurchase;
import com.fornula.domain.member.mapper.java.MypageItemMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MypageItemRepositoryImpl implements MypageItemRepository{

	private final SqlSession sqlSession;
	
	@Override
	public   List<Itempurchase> selectPurchaseMypage(int memberIdx) {
		
		return sqlSession.getMapper(MypageItemMapper.class).selectPurchaseMypage(memberIdx);
	}

	//@Override
	//public int updatePurchaseStatus(Itempurchase itempurchase) {
		
	//	return sqlSession.getMapper(MypageItemMapper.class).updatePurchaseStatus(itempurchase);
	//}


}