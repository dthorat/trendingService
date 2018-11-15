package com.wsi.order.trending.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsi.order.trending.domain.Item;
import com.wsi.order.trending.repository.ItemRepository;

@Service
public class ItemsService {

	@Autowired
	ItemRepository itemsRepository;
	
	public Item getItemById(String itemid) {
		Optional<Item> item = itemsRepository.findById(itemid+"                 ");
		if(!item.isPresent()) {
			return null;
		}
		else
			return item.get();
	}

}
