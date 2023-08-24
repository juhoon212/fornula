package com.fornula.domain.item.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.mapper.java.ItemDetailMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemDetailDAOImpl implements ItemDetailDAO {
	private final SqlSession sqlSession;
//	상품 상세페이지에서 출력할 하나의 행(상세페이지엔 상품 하나만들어가니까)을 출력하는 용도
	@Override
	public ItemPhoto selectItem(int itemIdx) {
		return sqlSession.getMapper(ItemDetailMapper.class).selectItem(itemIdx);
	}
//	상품 상세페이지에서 출력하는 전문가(판매자)의 전화번호, id 등을 출력하기 위한 용도
	@Override
	public ExpertMember selectItemExpert(int expertIdx) {
		return sqlSession.getMapper(ItemDetailMapper.class).selectItemExpert(expertIdx);
	}
}
