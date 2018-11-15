package com.wsi.order.trending.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wsi.order.trending.domain.Item;

@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, String> {

	    @Query(nativeQuery = true, name="Item.trendingItems")
	    List<Item> findTrendingItemsNative();
}
