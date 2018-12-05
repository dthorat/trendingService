package com.wsi.order.trending;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;

import com.wsi.order.trending.domain.Item;
import com.wsi.order.trending.service.ItemsService;

@TestComponent
@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemServiceTest {

	@Autowired
	ItemsService itemsService;
	
	@Before
	public void beforeMethod() {
		System.out.println("Calling before test.");
	}
	
	@Test
	public void testItemNotEqual() {
		Item item = new Item();
		item.setItemKey("KEY-001");
		assertNotEquals("KEY-002                 ",itemsService.getItemById(item.getItemKey()).getItemKey());
	}
	
	@Test
	public void testItemEqual() {
		Item item = new Item();
		item.setItemKey("KEY-001");
		assertEquals("KEY-001                 ",itemsService.getItemById(item.getItemKey()).getItemKey());
	}
	
	@After
	public void afterMethod() {
		System.out.println("Calling After test.");
	}
}
