package com.fornula.domain.member.dto;
/*
이름              널?       유형             
--------------- -------- -------------- 
REVIEW_IDX      NOT NULL NUMBER         
PURCHASE_IDX    NOT NULL NUMBER         
MEMBER_IDX      NOT NULL NUMBER         
SCORE           NOT NULL NUMBER         
CONTENT                  VARCHAR2(2000) 
REVIEW_DATE     NOT NULL DATE           
REVIEW_STATUS   NOT NULL NUMBER         
REVIEWFILE_NAME          VARCHAR2(100)  
ANSWER_CONTENT           VARCHAR2(2000) 
ANSWER_DATE              DATE       
 */

import lombok.Data;

@Data
public class Review {
	private int reviewIdx;
	private int purchaseIdx;
	private int memberIdx;
	private int score;
	private String content;
	private String reviewDate;
	private int reviewStatus;
	private String reviewfileName;
	private String answerContent;
	private String answerDate;
}
