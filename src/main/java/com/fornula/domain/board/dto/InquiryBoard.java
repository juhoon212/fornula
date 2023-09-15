package com.fornula.domain.board.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class InquiryBoard {
	
	private String boardTitle;
    private String boardContent;
    private String boardFileName;
    
}
