package com.fornula.domain.member.repository;

import java.util.List;
import java.util.Map;

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
	public List<Itempurchase> selectPurchaseMypage(Map<String, Object> map) {
		
		return sqlSession.getMapper(MypageItemMapper.class).selectPurchaseMypage(map);
	}

	@Override
	public int selectPurchaseCount() {
		
		return sqlSession.getMapper(MypageItemMapper.class).selectPurchaseCount();
	}

	


}

