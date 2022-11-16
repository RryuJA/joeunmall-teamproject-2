package com.javateam.dummyProject.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * 리뷰 VO
 * 
 * @author RJA
 */
public class ReviewVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** (PK)리뷰번호: ﻿00_00_000_REV000 */
	private String reviewIndex;
	
	/** (FK)상품번호: ﻿00_00_000 */
	private String productIndex;
	
	/** (FK)주문번호: 000000_0000000_0 */
	private String orderIndex;
	
	/** 리뷰작성일자 */
	private Date reviewDate;
	
	/** 리뷰내용 */
	private String reviewContent;

	public String getReviewIndex() {
		return reviewIndex;
	}

	public void setReviewIndex(String reviewIndex) {
		this.reviewIndex = reviewIndex;
	}

	public String getProductIndex() {
		return productIndex;
	}

	public void setProductIndex(String productIndex) {
		this.productIndex = productIndex;
	}

	public String getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(String orderIndex) {
		this.orderIndex = orderIndex;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	@Override
	public String toString() {
		return "ReviewVO [reviewIndex=" + reviewIndex + ", productIndex=" + productIndex + ", orderIndex=" + orderIndex
				+ ", reviewDate=" + reviewDate + ", reviewContent=" + reviewContent + "]";
	}
	
}
