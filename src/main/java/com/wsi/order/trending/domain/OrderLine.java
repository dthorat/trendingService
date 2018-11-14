package com.wsi.order.trending.domain;

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
	private String ITEM_KEY; 
	private String ITEM_ID; 
	private String SHORT_DESCRIPTION; 
	private String DESCRIPTION; 
	private String EXTENDED_DESCRIPTION; 
	private Double UNIT_COST; 
	private String COST_CURRENCY; 
	private String MANUFACTURER_NAME; 
	private String MANUFACTURER_ITEM; 
	private String MANUFACTURER_ITEM_DESC; 
	private String ITEM_TYPE; 
	private String STATUS;
	
	public OrderLine() {}
	
	public String getITEM_KEY() {
		return ITEM_KEY;
	}
	public void setITEM_KEY(String iTEM_KEY) {
		ITEM_KEY = iTEM_KEY;
	}
	public String getITEM_ID() {
		return ITEM_ID;
	}
	public void setITEM_ID(String iTEM_ID) {
		ITEM_ID = iTEM_ID;
	}
	public String getSHORT_DESCRIPTION() {
		return SHORT_DESCRIPTION;
	}
	public void setSHORT_DESCRIPTION(String sHORT_DESCRIPTION) {
		SHORT_DESCRIPTION = sHORT_DESCRIPTION;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public String getEXTENDED_DESCRIPTION() {
		return EXTENDED_DESCRIPTION;
	}
	public void setEXTENDED_DESCRIPTION(String eXTENDED_DESCRIPTION) {
		EXTENDED_DESCRIPTION = eXTENDED_DESCRIPTION;
	}
	public Double getUNIT_COST() {
		return UNIT_COST;
	}
	public void setUNIT_COST(Double uNIT_COST) {
		UNIT_COST = uNIT_COST;
	}
	public String getCOST_CURRENCY() {
		return COST_CURRENCY;
	}
	public void setCOST_CURRENCY(String cOST_CURRENCY) {
		COST_CURRENCY = cOST_CURRENCY;
	}
	public String getMANUFACTURER_NAME() {
		return MANUFACTURER_NAME;
	}
	public void setMANUFACTURER_NAME(String mANUFACTURER_NAME) {
		MANUFACTURER_NAME = mANUFACTURER_NAME;
	}
	public String getMANUFACTURER_ITEM() {
		return MANUFACTURER_ITEM;
	}
	public void setMANUFACTURER_ITEM(String mANUFACTURER_ITEM) {
		MANUFACTURER_ITEM = mANUFACTURER_ITEM;
	}
	public String getMANUFACTURER_ITEM_DESC() {
		return MANUFACTURER_ITEM_DESC;
	}
	public void setMANUFACTURER_ITEM_DESC(String mANUFACTURER_ITEM_DESC) {
		MANUFACTURER_ITEM_DESC = mANUFACTURER_ITEM_DESC;
	}
	public String getITEM_TYPE() {
		return ITEM_TYPE;
	}
	public void setITEM_TYPE(String iTEM_TYPE) {
		ITEM_TYPE = iTEM_TYPE;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	@Override
	public String toString() {
		return "OrderLine [ITEM_KEY=" + ITEM_KEY + ", ITEM_ID=" + ITEM_ID + ", SHORT_DESCRIPTION=" + SHORT_DESCRIPTION
				+ ", DESCRIPTION=" + DESCRIPTION + ", EXTENDED_DESCRIPTION=" + EXTENDED_DESCRIPTION + ", UNIT_COST="
				+ UNIT_COST + ", COST_CURRENCY=" + COST_CURRENCY + ", MANUFACTURER_NAME=" + MANUFACTURER_NAME
				+ ", MANUFACTURER_ITEM=" + MANUFACTURER_ITEM + ", MANUFACTURER_ITEM_DESC=" + MANUFACTURER_ITEM_DESC
				+ ", ITEM_TYPE=" + ITEM_TYPE + ", STATUS=" + STATUS + "]";
	}
	
}
