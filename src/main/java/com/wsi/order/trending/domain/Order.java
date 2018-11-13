package com.wsi.order.trending.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString 
@EqualsAndHashCode
public class Order {
	@Id @GeneratedValue
	Integer id;
	@NonNull
	String name;
	String description;
	List<Item> items;
}
