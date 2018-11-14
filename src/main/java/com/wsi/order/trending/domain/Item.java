package com.wsi.order.trending.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="YFS_ITEM")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String ORDER_LINE_KEY; 
	private String ORDER_HEADER_KEY; 
	private String LINE_TYPE; 
	private String ORDER_CLASS; 
	private String ITEM_ID; 
	private String ALTERNATE_ITEM_ID;
	private String PRODUCT_CLASS; 
	private Double UNIT_PRICE; 
	private String COST_CURRENCY; 
	private Double ORDERED_QT;  
	private Double LINE_TOTAL;
	
	public Item() {}
	
	public String getORDER_LINE_KEY() {
		return ORDER_LINE_KEY;
	}
	public void setORDER_LINE_KEY(String oRDER_LINE_KEY) {
		ORDER_LINE_KEY = oRDER_LINE_KEY;
	}
	public String getORDER_HEADER_KEY() {
		return ORDER_HEADER_KEY;
	}
	public void setORDER_HEADER_KEY(String oRDER_HEADER_KEY) {
		ORDER_HEADER_KEY = oRDER_HEADER_KEY;
	}
	public String getLINE_TYPE() {
		return LINE_TYPE;
	}
	public void setLINE_TYPE(String lINE_TYPE) {
		LINE_TYPE = lINE_TYPE;
	}
	public String getORDER_CLASS() {
		return ORDER_CLASS;
	}
	public void setORDER_CLASS(String oRDER_CLASS) {
		ORDER_CLASS = oRDER_CLASS;
	}
	public String getITEM_ID() {
		return ITEM_ID;
	}
	public void setITEM_ID(String iTEM_ID) {
		ITEM_ID = iTEM_ID;
	}
	public String getALTERNATE_ITEM_ID() {
		return ALTERNATE_ITEM_ID;
	}
	public void setALTERNATE_ITEM_ID(String aLTERNATE_ITEM_ID) {
		ALTERNATE_ITEM_ID = aLTERNATE_ITEM_ID;
	}
	public String getPRODUCT_CLASS() {
		return PRODUCT_CLASS;
	}
	public void setPRODUCT_CLASS(String pRODUCT_CLASS) {
		PRODUCT_CLASS = pRODUCT_CLASS;
	}
	public Double getUNIT_PRICE() {
		return UNIT_PRICE;
	}
	public void setUNIT_PRICE(Double uNIT_PRICE) {
		UNIT_PRICE = uNIT_PRICE;
	}
	public String getCOST_CURRENCY() {
		return COST_CURRENCY;
	}
	public void setCOST_CURRENCY(String cOST_CURRENCY) {
		COST_CURRENCY = cOST_CURRENCY;
	}
	public Double getORDERED_QT() {
		return ORDERED_QT;
	}
	public void setORDERED_QT(Double oRDERED_QT) {
		ORDERED_QT = oRDERED_QT;
	}
	public Double getLINE_TOTAL() {
		return LINE_TOTAL;
	}
	public void setLINE_TOTAL(Double lINE_TOTAL) {
		LINE_TOTAL = lINE_TOTAL;
	}
	@Override
	public String toString() {
		return "Item [ORDER_LINE_KEY=" + ORDER_LINE_KEY + ", ORDER_HEADER_KEY=" + ORDER_HEADER_KEY + ", LINE_TYPE="
				+ LINE_TYPE + ", ORDER_CLASS=" + ORDER_CLASS + ", ITEM_ID=" + ITEM_ID + ", ALTERNATE_ITEM_ID="
				+ ALTERNATE_ITEM_ID + ", PRODUCT_CLASS=" + PRODUCT_CLASS + ", UNIT_PRICE=" + UNIT_PRICE
				+ ", COST_CURRENCY=" + COST_CURRENCY + ", ORDERED_QT=" + ORDERED_QT + ", LINE_TOTAL=" + LINE_TOTAL
				+ "]";
	}
	
}