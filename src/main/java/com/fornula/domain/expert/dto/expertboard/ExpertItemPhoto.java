package com.fornula.domain.expert.dto.expertboard;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

import lombok.Data;
@Data
public class ExpertItemPhoto {
	private Expert expert;
	private Item item;
	private Photo photo;
}
