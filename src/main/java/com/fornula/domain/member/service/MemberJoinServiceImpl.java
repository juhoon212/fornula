package com.fornula.domain.member.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Category;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.repository.MemberJoinRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberJoinServiceImpl implements MemberJoinService{
	
	private final MemberJoinRepository memberJoinRepository;

	@Override
	public Member idCheck(String id) {
		Optional<Member> optionalFindMember = memberJoinRepository.idCheck(id);
		Member findMember = optionalFindMember.orElse(null);
		
		return findMember;
	}

	@Override
	public int joinMember(Member member) {
		
		String hashpw = BCrypt.hashpw(member.getPassword(), BCrypt.gensalt()); // 암호화
		member.setPassword(hashpw);
		
		int result = memberJoinRepository.joinMember(member);
		
		return result;
	}

	@Override
	public List<Integer> selectCategory(List<String> categoryList) {
		
		List<Integer> returnCategoryList = new ArrayList<>();
		
		for (String category : categoryList) {
			Category selectCategory = memberJoinRepository.selectCategory(category);
			returnCategoryList.add(selectCategory.getCategoryIdx()); // 관심사 1,2,3 호출 후 반환 값을 list에 저장
		}
		
		return returnCategoryList;
	}
	
	

	
	
	
	

	
	
	
}
