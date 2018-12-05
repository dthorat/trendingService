package com.wsi.order.trending.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="YFS_ORDER_HEADER")
public class Order {
	
	@Id @GeneratedValue
	@Column(name="ORDER_HEADER_KEY", columnDefinition="CHAR(24) NOT NULL")
	private String orderHeaderKey; 
	
	@Column(name="ORDER_NO")
	private String orderNo ;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ORDER_DATE")
	private Date  orderDate;
	
	@Column(name="ORDER_TYPE")
	private String orderType; 
	
	@Column(name="ORDER_PURPOSE")
	private String orderPurpose;
	
	@Column(name="TOTAL_AMOUNT", columnDefinition="NUMBER(15,2) NOT NULL")
	private Double totalAmount; 
	
	@Column(name="CURRENCY")
	private String currency;
	
	@Column(name="PAYMENT_STATUS")
	private String paymentStatus;
	
	
	/**
	 * @return the orderHeaderKey
	 */
	public String getOrderHeaderKey() {
		return orderHeaderKey;
	}


	/**
	 * @param orderHeaderKey the orderHeaderKey to set
	 */
	public void setOrderHeaderKey(String orderHeaderKey) {
		this.orderHeaderKey = orderHeaderKey;
	}


	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}


	/**
	 * @param orderNo the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}


	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}


	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	
	/**
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}


	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}


	/**
	 * @return the orderPurpose
	 */
	public String getOrderPurpose() {
		return orderPurpose;
	}


	/**
	 * @param orderPurpose the orderPurpose to set
	 */
	public void setOrderPurpose(String orderPurpose) {
		this.orderPurpose = orderPurpose;
	}


	/**
	 * @return the totalAmount
	 */
	public Double getTotalAmount() {
		return totalAmount;
	}


	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}


	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}


	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}


	/**
	 * @return the paymentStatus
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}


	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	@Override
	public String toString() {
		return "Order [ORDER_HEADER_KEY=" + orderHeaderKey + ", ORDER_NO=" + orderNo + ", ORDER_DATE=" + orderDate
				+ ", ORDER_TYPE=" + orderType + ", ORDER_PURPOSE=" + orderPurpose + ", TOTAL_AMOUNT=" + totalAmount
				+ ", CURRENCY=" + currency + ", PAYMENT_STATUS=" + paymentStatus + "]";
	}
	
}