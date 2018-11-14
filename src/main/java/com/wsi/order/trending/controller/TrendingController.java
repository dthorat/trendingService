package com.wsi.order.trending.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsi.order.trending.domain.Order;
import com.wsi.order.trending.repository.OrderRepository;

@RestController
public class TrendingController {

	@Autowired
	private OrderRepository repository;

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
}
