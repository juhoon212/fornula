package com.fornula.domain.item.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.repository.CartRepository;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
	private final CartRepository cartRepository;
	
	@Override
	public void addCart(Cart cart) {
		cartRepository.insertCart(cart);
	}

	@Override
	public void removeCart(int itemIdx, int memberIdx) {
		cartRepository.deleteCart(itemIdx, memberIdx);
		log.info("Cart deleteMapping Service 실행 :{} ",cartRepository.deleteCart(itemIdx, memberIdx));
	}

	//장바구니 출력
	@Override
	public List<CartList> getCartList(int memberIdx) {
		return cartRepository.selectCart(memberIdx);
	}

	@Override
	public Photo getCartPhotoIdx(int itemIdx) {
		return cartRepository.selectCartPhotoidx(itemIdx);
	}

	@Override
	public Cart selectCartInfo(int memberIdx, int itemIdx) {
		return cartRepository.selectCartInfo(memberIdx, itemIdx);
	}
}
