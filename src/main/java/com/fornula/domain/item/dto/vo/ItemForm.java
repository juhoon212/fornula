package com.fornula.domain.item.dto.vo;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
	
	@NotNull
	private int expertIdx;
	
	@NotNull
	private int categoryIdx;
	
	@NotEmpty
	private String itemName;
	
	@Size(min = 10, message = "10자 이상 입력하세요")
	private String itemContent;
	
	@Min(value = 1000, message = "1000원 이상을 입력하세요")
	@Max(value = 1000000000, message = "가격 제한선을 넘었습니다.")
	private int price;
}
