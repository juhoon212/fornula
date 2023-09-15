package com.fornula.domain.item.dto.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemForm {
    
	private int expertIdx;
    private int categoryIdx;
    
    @NotEmpty(message="상품 이름은 무조건 입력하세요")   
    @Size(max = 30, message = "30 글자 이상 입력할 수 없습니다.")
    private String itemName;
    
    private String itemContent;
    
    @Positive(message="1원 이상의 가격을 입력해주세요")
    private int price;
} 