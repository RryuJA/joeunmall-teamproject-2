package com.javateam.dummyProject.domain;

import java.io.Serializable;

/** 
 * 주문상품정보 VO
 * 
 * @author RJA
 */
public class OrderProductVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** (PK)주문상품번호 : 000000_0000000_0_OR0*/
	private String orderProductIndex;
	
	/** (FK)고객번호 */
	private String userIndex;
	
	/** (FK)상품번호 */
	private String productIndex;
	
	/** (FK)상품옵션 번호 */
	private String productOptionIndex;
	
	/** 상품개수 */
	private int productCount;

	public String getOrderProductIndex() {
		return orderProductIndex;
	}

	public void setOrderProductIndex(String orderProductIndex) {
		this.orderProductIndex = orderProductIndex;
	}

	public String getUserIndex() {
		return userIndex;
	}

	public void setUserIndex(String userIndex) {
		this.userIndex = userIndex;
	}

	public String getProductIndex() {
		return productIndex;
	}

	public void setProductIndex(String productIndex) {
		this.productIndex = productIndex;
	}

	public String getProductOptionIndex() {
		return productOptionIndex;
	}

	public void setProductOptionIndex(String productOptionIndex) {
		this.productOptionIndex = productOptionIndex;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	@Override
	public String toString() {
		return "OrderProductVO [orderProductIndex=" + orderProductIndex + ", userIndex=" + userIndex + ", productIndex="
				+ productIndex + ", productOptionIndex=" + productOptionIndex + ", productCount=" + productCount + "]";
	}
	
}
