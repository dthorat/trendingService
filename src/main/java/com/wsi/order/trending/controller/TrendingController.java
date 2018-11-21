package com.wsi.order.trending.controller;

import java.util.ArrayList;
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

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;
import com.wsi.order.trending.domain.Item;
import com.wsi.order.trending.exceptions.ItemNotFoundException;
import com.wsi.order.trending.service.ItemsService;
import com.wsi.order.trending.vo.ItemVo;
import com.wsi.order.trending.voconverter.ConvertEntityToVo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TrendingController {

	private static final Logger logger = LogManager.getLogger(TrendingController.class);
	
	@Autowired
	private ItemsService itemsService;
	
    @GetMapping("/trending")
    public  ResponseEntity<List<ItemVo>> getTrendingItems() {
    	logger.info("inside getTrendingItems");
    	try {
    		List<Item> itemsList = itemsService.getTrendingItems();
    		List<ItemVo> itemVoList = new ArrayList<>();
    		ConvertEntityToVo convertEntityToVo = new ConvertEntityToVo();
    		if(!itemsList.isEmpty()) {
	    		for(Item item : itemsList) {
	    			
	    			itemVoList.add(convertEntityToVo.convertEntityToVo(item));
	    		}
    		}
        	return new ResponseEntity<>(itemVoList, HttpStatus.OK);
    	}catch(Exception e ) {
    		logger.error(e);
    		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    	}
    }
    
    @GetMapping("/item/{itemid}")
    public ResponseEntity<ItemVo> getItemByID(@PathVariable("itemid") String itemid) {
    	logger.info("inside getItemByID call, Item Key = "+itemid);
    	Item item = itemsService.getItemById(itemid);
    	
    	if(item != null) {
    		ItemVo itemVo;
    		ConvertEntityToVo convertEntityToVo = new ConvertEntityToVo();
    		itemVo = convertEntityToVo.convertEntityToVo(item);
        	
    		return ResponseEntity.ok().body(itemVo);
    	}
    	else {
    		throw new ItemNotFoundException("No item available for the given key.");
    	}

    }
}
