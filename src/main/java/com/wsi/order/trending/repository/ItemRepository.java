package com.wsi.order.trending.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wsi.order.trending.domain.Item;

@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, String> {

	    @Query(nativeQuery = true, name="Item.trendingItems")
	    List<Item> findTrendingItemsNative();
	    
	    @Query(nativeQuery = true, name="Item.allTrendingItems")
	    List<Item> findAllTrendingItems();
	    
	    @Query(nativeQuery = true, value="select * from yfs_item i where i.item_id in ( select trending_item_id from (select ol.item_id as trending_item_id ,count( ol.item_id ) as count " + 
	    		" from YFS_ORDER_HEADER oh join yfs_order_line ol on oh.order_header_key = ol.order_header_key join yfs_item item on item.item_id= ol.item_id " + 
	    		" where oh.order_date > sysdate-90 and oh.customer_zip_code like :zipCodeParam  group by ol.item_id order by count desc) where rownum<=5)")
	    List<Item> findGeoLocationItems(@Param("zipCodeParam") String zipCodeParam);
}
