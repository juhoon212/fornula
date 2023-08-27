package com.fornula.domain.admin.dto;

import lombok.Data;

@Data
public class AdminItem {
	private int itemIdx;
	private int categoryIdx;
	private String itemName;
	private String itemDate;
}
