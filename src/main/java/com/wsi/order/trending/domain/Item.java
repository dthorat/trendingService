package com.wsi.order.trending.domain;

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
public class Item {
	@Id @GeneratedValue
	private Integer id;
	@NonNull
	private String name;
	String description;
	Boolean isAvailable;
	
}