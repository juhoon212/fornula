package com.fornula.domain.util.search;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Search {
	private Integer pageNum = 1;
	private Integer pageSize = 6;
	private String keyword = "";
	private String type = "";
	
	public String[] getTypeArr() {
		return type ==null?new String[] {}:type.split("");
	}
}