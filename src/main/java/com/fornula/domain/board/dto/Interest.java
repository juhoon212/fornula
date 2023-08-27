package com.fornula.domain.board.dto;

import lombok.Data;

/*
이름       널?       유형            
-------- -------- ------------- 
INTEREST_IDX       NOT NULL NUMBER 
CATEGORY_IDX_ONE   NOT NULL NUMBER 
CATEGORY_IDX_TWO   NOT NULL NUMBER 
CATEGORY_IDX_THREE NOT NULL NUMBER 
MEMBER_IDX         NOT NULL NUMBER 
*/

@Data
public class Interest {
     private int interestIdx;
     private int categoryIdxOne;
     private int categoryIdxTwo;
     private int categoryIdxThree;
     private int memberIdx;
   
}
