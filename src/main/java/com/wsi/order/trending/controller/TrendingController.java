package com.wsi.order.trending.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wsi.order.trending.domain.Item;
import com.wsi.order.trending.exceptions.ItemNotFoundException;
import com.wsi.order.trending.service.ItemsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TrendingController {

	private static final Logger logger = LogManager.getLogger(TrendingController.class);
	
	@Autowired
	private ItemsService itemsService;

    @GetMapping("/trending")
    public  ResponseEntity<List<Item>> getTrendingItems() {
    	logger.info("inside getTrendingItems");
    	try {
    		List<Item> itemsList = itemsService.getTrendingItems();
        	return new ResponseEntity<>(itemsList, HttpStatus.OK);
    	}catch(Exception e ) {
    		logger.error(e);
    		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    	}
    }
    
    @GetMapping("/item/{itemid}")
    public ResponseEntity<Item> getItemByID(@PathVariable("itemid") String itemid) {
    	logger.info("inside getItemByID call, Item Key = "+itemid);
    	Item item = itemsService.getItemById(itemid);
    	if(item != null) {
    		return ResponseEntity.ok().body(item);
    	}
    	else {
    		throw new ItemNotFoundException("No item available for the given key.");
    	}

    }
}
