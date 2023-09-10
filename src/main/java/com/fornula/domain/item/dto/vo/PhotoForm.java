package com.fornula.domain.item.dto.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhotoForm {
	private int itemIdx;
	@NotEmpty(message="파일 이름을 작성해 주세요")
	@Size(max=30, message="30글자 이내의 영문으로 작성해 주세요")
	@Pattern(regexp="^[a-zA-Z0-9_\\-\\s]*$", message="영문, 숫자, 띄어쓰기, '_', '-'만 입력 가능합니다.")
	private String itemFileName;
}
