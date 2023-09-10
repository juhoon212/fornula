package com.fornula.domain.item.dto.vo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ItemForm {
    private int expertIdx;
    
    @Min(value = 1, message = "카테고리를 다시 선택해주세요")
    @Max(value = 10, message = "카테고리를 다시 선택해주세요")
    private int categoryIdx;
    
    @Size(max = 30, message = "30 글자 이상 입력할 수 없습니다.")
    private String itemName;
    
    @Size(max = 500, message = "500 글자 이상 입력할 수 없습니다.")
    private String itemContent;
    
    @Min(value = 1, message = "1 이상의 값이어야 합니다.")
    private int price;
}

