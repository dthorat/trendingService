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
	@Column(name="ORDER_HEADER_KEY")
	private String ORDER_HEADER_KEY; 
	private String ORDER_NO;
	@Temporal(TemporalType.DATE)
	private Date  ORDER_DATE; 
	private String ORDER_TYPE; 
	private String ORDER_PURPOSE;
	private Double TOTAL_AMOUNT; 
	private String CURRENCY;
	private String PAYMENT_STATUS;
	
	public Order() {}
	
	public String getORDER_HEADER_KEY() {
		return ORDER_HEADER_KEY;
	}
	public void setORDER_HEADER_KEY(String oRDER_HEADER_KEY) {
		ORDER_HEADER_KEY = oRDER_HEADER_KEY;
	}
	public String getORDER_NO() {
		return ORDER_NO;
	}
	public void setORDER_NO(String oRDER_NO) {
		ORDER_NO = oRDER_NO;
	}
	public Date getORDER_DATE() {
		return ORDER_DATE;
	}
	public void setORDER_DATE(Date oRDER_DATE) {
		ORDER_DATE = oRDER_DATE;
	}
	public String getORDER_TYPE() {
		return ORDER_TYPE;
	}
	public void setORDER_TYPE(String oRDER_TYPE) {
		ORDER_TYPE = oRDER_TYPE;
	}
	public String getORDER_PURPOSE() {
		return ORDER_PURPOSE;
	}
	public void setORDER_PURPOSE(String oRDER_PURPOSE) {
		ORDER_PURPOSE = oRDER_PURPOSE;
	}
	public Double getTOTAL_AMOUNT() {
		return TOTAL_AMOUNT;
	}
	public void setTOTAL_AMOUNT(Double tOTAL_AMOUNT) {
		TOTAL_AMOUNT = tOTAL_AMOUNT;
	}
	public String getCURRENCY() {
		return CURRENCY;
	}
	public void setCURRENCY(String cURRENCY) {
		CURRENCY = cURRENCY;
	}
	public String getPAYMENT_STATUS() {
		return PAYMENT_STATUS;
	}
	public void setPAYMENT_STATUS(String pAYMENT_STATUS) {
		PAYMENT_STATUS = pAYMENT_STATUS;
	}
	@Override
	public String toString() {
		return "Order [ORDER_HEADER_KEY=" + ORDER_HEADER_KEY + ", ORDER_NO=" + ORDER_NO + ", ORDER_DATE=" + ORDER_DATE
				+ ", ORDER_TYPE=" + ORDER_TYPE + ", ORDER_PURPOSE=" + ORDER_PURPOSE + ", TOTAL_AMOUNT=" + TOTAL_AMOUNT
				+ ", CURRENCY=" + CURRENCY + ", PAYMENT_STATUS=" + PAYMENT_STATUS + "]";
	}
	
}