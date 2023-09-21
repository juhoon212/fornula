package com.fornula.domain.expert.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.item.dto.itemdetail.ItemPhotoForExpert;

public interface ExpertBoardMapper {
	List<ItemPhotoForExpert> selectBoardList(Map<String, Object> map);
	int selectItemCount();
}
