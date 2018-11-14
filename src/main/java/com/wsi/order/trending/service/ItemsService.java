package com.wsi.order.trending.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsi.order.trending.domain.Item;
import com.wsi.order.trending.repository.ItemsRepository;

@Service
public class ItemsService {

	@Autowired
	ItemsRepository itemsRepository;
	
	public Item getItemById(String itemid) {
		Item items = itemsRepository.findById(itemid).get();
		if(items !=null) {
			System.out.println(items.getITEM_KEY()+"\t"+items.getITEM_ID()+"\t"+items.getDESCRIPTION());
		}
		return items;
	}

}
