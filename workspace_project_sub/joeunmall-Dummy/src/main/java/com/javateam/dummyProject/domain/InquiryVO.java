package com.javateam.dummyProject.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * 1:1문의 VO
 * 
 * @author RJA
 */
public class InquiryVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** 문의번호 : ﻿000000000 */
	private String inquiryIndex;
	
	/** 고객번호 : ﻿0000000 */
	private String userIndex;
	
	/** 문의일자 */
	private Date inquiryDate;
	
	/** 문의항목 : 상품, 교환/환불 */
	private String inquiryCategory;
	
	/** 문의처리상태 */
	private String inquiryState;
	
	/** 문의제목 */
	private String inquiryTitle;
	
	/** 문의내용 */
	private String inquiryContent;
	
	/** 문의답변 */
	private String inquiryAnswer;

	public String getInquiryIndex() {
		return inquiryIndex;
	}

	public void setInquiryIndex(String inquiryIndex) {
		this.inquiryIndex = inquiryIndex;
	}

	public String getUserIndex() {
		return userIndex;
	}

	public void setUserIndex(String userIndex) {
		this.userIndex = userIndex;
	}

	public Date getInquiryDate() {
		return inquiryDate;
	}

	public void setInquiryDate(Date inquiryDate) {
		this.inquiryDate = inquiryDate;
	}

	public String getInquiryCategory() {
		return inquiryCategory;
	}

	public void setInquiryCategory(String inquiryCategory) {
		this.inquiryCategory = inquiryCategory;
	}

	public String getInquiryState() {
		return inquiryState;
	}

	public void setInquiryState(String inquiryState) {
		this.inquiryState = inquiryState;
	}

	public String getInquiryTitle() {
		return inquiryTitle;
	}

	public void setInquiryTitle(String inquiryTitle) {
		this.inquiryTitle = inquiryTitle;
	}

	public String getInquiryContent() {
		return inquiryContent;
	}

	public void setInquiryContent(String inquiryContent) {
		this.inquiryContent = inquiryContent;
	}

	public String getInquiryAnswer() {
		return inquiryAnswer;
	}

	public void setInquiryAnswer(String inquiryAnswer) {
		this.inquiryAnswer = inquiryAnswer;
	}

	@Override
	public String toString() {
		return "InquiryVO [inquiryIndex=" + inquiryIndex + ", userIndex=" + userIndex + ", inquiryDate=" + inquiryDate
				+ ", inquiryCategory=" + inquiryCategory + ", inquiryState=" + inquiryState + ", inquiryTitle="
				+ inquiryTitle + ", inquiryContent=" + inquiryContent + ", inquiryAnswer=" + inquiryAnswer + "]";
	}

}
