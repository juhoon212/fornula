package com.fornula.domain.item.dto.vo;



import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
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
	@NotEmpty(message="잘못된 접근입니다 다시 진행해주세요")
	private int expertIdx;
	@NotEmpty(message="카테고리를 입력 후 진행해주세요")
	private int categoryIdx;
	@NotEmpty(message="상품 이름을 반드시 입력해주세요")
	@Size(max = 30, message = "30 글자 이상 입력할 수 없습니다.")
	private String itemName;
	@NotEmpty(message="상품 등록 시 내용은 반드시 입력해주세요")
	@Size(max = 500, message = "800 글자 이상 입력할 수 없습니다.")
	private String itemContent;
	@NotEmpty(message="가격은 반드시 1 이상의 숫자로 입력해 주세요")
	@Pattern(regexp = "^[1-9]+$", message = "화폐단위는 생략하고 1 이상의 숫자만 입력해주세요")
	private int price;
}
