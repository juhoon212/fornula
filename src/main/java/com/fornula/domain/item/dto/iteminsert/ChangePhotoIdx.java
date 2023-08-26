package com.fornula.domain.item.dto.iteminsert;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChangePhotoIdx {
	private int photoIdx; // ITEM 테이블의 임시 사진번호
	private int newPhotoIdx; // ITEM 테이블에 입력될 진짜 사진번호 
}
