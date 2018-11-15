package com.wsi.order.trending.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wsi.order.trending.domain.Item;
import com.wsi.order.trending.domain.Order;
import com.wsi.order.trending.repository.ItemRepository;
import com.wsi.order.trending.service.ItemsService;

@RestController
public class TrendingController {

	@Autowired
	private ItemsService itemsService;
	
	@Autowired
	private ItemRepository repository;

    public TrendingController(ItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/trending")
    public List<Item> getTrendingItems() {
        return  repository.findTrendingItemsNative();
    }
    
    private boolean isTrending(Order order) {
        return order != null;
    }
    
    @GetMapping("/item/{itemid}")
    public Item getItemByID(@PathVariable("itemid") String itemid) {
    	/*System.out.println("inside method call.");
    	System.out.println("Item Key = "+itemid);
    	Item item = itemsService.getItemById(itemid);
    	if(item != null) {
    		return item;
    	}
    	else {
    		throw new NullPointerException("No item found");
    	}*/
    	Item item = new Item();
    	item.setCOST_CURRENCY("DOLOR");
    	return item;
    }
}
