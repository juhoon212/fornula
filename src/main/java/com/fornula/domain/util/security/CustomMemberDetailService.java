package com.fornula.domain.util.security;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.repository.MemberSecurityRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomMemberDetailService implements UserDetailsService{
	
	private final MemberSecurityRepository memberSecurityRepository;
	
	// 매개변수로 아이디를 전달받아 회원정보를 검색하여 UserDetails 객체로 반환
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	
		List<Member> findMemberList = memberSecurityRepository.findSecurityMemberById(username);
		Member findMember = findMemberList.stream()
				.findAny().orElseThrow(() -> new UsernameNotFoundException(username));
		
		return new CustomMemberDetails(findMember);
	}

}
