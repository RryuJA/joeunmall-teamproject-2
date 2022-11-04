package com.javateam.dummyProject.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * 주문정보 VO
 */

public class OrderVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// 주문번호 : ﻿000000_000
	private String orderIndex;
	
	// 고객번호 : 0000000
	private String userIndex;
	
	// 진행상태번호 : STA0
	private String orderStateIndex;
	
	// 결제유형번호 : PAY0
	private String paymentIndex;
	
	// 주문일자
	private Date orderDate;
	
	// 총 금액
	private int orderPrice;
	
	// 수령인
	private String orderName;
	
	// 우편번호
	private String orderPost;
	
	// 주소
	private String orderAddress;
	
	// 상세주소
	private String orderAddressDetail;
	
	// 연락처
	private String orderMobile;
	
	// 배송메시지
	private String orderMessage;
	
	public OrderVO() {
		
	}

	public String getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(String orderIndex) {
		this.orderIndex = orderIndex;
	}

	public String getUserIndex() {
		return userIndex;
	}

	public void setUserIndex(String userIndex) {
		this.userIndex = userIndex;
	}

	public String getOrderStateIndex() {
		return orderStateIndex;
	}

	public void setOrderStateIndex(String orderStateIndex) {
		this.orderStateIndex = orderStateIndex;
	}

	public String getPaymentIndex() {
		return paymentIndex;
	}

	public void setPaymentIndex(String paymentIndex) {
		this.paymentIndex = paymentIndex;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderPost() {
		return orderPost;
	}

	public void setOrderPost(String orderPost) {
		this.orderPost = orderPost;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public String getOrderAddressDetail() {
		return orderAddressDetail;
	}

	public void setOrderAddressDetail(String orderAddressDetail) {
		this.orderAddressDetail = orderAddressDetail;
	}

	public String getOrderMobile() {
		return orderMobile;
	}

	public void setOrderMobile(String orderMobile) {
		this.orderMobile = orderMobile;
	}

	public String getOrderMessage() {
		return orderMessage;
	}

	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
	}
	
	@Override
	public String toString() {
		return "OrderDummyVO [orderIndex=" + orderIndex + ", userIndex=" + userIndex + ", orderStateIndex="
				+ orderStateIndex + ", paymentIndex=" + paymentIndex + ", orderDate=" + orderDate + ", orderPrice="
				+ orderPrice + ", orderName=" + orderName + ", orderPost=" + orderPost + ", orderAddress="
				+ orderAddress + ", orderAddressDetail=" + orderAddressDetail + ", orderMobile=" + orderMobile
				+ ", orderMessage=" + orderMessage + "]";
	}
}
