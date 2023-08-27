package com.fornula.domain.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.service.ItemDetailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/item")
@RequiredArgsConstructor
@Slf4j
public class ItemDetailController {
    private final ItemDetailService itemDetailService;

    @GetMapping("/detail")
    public String detail(@RequestParam int itemIdx, Model model) {
        ItemPhoto item = itemDetailService.getItem(itemIdx);
        model.addAttribute("item", item);
        log.info("전달된 itemIdx = {}", itemIdx);
        return "item"; // 뷰 이름
    }
}
