package com.wsi.order.trending.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wsi.order.trending.domain.Order;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {

}
