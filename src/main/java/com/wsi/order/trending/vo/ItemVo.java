package com.wsi.order.trending.vo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value= {"itemKey","itemId","shortDesc","description","extendedDesc","unitCost","costCurrency","manufacturerName","manufacturerItem","manufacturerItemDesc","itemType","status","imageUrl"})
public class ItemVo {
	
	private String itemKey;	
	private String itemId;	
	private String shortDesc;	
	private String description;	
	private String extendedDesc;	
	private Double unitCost;	
	private String costCurrency;	
	private String manufacturerName;	
	private String manufacturerItem;	
	private String manufacturerItemDesc;	
	private String itemType;	
	private String status;	
	private String imageUrl;

	
	/**
	 * @return the itemKey
	 */
	public String getItemKey() {
		return itemKey;
	}


	/**
	 * @param itemKey the itemKey to set
	 */
	public void setItemKey(String itemKey) {
		this.itemKey = itemKey;
	}


	/**
	 * @return the itemId
	 */
	public String getItemId() {
		return itemId;
	}


	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	/**
	 * @return the shortDesc
	 */
	public String getShortDesc() {
		return shortDesc;
	}


	/**
	 * @param shortDesc the shortDesc to set
	 */
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the extendedDesc
	 */
	public String getExtendedDesc() {
		return extendedDesc;
	}


	/**
	 * @param extendedDesc the extendedDesc to set
	 */
	public void setExtendedDesc(String extendedDesc) {
		this.extendedDesc = extendedDesc;
	}


	/**
	 * @return the unitCost
	 */
	public Double getUnitCost() {
		return unitCost;
	}


	/**
	 * @param unitCost the unitCost to set
	 */
	public void setUnitCost(Double unitCost) {
		this.unitCost = unitCost;
	}



	/**
	 * @return the costCurrency
	 */
	public String getCostCurrency() {
		return costCurrency;
	}


	/**
	 * @param costCurrency the costCurrency to set
	 */
	public void setCostCurrency(String costCurrency) {
		this.costCurrency = costCurrency;
	}




	/**
	 * @return the manufacturerName
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}




	/**
	 * @param manufacturerName the manufacturerName to set
	 */
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}


	/**
	 * @return the manufacturerItem
	 */
	public String getManufacturerItem() {
		return manufacturerItem;
	}


	/**
	 * @param manufacturerItem the manufacturerItem to set
	 */
	public void setManufacturerItem(String manufacturerItem) {
		this.manufacturerItem = manufacturerItem;
	}


	/**
	 * @return the manufacturerItemDesc
	 */
	public String getManufacturerItemDesc() {
		return manufacturerItemDesc;
	}


	/**
	 * @param manufacturerItemDesc the manufacturerItemDesc to set
	 */
	public void setManufacturerItemDesc(String manufacturerItemDesc) {
		this.manufacturerItemDesc = manufacturerItemDesc;
	}


	/**
	 * @return the itemType
	 */
	public String getItemType() {
		return itemType;
	}


	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}


	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	@Override
	public String toString() {
		return "OrderLine [ITEM_KEY=" + itemKey + ", ITEM_ID=" + itemId + ", SHORT_DESCRIPTION=" + shortDesc
				+ ", DESCRIPTION=" + description + ", EXTENDED_DESCRIPTION=" + extendedDesc + ", UNIT_COST="
				+ unitCost + ", COST_CURRENCY=" + costCurrency + ", MANUFACTURER_NAME=" +manufacturerName
				+ ", MANUFACTURER_ITEM=" + manufacturerItem + ", MANUFACTURER_ITEM_DESC=" + manufacturerItemDesc
				+ ", ITEM_TYPE=" + itemType + ", STATUS=" + status +", IMAGE_URL"+imageUrl+"]";
	}
	
}