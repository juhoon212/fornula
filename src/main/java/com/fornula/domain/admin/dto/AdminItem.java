package com.fornula.domain.admin.dto;

import java.util.Date;

import lombok.Data;

@Data
public class AdminItem {
	private int itemIdx;
	private int categoryIdx;
	private String itemName;
	private Date itemDate;
}
