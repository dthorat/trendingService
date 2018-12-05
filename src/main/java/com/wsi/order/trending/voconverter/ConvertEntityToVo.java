package com.wsi.order.trending.voconverter;

import org.springframework.stereotype.Component;

import com.wsi.order.trending.domain.Item;
import com.wsi.order.trending.vo.ItemVo;

@Component
public class ConvertEntityToVo {
	
	public ItemVo convertEntityToVo(Item item) {
		ItemVo itemVo = new ItemVo();
		
		itemVo.setItemKey(item.getItemKey().trim());
    	itemVo.setCostCurrency(item.getCostCurrency().trim());
    	itemVo.setDescription(item.getDescription().trim());
    	itemVo.setExtendedDesc(item.getExtendedDesc().trim());
    	itemVo.setImageUrl(item.getImageUrl().trim());
    	itemVo.setItemId(item.getItemId().trim());
    	itemVo.setItemType(item.getItemType().trim());
    	itemVo.setManufacturerItem(item.getManufacturerItem().trim());
    	itemVo.setManufacturerItemDesc(item.getManufacturerItemDesc().trim());
    	itemVo.setManufacturerName(item.getManufacturerName().trim());
    	itemVo.setShortDesc(item.getShortDesc().trim());
    	itemVo.setStatus(item.getStatus().trim());
    	itemVo.setUnitCost(item.getUnitCost());
		
		return itemVo;
	}
}
