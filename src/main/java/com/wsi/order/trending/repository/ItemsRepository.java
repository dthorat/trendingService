package com.wsi.order.trending.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wsi.order.trending.domain.Item;

@Repository
public interface ItemsRepository extends JpaRepository<Item, String>{

}
