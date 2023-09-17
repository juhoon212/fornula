package com.fornula.domain.expert.repository;

import java.util.List;
import java.util.Map;

import com.fornula.domain.item.dto.itemdetail.ItemPhotoForExpert;

public interface ExpertBoardDAO {
	List<ItemPhotoForExpert> selectBoardList(Map<String, Object> map);
	int selectItemCount();
}
