package com.fornula.domain.item.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.item.dto.Item;

public interface ItemBoardMapper {
	//여기도 List<> 안에 Item,Photo 두개의 DTO가 들어가야함;;  
	List<Item> selectItemList(Map<String, Object> map);
	//여기도 List<> 안에 Item,Category 두개의 DTO가 들어가야함;;  
	List<Item> selectCategoryItemList (Map<String, Object> map);
	//여기도 List<> 안에 Item,Photo 두개의 DTO가 들어가야함;;  
	List<Item> searchItemList (Map<String, Object> map);
}
