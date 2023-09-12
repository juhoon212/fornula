package com.fornula.domain.item.service;

import java.util.Map;

public interface SearchService {
	Map<String, Object> searchList(int pageNum);
	Map<String, Object> searchCategoryList(int pageNum);
    int getItemBoardCount();
}
