package com.fornula.domain.util.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CustomMemberDetails implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	
	// 인증된 멤버객체 정보
	private int memberIdx;
	private String id;
	private String password;
	private String email;
	private String memberDate;
	private int memberStatus;
	private String memberFileName;
	private String loginDate;
	private int categoryOne; // 카테고리 1,2,3 추가
	private int categoryTwo;
	private int categoryThree;
	private String enabled;
	private List<GrantedAuthority> memberAuthList;
	
	// 생성자에 멤버 객체 정보 주입
	public CustomMemberDetails(Member member) {
		this.memberIdx = member.getMemberIdx();
		this.id = member.getId();
		this.password = member.getPassword();
		this.email = member.getEmail();
		this.memberDate = member.getEmail();
		this.memberStatus = member.getMemberStatus();
		this.memberFileName = member.getMemberFileName();
		this.loginDate = member.getLoginDate();
		this.categoryOne = member.getCategoryOne();
		this.categoryTwo = member.getCategoryTwo();
		this.categoryThree = member.getCategoryThree();
		this.enabled = member.getEnabled();
		this.memberAuthList = new ArrayList<>();
		
		for (Auth auth : member.getMemberAuthList()) {
			memberAuthList.add(new SimpleGrantedAuthority(auth.getRole()));
		}
		
	}
	
	// 인증 사용자의 권한 정보를 반환하는 메소드
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return memberAuthList;
	}

	@Override
	public String getUsername() {
		return id;
	}

	// 인증 사용자의 식별자를 반환하는 메소드
	// => false : 사용자 유효기간 초과 상태, true : 사용자 유효기간 미만 상태 
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	//인증 사용자의 사용자 잠금 상태 정보를 반환하는 메소드
	// => false : 사용자 잠금 상태, true : 사용자 해제 상태    
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	// 인증 사용자의 비밀번호 유횩기간 상태 정보를 반환하는 메소드
	// => false : 비밀번호 유효기간 초과 상태 , true : 비밀번호 유효기간 미만 상태
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	// 인증 사용자의 활성화 상태 정보를 반환하는 메소드
	// => false : 사용자 비활성화 상태, true : 사용자 비활성화 상태
	@Override
	public boolean isEnabled() {
		
		if(enabled.equals("0")) {
			return false;
		} else {
			return true;
		}
	}
}
