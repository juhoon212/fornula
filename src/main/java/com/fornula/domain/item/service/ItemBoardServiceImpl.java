package com.fornula.domain.item.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.repository.ItemBoardDAO;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemBoardServiceImpl implements ItemBoardService{
	private final ItemBoardDAO itemBoardDAO;
//	상품 리스트(6개씩 출력되게 할거야) 출력 용도
	@Override
	public Map<String, Object> getItemList(int pageNum) {
		int totalBoard=itemBoardDAO.selectItemBoardCount();
		
		Pager pager=new Pager(pageNum, totalBoard, 5, 6);
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
	
		List<ItemPhotoCategoryCart> itemBoardList=itemBoardDAO.selectItemList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("itemBoardList", itemBoardList);
		resultMap.put("pager", pager);
		
		return resultMap;
	}
//	카테고리로 검색하는 용도 
	@Override
	public Map<String, Object> getCategoryItemList(int pageNum) {
		int totalBoard=itemBoardDAO.selectItemBoardCount();
		
		Pager pager=new Pager(pageNum, totalBoard, 5, 6);
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
	
		List<ItemPhotoCategoryCart> itemCategoryBoardList=itemBoardDAO.selectCategoryItemList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("itemCategoryBoardList", itemCategoryBoardList);
		resultMap.put("pager", pager);
		
		return resultMap;
	}
//	검색창에서 상품 검색하는 용도
    @Override
    public Map<String, Object> getSearchItemList(int pageNum, String searchKeyword) {
        int totalBoard = itemBoardDAO.selectItemBoardCount();
        
        Pager pager = new Pager(pageNum, totalBoard, 5, 6);

        Map<String, Object> pageMap = new HashMap<>();
        pageMap.put("startRow", pager.getStartRow());
        pageMap.put("endRow", pager.getEndRow());
        pageMap.put("searchKeyword", "%" + searchKeyword + "%"); // 검색어 조합

        List<ItemPhotoCategoryCart> searchItemBoardList = itemBoardDAO.searchItemList(pageMap);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("searchItemCategoryBoardList", searchItemBoardList);
        resultMap.put("pager", pager);

        return resultMap;
    }
//	관리자가 상품게시글 삭제처리(상태변경)하는 메소드임 이거 담당자가 채워놓기
	/*
	@Override
	public void modifyItem(Item item) {
		// TODO Auto-generated method stub
		
	}
	*/
    
//   상품 갯수를 검색하는 용도(상품 게시글의 갯수를 샌 다음 1,2,...,4 같은 페이지 처리에 사용할 것
    @Override
    public int getItemBoardCount() {
        return itemBoardDAO.selectItemBoardCount();
    }
}
