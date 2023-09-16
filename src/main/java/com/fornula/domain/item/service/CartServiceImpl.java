package com.fornula.domain.item.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.repository.CartRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
	private final CartRepository cartRepository;
	
	@Override
	public void addCart(Cart cart) {
		cartRepository.insertCart(cart);
	}

	@Override
	public void removeCart(int itemIdx, int memberIdx) {
		cartRepository.delete(itemIdx, memberIdx);
	}

	@Override
	public List<CartList> getCartList(int memberIdx) {
		return cartRepository.selectCart(memberIdx);
	}

	@Override
	public Photo getCartPhotoIdx(int itemIdx) {
		return cartRepository.selectCartPhotoidx(itemIdx);
	}

}
