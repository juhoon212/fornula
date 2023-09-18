package com.fornula.domain.item.restcontroller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.service.CartService;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CartRestController {
	private final CartService cartService;
	private final ItemDetailService itemDetailService;

	// 장바구니 삽입
	@PostMapping("/item/{itemIdx}/{pageNum}")
	public String addCart(@PathVariable int itemIdx, HttpSession session, @ModelAttribute Cart cart, Model model) {

		// 세션에서 memberIdx 추출
		Member member = (Member) session.getAttribute(SessionConst.Login_Member);
		if(member==null) {
			return "error";
		}else {
			int memberIdx = member.getMemberIdx();
		log.info("postmapping의 memberIdx:{}", memberIdx);
		log.info("postmapping의 itemIdx:{}", itemIdx);
		

		cart = new Cart();

		// photo객체를 검색하는 서비스 호출
		Photo photo = cartService.getCartPhotoIdx(itemIdx);
		int itemPhotoIdx = photo.getPhotoIdx();
		log.info("postmapping의 photo:{}", photo);
		log.info("postmapping의 itemPhotoIdx:{}", itemPhotoIdx);

		// cart 객체에 값 넣기
		cart.setItemIdx(itemIdx);
		cart.setItemPhotoIdx(itemPhotoIdx);
		cart.setMemberIdx(memberIdx);
		log.info("postmapping의 cart:{}", cart);

		// cart에 삽입하는 서비스 호출
		cartService.addCart(cart);
		return "success";
		}
	}

	// 아이템 페이지에서 장바구니 삭제
	@DeleteMapping("/item/{itemIdx}/delete")
	public String removeItemCart(@PathVariable int itemIdx, HttpSession session) {

		// 세션에서 memberIdx 추출
		Member member = (Member) session.getAttribute(SessionConst.Login_Member);
		int memberIdx = member.getMemberIdx();
		log.info("deletemapping의 memberIdx:{}", memberIdx);
		log.info("deletemapping의 itemIdx :{}", itemIdx);

		cartService.removeCart(itemIdx, memberIdx);

		return "success";
	}

	// 장바구니 목록 출력
	@GetMapping("/cartList")
	public List<CartList> getCartList(HttpSession session,
			@RequestBody CartList cart) {

		// 세션에서 memberIdx 추출
		Member member = (Member) session.getAttribute(SessionConst.Login_Member);
		int memberIdx = member.getMemberIdx();
		log.info("getmapping의 memberIdx:{}", memberIdx);

		return cartService.getCartList(memberIdx);

	}

	// 장바구니 삭제
	@DeleteMapping("/cart/{itemIdx}")
	public String removeCart(@PathVariable int itemIdx, HttpSession session) {

		// 세션에서 memberIdx 추출
		Member member = (Member) session.getAttribute(SessionConst.Login_Member);
		int memberIdx = member.getMemberIdx();
		log.info("deletemapping의 memberIdx:{}", memberIdx);

		cartService.removeCart(itemIdx, memberIdx);

		return "success";
	}
}
