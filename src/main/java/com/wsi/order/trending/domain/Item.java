package com.wsi.order.trending.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="YFS_ITEM")

@NamedNativeQuery(name = "Item.trendingItems", resultClass= Item.class, query = "select * from yfs_item i where i.item_id in ( select trending_item_id from (select ol.item_id as trending_item_id ,count( ol.item_id ) as count " + 
	"from YFS_ORDER_HEADER oh join yfs_order_line ol on oh.order_header_key = ol.order_header_key join yfs_item item on item.item_id= ol.item_id " + 
	"where oh.order_date > sysdate-15  group by ol.item_id order by count desc) where rownum<=5)")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ITEM_KEY")
	private String itemKey; 
	
	@Column(name = "ITEM_ID")
	private String itemId; 
	
	@Column(name = "SHORT_DESCRIPTION")
	private String shortDesc; 
	
	@Column(name = "DESCRIPTION")
	private String description; 
	
	@Column(name = "EXTENDED_DESCRIPTION")
	private String extendedDesc; 
	
	@Column(name = "UNIT_COST")
	private Double unitCost; 
	
	@Column(name = "COST_CURRENCY")
	private String costCurrency; 
	
	@Column(name = "MANUFACTURER_NAME")
	private String manufacturerName; 
	
	@Column(name = "MANUFACTURER_ITEM")
	private String manufacturerItem; 
	
	@Column(name = "MANUFACTURER_ITEM_DESC")
	private String manufacturerItemDesc; 
	
	@Column(name = "ITEM_TYPE")
	private String itemType; 
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "IMAGE_LOCATION")
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