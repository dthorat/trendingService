package com.wsi.order.trending.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="YFS_ORDER_LINE")
public class OrderLine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "ORDER_LINE_KEY", columnDefinition="CHAR(24) NOT NULL")
	private String oderLineKey; 
	
	@Column(name = "ORDER_HEADER_KEY", columnDefinition="CHAR(24) NOT NULL")
	private String orderHeaderKey; 
	
	@Column(name = "LINE_TYPE")
	private String lineType; 
	
	@Column(name = "ORDER_CLASS")
	private String orderClass; 
	
	@Column(name = "ITEM_ID", columnDefinition="CHAR(40) NOT NULL")
	private String itemId; 
	
	@Column(name = "PRODUCT_CLASS", columnDefinition="CHAR(10) NOT NULL")
	private String productClass; 
	
	@Column(name = "UNIT_PRICE", columnDefinition="NUMBER(19,6) NOT NULL")
	private Double unitPrice; 
	
	@Column(name = "COST_CURRENCY")
	private String costCurrency;
	
	@Column(name = "ORDERED_QTY", columnDefinition="NUMBER(14,4) NOT NULL")
	private Double orderedQty; 
	
	@Column(name = "LINE_TOTAL", columnDefinition="NUMBER(15,2) NOT NULL")
	private Double lineTotal;
	
	@Override
	public String toString() {
		return "Item [ORDER_LINE_KEY=" + oderLineKey + ", ORDER_HEADER_KEY=" + orderHeaderKey + ", LINE_TYPE="
				+ lineType + ", ORDER_CLASS=" + orderClass + ", ITEM_ID=" + itemId  + ", PRODUCT_CLASS=" + productClass + ", UNIT_PRICE=" + unitPrice
				+ ", COST_CURRENCY=" + costCurrency + ", ORDERED_QT=" + orderedQty + ", LINE_TOTAL=" + lineTotal
				+ "]";
	}
	
}
