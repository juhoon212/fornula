package com.fornula.domain.item.dto.vo;

import javax.validation.constraints.Size;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemForm {
    private int expertIdx;
    private int categoryIdx;
    
    @Size(max = 30, message = "30 글자 이상 입력할 수 없습니다.")
    private String itemName;
    
    private String itemContent;
    
    @NotNull(message = "가격은 1 원 이상이어야만 합니다")
    private Integer price;
}

