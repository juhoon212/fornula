package com.fornula.domain.expert.repository;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.expertboard.ExpertItemPhoto;
import com.fornula.domain.item.dto.Item;

public interface ExpertInputDAO {
	int updateExpert(Expert expert);
	List<Item> selectExpertItemList(Map<String, Object> map);
	int insertExpertInfo(Expert expert);
	int selectExpertBoardCount();
}
