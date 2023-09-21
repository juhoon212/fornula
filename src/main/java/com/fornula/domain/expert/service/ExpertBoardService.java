package com.fornula.domain.expert.service;

import java.util.Map;

public interface ExpertBoardService {
	Map<String, Object> getBoardList(int pageNum, int expertIdx);
	int getItemCount();
}
