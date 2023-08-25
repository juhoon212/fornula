package com.fornula.domain.item.dto.itemPayment;

import com.fornula.domain.expert.dto.Sales;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Purchase;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemPayment {
  private Item item;
 
}
