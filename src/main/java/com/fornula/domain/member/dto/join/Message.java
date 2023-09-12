package com.fornula.domain.member.dto.join;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor

// Message용 DTO

public class Message { 
	
	private String message;
	
	public Message(String message) {
		this.message = message;
	}
	
	
}
