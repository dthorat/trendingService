package com.wsi.order.trending.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wsi.order.trending.domain.Item;
import com.wsi.order.trending.domain.Order;
import com.wsi.order.trending.repository.ItemsRepository;
import com.wsi.order.trending.repository.OrderRepository;
import com.wsi.order.trending.service.ItemsService;

@RestController
public class TrendingController {

	@Autowired
	private OrderRepository repository;
	private ItemsService itemsService;
	
    public TrendingController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/trending")
    public List<Order> coolCars() {
        return repository.findAll().stream()
                .filter(this::isTrending)
                .collect(Collectors.toList());
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
